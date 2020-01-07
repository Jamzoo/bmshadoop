package com.bms.domain.modules.sys.controller;

import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.entity.TransferDetail;
import com.bms.domain.modules.sys.service.TransferDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transferDetail")
public class TransferDetailController {

    @Autowired
    private TransferDetailService transferDetailService;

    @PostMapping("/findAll")
    //  @ResponseBody
    public List<TransferDetail> selectAll(TransferDetail person) {
        return null;
    }

    @PostMapping("/findAllByPage")
    public List<TransferDetail> findAllByPage() {
        Map<String, Object> t = new HashMap<String, Object>();
        t.put("limit",10);
        t.put("offset",1);
        return transferDetailService.selectAllByPage(t);
    }

    @PostMapping("/batchesDelete")
    public int deleteFromList(String[] str) {
        return 0;
    }

    @PostMapping("/deleteOne")
    public int deleteFromObject(TransferDetail person) {
        return 0;
    }

    @PostMapping("/insert")
    public int insert(TransferDetail record) {
        return 0;
    }

    @PostMapping("/findDetail")
    public TransferDetail selectDetail(Integer id) {
        return null;
    }

    @PostMapping("/updateDetail")
    public int updateDetail(TransferDetail record) {
        return 0;
    }
}
