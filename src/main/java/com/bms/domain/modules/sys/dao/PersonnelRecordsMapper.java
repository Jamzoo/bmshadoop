package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.PersonnelRecords;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonnelRecordsMapper extends BaseDao<PersonnelRecords> {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonnelRecords record);

    int insertSelective(PersonnelRecords record);

    PersonnelRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PersonnelRecords record);

    int updateByPrimaryKey(PersonnelRecords record);
}