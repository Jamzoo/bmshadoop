package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.sys.dao.Excel2Dao;
import com.bms.domain.modules.sys.entity.Excell;
import com.bms.domain.modules.sys.service.Excel2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class Excel2ServiceImpl implements Excel2Service {
    @Autowired
    private Excel2Dao excel2Dao;
    @Override
    public List<Excell> queryFromTables(String name) {
        return excel2Dao.queryFromTables(name);
    }

    @Override
    public List<String> queryTables() {
        return excel2Dao.queryTables();
    }
}
