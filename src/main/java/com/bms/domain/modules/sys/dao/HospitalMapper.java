package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.Hospital;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HospitalMapper extends BaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}