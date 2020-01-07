package com.bms.domain.modules.sys.service;

import com.bms.domain.modules.app.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserEntity queryObject(Long userId);

    List<UserEntity> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(UserEntity userEntity);

    void save(String mobile, String password);

    void update(UserEntity user);

    void delete(Long userId);

    void deleteBatch(Long[] userIds);

    UserEntity queryByMobile(String mobile);

    Map<String, String> login(String mobile, String password);

    public Map<String,String> getUser();
}
