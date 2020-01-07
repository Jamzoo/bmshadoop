package com.bms.domain.modules.sys.controller;

import com.bms.domain.common.utils.R;
import com.bms.domain.modules.sys.entity.Hospital;
import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/findAll")
    //  @ResponseBody
    public List<Hospital> selectAll(Hospital hospital) {
        return hospitalService.selectAll(hospital);
    }

    @PostMapping("/findAllByPage")
    public R findAllByPage() {
        Map<String, Object> t = new HashMap<String, Object>();
        t.put("limit",10);
        t.put("offset",1);
        List<Hospital> lp=hospitalService.selectAllByPage(t);
        int total=hospitalService.queryTotal(t);
        return R.ok().put("list",lp);
    }

    @PostMapping("/batchesDelete")
    public int deleteFromList(String[] str) {
        return hospitalService.deleteFromList(str);
    }

    @PostMapping("/deleteOne")
    public int deleteFromObject(Hospital hospital) {
        return hospitalService.deleteFromObject(hospital);
    }

    @PostMapping("/insert")
    public int insert(Hospital hospital) {
        return hospitalService.insert(hospital);
    }

    @PostMapping("/findDetail")
    public Hospital selectDetail(Integer id) {
        return hospitalService.selectByPrimaryKey(id);
    }

    @PostMapping("/updateDetail")
    public int updateDetail(Hospital hospital) {
        return hospitalService.updateByPrimaryKey(hospital);
    }
}
