package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.WorkExperience;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkExperienceMapper extends BaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    WorkExperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkExperience record);

    int updateByPrimaryKey(WorkExperience record);
}