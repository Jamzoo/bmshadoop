package com.bms.domain.modules.sys.controller;

import com.bms.domain.common.utils.R;
import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.service.Excel2Service;
import com.bms.domain.modules.sys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/findAll")
    //  @ResponseBody
    public List<Person> selectAll(Person person) {
        return personService.selectAll(person);
    }

    @PostMapping("/findAllByPage")
    public R findAllByPage() {
        Map<String, Object> t = new HashMap<String, Object>();
        t.put("limit",10);
        t.put("offset",1);
        List<Person> lp=personService.selectAllByPage(t);

        return R.ok().put("list",lp);
    }

    @PostMapping("/batchesDelete")
    public int deleteFromList(String[] str) {
        return personService.deleteFromList(str);
    }

    @PostMapping("/deleteOne")
    public int deleteFromObject(Person person) {
        return personService.deleteFromObject(person);
    }

    @PostMapping("/insert")
    public int insert(Person person) {
        return personService.insert(person);
    }

    @PostMapping("/findDetail")
    public Person selectDetail(Integer id) {
        return personService.selectByPrimaryKey(id);
    }

    @PostMapping("/updateDetail")
    public int updateDetail(Person person) {
        return personService.updateByPrimaryKey(person);
    }
}
