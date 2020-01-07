package com.bms.domain.modules.app.controller;

import com.bms.domain.common.exception.RRException;
import com.bms.domain.common.utils.AppBaseResult;
import com.bms.domain.common.validator.Assert;
import com.bms.domain.modules.app.utils.JwtUtils;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.HashMap;
import com.bms.domain.modules.app.service.impl.AppUserService;
import java.util.Map;

/**
 * APP登录授权
 *
 * @author czx
 * @email object_czx@163.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/app")
public class ApiLoginController {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    @Resource(name = "appUserService")
    private AppUserService appUserService;
    @Autowired
    private JwtUtils jwtUtils;


    @PostMapping("login")
    public AppBaseResult login( String mobile,String password) throws Exception {
        HashMap<String,Object> pd =new HashMap<String,Object>();
        pd.put("mobile",mobile);
        pd.put("password",password);
        logger.info("用户登录",pd);
       // HashMap<String,Object> pd = new Gson().fromJson(UserEntity,HashMap.class);
        System.out.println(pd);
        Assert.isNull(pd.get("mobile"), "手机号不能为空");
        Assert.isNull(pd.get("password"), "密码不能为空");
        if (!Assert.checkCellphone(pd.get("mobile").toString())){
            throw new RRException("请输入正确的手机号");
        }

        //用户登录
        HashMap<String,Object> user = appUserService.queryByMobile(pd);
        System.out.println(user.get("user_id"));
        //生成token
        String token = jwtUtils.generateToken(user.get("user_id"));
        System.out.println(user.get("user_id"));
        user.put("token", token);
        user.put("expire", jwtUtils.getExpire());
        AppBaseResult rs= AppBaseResult.success().setData(user);
        System.out.println(rs);
      // System.out.println(new AppBaseResult().decryptData(rs.getData()));
        return rs;
    }

}
