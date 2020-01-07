package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int deleteFromObject(Person person) {
        return 0;
    }

    @Override
    public int deleteFromList(String[] t) {
        return 0;
    }

    @Override
    public int insert(Person record) {
        return 0;
    }

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Person> selectAll(Person person) {
        return null;
    }

    @Override
    public List<Person> selectAllByPage(Map<String, Object> t) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return 0;
    }

    @Override
    public int queryTotal(Map<String, Object> t) {
        return 0;
    }
}
