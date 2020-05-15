package com.aohe.service;

import com.aohe.pojo.User;
import com.aohe.utils.ServerResponse;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IUserService {

    public ServerResponse loginLogic(String username,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;
    public ServerResponse registerLogic(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
