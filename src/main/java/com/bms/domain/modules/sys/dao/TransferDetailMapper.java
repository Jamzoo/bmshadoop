package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.TransferDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransferDetailMapper extends BaseDao<TransferDetail> {
    int deleteByPrimaryKey(Integer recordsId);

    int insert(TransferDetail record);

    int insertSelective(TransferDetail record);

    TransferDetail selectByPrimaryKey(Integer recordsId);

    int updateByPrimaryKeySelective(TransferDetail record);

    int updateByPrimaryKey(TransferDetail record);
}