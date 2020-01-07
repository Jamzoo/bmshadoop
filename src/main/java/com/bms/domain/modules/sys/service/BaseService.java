package com.bms.domain.modules.sys.service;

import com.bms.domain.modules.sys.entity.Person;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    int deleteByPrimaryKey(Integer id);

    int deleteFromObject(T t);
    int deleteFromList(String[] t);

    int insert(T record);

    T selectByPrimaryKey(Integer id);

    List<T> selectAll(T t);

    List<T> selectAllByPage(Map<String,Object> t);

    int updateByPrimaryKey(T record);
    int queryTotal(Map<String,Object> t);
}
