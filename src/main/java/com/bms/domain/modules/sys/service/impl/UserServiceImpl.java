package com.bms.domain.modules.sys.service.impl;

import com.bms.domain.modules.app.entity.UserEntity;
import com.bms.domain.modules.sys.dao.PersonMapper;
import com.bms.domain.modules.sys.dao.UserDao;
import com.bms.domain.modules.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private PersonMapper personDao;

    @Override
    public UserEntity queryObject(Long userId) {
        return null;
    }

    @Override
    public List<UserEntity> queryList(Map<String, Object> map) {
        return null;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return 0;
    }

    @Override
    public void save(UserEntity userEntity) {

    }

    @Override
    public void save(String mobile, String password) {

    }

    @Override
    public void update(UserEntity user) {

    }

    @Override
    public void delete(Long userId) {

    }

    @Override
    public void deleteBatch(Long[] userIds) {

    }

    @Override
    public UserEntity queryByMobile(String mobile) {
        return null;
    }

    @Override
    public Map<String, String> login(String mobile, String password) {
        HashMap<String,String> user = new HashMap<String,String>();
        user.put("mobile",mobile);
        user.put("password",password);
        return userDao.login(user);
    }

    @Override
    public Map<String, String> getUser() {
        System.out.println(personDao.queryList(new HashMap<>()));
        return userDao.select();
    }
}
