package com.bms.domain.modules.sys.controller;

import com.bms.domain.common.exception.RRException;
import com.bms.domain.common.utils.R;
import com.bms.domain.modules.sys.entity.PersonnelRecords;
import com.bms.domain.modules.sys.service.PersonnelRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/personnelRecords")
public class PersonnelRecordsController {

    @Autowired
    private PersonnelRecordsService personnelRecordsService;

    @PostMapping("/findAll")
    //  @ResponseBody
    public List<PersonnelRecords> selectAll(PersonnelRecords person) {
        return null;
    }

    @PostMapping("/findAllByPage")
    public R findAllByPage(@RequestParam(name="page",defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size,@RequestParam(required = true)String name){
       // System.out.println(t);
        Map<String, Object> t = new HashMap<String, Object>();
        List<PersonnelRecords> list=null;
        t.put("limit",size);
        t.put("offset",(page-1)*size);
        list=personnelRecordsService.selectAllByPage(t);
        return R.ok().put("list",list);
    }

    @PostMapping("/batchesDelete")
    public int deleteFromList(String[] str) {
        return 0;
    }

    @PostMapping("/deleteOne")
    public int deleteFromObject(PersonnelRecords person) {
        return 0;
    }

    @PostMapping("/insert")
    public int insert(PersonnelRecords record) {
        System.out.println(record);
        return personnelRecordsService.insert(record);
    }

    @PostMapping("/findDetail")
    public PersonnelRecords selectDetail(Integer id) {
        return null;
    }

    @PostMapping("/updateDetail")
    public int updateDetail(PersonnelRecords record) {
        return 0;
    }
}
