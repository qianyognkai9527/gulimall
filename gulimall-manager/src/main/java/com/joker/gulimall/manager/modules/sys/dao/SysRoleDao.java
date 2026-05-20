

package com.joker.gulimall.manager.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.joker.gulimall.manager.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 *
 * @author Joker
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
