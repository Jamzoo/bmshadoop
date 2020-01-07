package com.bms.domain.modules.sys.controller;


import com.bms.domain.modules.sys.entity.WorkExperience;
import com.bms.domain.modules.sys.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workExperience")
public class WorkExperienceController {

    @Autowired
    private WorkExperienceService workExperienceService;

    @PostMapping("/findAll")
    //  @ResponseBody
    public List<WorkExperience> selectAll(WorkExperience person) {
        return workExperienceService.selectAll(person);
    }

    @PostMapping("/findAllByPage")
    public List<WorkExperience> findAllByPage() {
        Map<String, Object> t = new HashMap<String, Object>();
        t.put("limit",10);
        t.put("offset",1);
        return workExperienceService.selectAllByPage(t);
    }

    @PostMapping("/batchesDelete")
    public int deleteFromList(String[] str) {
        return 0;
    }

    @PostMapping("/deleteOne")
    public int deleteFromObject(WorkExperience person) {
        return 0;
    }

    @PostMapping("/insert")
    public int insert(WorkExperience record) {
        return 0;
    }

    @PostMapping("/findDetail")
    public WorkExperience selectDetail(Integer id) {
        return null;
    }

    @PostMapping("/updateDetail")
    public int updateDetail(WorkExperience record) {
        return 0;
    }
}
