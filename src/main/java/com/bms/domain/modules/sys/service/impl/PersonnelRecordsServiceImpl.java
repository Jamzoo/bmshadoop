package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.sys.dao.PersonnelRecordsMapper;
import com.bms.domain.modules.sys.dao.UserDao;
import com.bms.domain.modules.sys.entity.Person;
import com.bms.domain.modules.sys.entity.PersonnelRecords;
import com.bms.domain.modules.sys.service.PersonnelRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class PersonnelRecordsServiceImpl implements PersonnelRecordsService {

    @Autowired
    private PersonnelRecordsMapper personnelRecordsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return personnelRecordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteFromObject(PersonnelRecords personnelRecords) {
        return personnelRecordsMapper.deleteByPrimaryKey(personnelRecords.getId());
    }

    @Override
    public int deleteFromList(String[] t) {
        return 0;
    }

    @Override
    public int insert(PersonnelRecords record) {
        record.setCreateTime(new Date().getTime());
        return personnelRecordsMapper.insert(record);
    }

    @Override
    public PersonnelRecords selectByPrimaryKey(Integer id) {
        return personnelRecordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PersonnelRecords> selectAll(PersonnelRecords personnelRecords) {
        return personnelRecordsMapper.queryList(personnelRecords);
    }

    @Override
    public List<PersonnelRecords> selectAllByPage(Map<String, Object> t) {

        return personnelRecordsMapper.queryByPage(t);
    }

    @Override
    public int updateByPrimaryKey(PersonnelRecords record) {
        return personnelRecordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int queryTotal(Map<String, Object> t) {
        return 0;
    }
}
