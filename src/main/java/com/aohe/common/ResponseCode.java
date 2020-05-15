package com.aohe.common;

public enum ResponseCode {
    USERNAME_NOT_EMPTY(1,"用户名不能为空"),
    PASSWORD_NOT_EMPTY(2,"密码不能为空"),
    USERNAME_NOT_EXISTS(3,"用户名不存在"),
    PASSWORD_ERROR(4,"密码错误"),
    EMAIL_NOT_EMPTY(5,"email不能为空"),
    PHONE_NOT_EMPTY(6,"电话不能为空"),
    QUESTION_NOT_EMPTY(7,"问题不能为空"),
    ANSWER_NOT_EMPTY(8,"问题答案不能为空"),
    USERNAME_EXISTS(9,"用户名已存在"),
    PHONE_EXISTS(10,"电话已被注册"),
    EMAIL_EXISTS(11,"email已被注册"),
    PARAMTER_NOT_EMPTY(12,"参数不能为空"),
    REGISTER_FAIL(13,"注册失败"),



    SQL_FAIL(1000,"服务器错误")
    ;


    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
