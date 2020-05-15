package com.aohe.controller;

import com.alibaba.druid.util.StringUtils;
import com.aohe.common.Const;
import com.aohe.common.ResponseCode;
import com.aohe.pojo.User;
import com.aohe.service.IUserService;
import com.aohe.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@RestController
@RequestMapping(value = "/portal/")
public class UserController {

    @Autowired
    IUserService userService;

    //登录
    @RequestMapping(value = "user/login.do")
    public ServerResponse login(@RequestParam("username")String username, @RequestParam("password")String password, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ServerResponse serverResponse = userService.loginLogic(username, password);
        if (serverResponse.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,serverResponse.getData());
        }
        return serverResponse;
    }

    //注册
    @RequestMapping(value = "user/register.do")
    public ServerResponse register(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ServerResponse serverResponse = userService.registerLogic(user);
        return serverResponse;
    }
    public String EncodeByMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //加密字符串
        String encode = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        return encode;
    }
}
