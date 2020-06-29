package com.ck.springboot.exception;

public class UserNotExist extends RuntimeException {
    public UserNotExist() {
        super("用户不存在！");
    }
}
