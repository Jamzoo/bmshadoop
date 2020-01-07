package com.bms.domain.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface UserDao {

   // @Select("select * from TB_user")
    Map<String,String> select();

    Map<String,String> login(Map<String,String> user);
}

