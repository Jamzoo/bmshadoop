package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.LeaveDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveDetailMapper extends BaseDao {
    int deleteByPrimaryKey(Integer recordsId);

    int insert(LeaveDetail record);

    int insertSelective(LeaveDetail record);

    LeaveDetail selectByPrimaryKey(Integer recordsId);

    int updateByPrimaryKeySelective(LeaveDetail record);

    int updateByPrimaryKey(LeaveDetail record);
}