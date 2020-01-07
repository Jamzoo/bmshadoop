package com.bms.domain.modules.sys.service;

import com.bms.domain.modules.sys.entity.Excell;

import java.util.List;

public interface Excel2Service {
    List<Excell> queryFromTables(String name);
    List<String> queryTables();
}
