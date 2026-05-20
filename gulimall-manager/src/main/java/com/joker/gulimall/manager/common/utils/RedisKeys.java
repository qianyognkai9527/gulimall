

package com.joker.gulimall.manager.common.utils;

/**
 * Redis所有Keys
 *
 * @author Joker
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
