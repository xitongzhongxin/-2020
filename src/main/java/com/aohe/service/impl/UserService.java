package com.aohe.service.impl;

import com.aohe.common.Const;
import com.aohe.common.ResponseCode;
import com.aohe.dao.UserMapper;
import com.aohe.pojo.User;
import com.aohe.service.IUserService;
import com.aohe.utils.DateUtil;
import com.aohe.utils.ServerResponse;
import com.aohe.vo.UserVO;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public ServerResponse loginLogic(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //入参校验
        if (StringUtils.isBlank(username)){//null length=0 含有空格 tab制表符
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(),ResponseCode.USERNAME_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(password)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(),ResponseCode.PASSWORD_NOT_EMPTY.getMsg());
        }

        Integer count = userMapper.selectByUserName(username);
        if (count==null||count==0){
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EXISTS.getCode(),ResponseCode.USERNAME_NOT_EXISTS.getMsg());
        }

        User user = userMapper.selectByUserNameAndPassword(username, EncodeByMD5(password));
        if (user==null){
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_ERROR.getCode(),ResponseCode.PASSWORD_ERROR.getMsg());
        }else {
            return ServerResponse.createServerResponseBySuccess( convertUserToUserVO(user));
        }
    }

    @Override
    public ServerResponse registerLogic(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        //入参校验
        if (user==null){
            return ServerResponse.createServerResponseByFail(ResponseCode.PARAMTER_NOT_EMPTY.getCode(),ResponseCode.PARAMTER_NOT_EMPTY.getMsg());
        }
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String phone = user.getPhone();
        String question = user.getQuestion();
        String answer = user.getAnswer();

        //入参校验
        if (StringUtils.isBlank(username)){
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_NOT_EMPTY.getCode(),ResponseCode.USERNAME_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(password)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PASSWORD_NOT_EMPTY.getCode(),ResponseCode.PASSWORD_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(email)){
            return ServerResponse.createServerResponseByFail(ResponseCode.EMAIL_NOT_EMPTY.getCode(),ResponseCode.EMAIL_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(phone)){
            return ServerResponse.createServerResponseByFail(ResponseCode.PHONE_NOT_EMPTY.getCode(),ResponseCode.PHONE_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(question)){
            return ServerResponse.createServerResponseByFail(ResponseCode.QUESTION_NOT_EMPTY.getCode(),ResponseCode.QUESTION_NOT_EMPTY.getMsg());
        }
        if (StringUtils.isBlank(answer)){
            return ServerResponse.createServerResponseByFail(ResponseCode.ANSWER_NOT_EMPTY.getCode(),ResponseCode.ANSWER_NOT_EMPTY.getMsg());
        }

        Integer countUsername = userMapper.selectByUserName(username);
        if (countUsername!=null&&countUsername>0){
            return ServerResponse.createServerResponseByFail(ResponseCode.USERNAME_EXISTS.getCode(),ResponseCode.USERNAME_EXISTS.getMsg());
        }
        Integer countPhone = userMapper.selectByPhone(phone);
        if (countPhone!=null&&countPhone>0){
            return ServerResponse.createServerResponseByFail(ResponseCode.PHONE_EXISTS.getCode(),ResponseCode.PHONE_EXISTS.getMsg());
        }
        Integer countEmail = userMapper.selectByEmail(email);
        if (countEmail!=null&&countEmail>0){
            return ServerResponse.createServerResponseByFail(ResponseCode.EMAIL_EXISTS.getCode(),ResponseCode.EMAIL_EXISTS.getMsg());
        }
        user.setPassword(EncodeByMD5(password));
        user.setRole(Const.NORMAL_USER);
        int insert = userMapper.insert(user);
        if (insert>0){
            return ServerResponse.createServerResponseBySuccess();
        }else {
            return ServerResponse.createServerResponseByFail(ResponseCode.REGISTER_FAIL.getCode(),ResponseCode.REGISTER_FAIL.getMsg());
        }

    }

    public String EncodeByMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //加密字符串
        String encode = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        return encode;
    }
    public UserVO convertUserToUserVO(User user) {
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        userVO.setCreateTime(DateUtil.date2String(user.getCreateTime()));
        userVO.setUpdateTime(DateUtil.date2String(user.getUpdateTime()));
        return userVO;
    }
}
