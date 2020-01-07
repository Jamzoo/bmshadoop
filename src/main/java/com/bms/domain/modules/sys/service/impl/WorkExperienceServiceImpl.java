package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.entity.WorkExperience;
import com.bms.domain.modules.sys.service.WorkExperienceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int deleteFromObject(Object o) {
        return 0;
    }

    @Override
    public int deleteFromList(String[] t) {
        return 0;
    }

    @Override
    public int insert(Object record) {
        return 0;
    }


    @Override
    public Person selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Person> selectAll(Object o) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Object record) {
        return 0;
    }

    @Override
    public int queryTotal(Map t) {
        return 0;
    }


    @Override
    public List<Person> selectAllByPage(Map t) {
        return null;
    }
}
