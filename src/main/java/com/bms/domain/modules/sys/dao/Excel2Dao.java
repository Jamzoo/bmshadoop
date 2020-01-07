package com.bms.domain.modules.sys.dao;

import com.bms.domain.modules.sys.entity.Excell;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Excel2Dao {
    @Select("SELECT\n" +
            "COLUMN_NAME ,\n" +
            "COLUMN_TYPE ,\n" +
            "IS_NULLABLE ,\n" +
            "COLUMN_DEFAULT ,\n" +
            "COLUMN_KEY ,\n" +
            "COLUMN_COMMENT ,\n" +
            "table_name\n" +
            "FROM\n" +
            "INFORMATION_SCHEMA.COLUMNS\n" +
            "where\n" +
            "table_schema ='hsj'\n" +
            "AND\n" +
            "table_name = #{name}")
    List<Excell> queryFromTables(String name);
    @Select("select table_name from information_schema.tables where table_schema='hsj'")
    List<String> queryTables();
}
