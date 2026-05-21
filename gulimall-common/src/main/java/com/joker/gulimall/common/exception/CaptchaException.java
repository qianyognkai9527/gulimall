package com.joker.gulimall.common.exception;

/**
 * 验证码错误异常类
 *
 * @author share
 */
public class CaptchaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg) {
        super(msg);
    }
}
