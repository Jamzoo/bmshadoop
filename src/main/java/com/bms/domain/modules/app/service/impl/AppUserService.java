package com.bms.domain.modules.app.service.impl;

import com.bms.domain.common.validator.Assert;
import com.bms.domain.modules.app.service.ServiceSupport;
import com.bms.domain.common.exception.RRException;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;



@Service("appUserService")
public class AppUserService extends ServiceSupport {

    /**
     * 根据手机号查询用户
     * @return
     * @throws Exception
     */
    public HashMap<String,Object> queryByMobile(HashMap<String,Object> param) throws Exception {
        String mobile = param.get("mobile").toString();
        String password = param.get("password").toString();
        HashMap<String,Object> user = findForObject("api.AppUserDao.queryByMobile", mobile);

        Assert.isNull(user, "用户不存在");
        //DigestUtils.md5Hex(password);
        //密码错误
        String userpassword = DigestUtils.sha256Hex(password);
        if(!user.get("password").equals(userpassword)){
            throw new RRException("密码错误");
        }
        return user;
    }

    /**
     * 注册用户
     * @throws Exception
     */
    public void save(HashMap<String,Object> param) throws Exception {
        String password = param.get("password").toString();
        param.put("password",DigestUtils.sha256Hex(password));
        param.put("createTime",new Date());
        insert("api.AppUserDao.save",param);
    }

}
