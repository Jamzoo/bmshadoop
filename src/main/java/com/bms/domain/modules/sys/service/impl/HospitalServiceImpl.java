package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.sys.dao.HospitalMapper;
import com.bms.domain.modules.sys.entity.Hospital;
import com.bms.domain.modules.sys.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hospitalMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteFromObject(Hospital personnelRecords) {
        return hospitalMapper.deleteByPrimaryKey(personnelRecords.getId());
    }

    @Override
    public int deleteFromList(String[] t) {
        return 0;
    }

    @Override
    public int insert(Hospital record) {
        return hospitalMapper.insert(record);
    }

    @Override
    public Hospital selectByPrimaryKey(Integer id) {
        return hospitalMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Hospital> selectAll(Hospital personnelRecords) {
        return hospitalMapper.queryList(personnelRecords);
    }

    @Override
    public List<Hospital> selectAllByPage(Map<String, Object> t) {

        return hospitalMapper.queryByPage(t);
    }

    @Override
    public int updateByPrimaryKey(Hospital record) {
        return hospitalMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int queryTotal(Map<String, Object> t) {
        return hospitalMapper.queryTotal(t);
    }
}
