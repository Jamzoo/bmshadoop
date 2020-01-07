package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.InternshipDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InternshipDetailMapper extends BaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(InternshipDetail record);

    int insertSelective(InternshipDetail record);

    InternshipDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InternshipDetail record);

    int updateByPrimaryKey(InternshipDetail record);
}