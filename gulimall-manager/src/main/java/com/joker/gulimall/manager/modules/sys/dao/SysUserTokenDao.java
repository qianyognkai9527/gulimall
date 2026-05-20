

package com.joker.gulimall.manager.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joker.gulimall.manager.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author Joker
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
