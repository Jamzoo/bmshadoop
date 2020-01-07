package com.bms.domain.modules.sys.controller;

import com.bms.domain.common.utils.ExcelUtils;
import com.bms.domain.modules.sys.dao.UserDao;
import com.bms.domain.modules.sys.entity.Excell;
import com.bms.domain.modules.sys.service.Excel2Service;
import com.bms.domain.modules.sys.service.UserService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/people")
public class TestController {
    @Autowired
    private Excel2Service excel2Service;
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    //  @ResponseBody
    public String getPerson() {
        System.out.println(userService.getUser().toString());
        return "web";
        // ...
    }
    @GetMapping("/excel")
    public void testExcel2(HttpServletResponse response) {
        //查询出需要导出的数据
       // List<Excell> lisx = excel2Service.queryFromTables();
        //创建报表数据头
        List<String> head = new ArrayList<>();
        head.add("列名");
        head.add("数据类型");
        head.add("是否为空");
        head.add("默认值");
        head.add("扩展属性");
        head.add("备注");
        // head.add("备注");
        //创建报表体
        String fileName = "数据字典.xls";
        HSSFWorkbook excel = new HSSFWorkbook();
        List<String> ll=excel2Service.queryTables();
        for (int i = 0; i < ll.size(); i++) {
            List<Excell> lisx = excel2Service.queryFromTables(ll.get(i)+"");
            List<List<String>> body = new ArrayList<>();
            for (Excell stu : lisx) {
                List<String> bodyValue = new ArrayList<>();
                bodyValue.add(String.valueOf(stu.getCOLUMN_NAME()));
                bodyValue.add(stu.getCOLUMN_TYPE());
                bodyValue.add(stu.getIS_NULLABLE());

                bodyValue.add(String.valueOf(stu.getCOLUMN_DEFAULT()));
                //  bodyValue.add(stu.getCOLUMN_KEY());
                if ("PRI".equals(stu.getCOLUMN_KEY())) {
                    bodyValue.add("主键");
                } else if ("MUL".equals(stu.getCOLUMN_KEY())) {
                    bodyValue.add("索引");
                }else{
                    bodyValue.add("");
                }
                bodyValue.add(stu.getCOLUMN_COMMENT());
                //将数据添加到报表体中
                body.add(bodyValue);
            }
            excel = ExcelUtils.expExcel(excel,lisx.get(0).getTable_name(),head, body);
        }
        ExcelUtils.outFile(excel, "./" + fileName, response);
    }
}