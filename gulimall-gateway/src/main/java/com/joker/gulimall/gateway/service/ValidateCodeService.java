package com.joker.gulimall.gateway.service;


import com.joker.gulimall.common.exception.CaptchaException;
import com.joker.gulimall.common.web.domain.AjaxResult;

import java.io.IOException;

/**
 * 验证码处理
 *
 * @author share
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
