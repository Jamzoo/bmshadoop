package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.RotateDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RotateDetailMapper extends BaseDao {
    int deleteByPrimaryKey(Integer recordsId);

    int insert(RotateDetail record);

    int insertSelective(RotateDetail record);

    RotateDetail selectByPrimaryKey(Integer recordsId);

    int updateByPrimaryKeySelective(RotateDetail record);

    int updateByPrimaryKey(RotateDetail record);
}