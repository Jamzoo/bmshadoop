package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.InformationWorkers;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InformationWorkersMapper extends BaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(InformationWorkers record);

    int insertSelective(InformationWorkers record);

    InformationWorkers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InformationWorkers record);

    int updateByPrimaryKey(InformationWorkers record);
}