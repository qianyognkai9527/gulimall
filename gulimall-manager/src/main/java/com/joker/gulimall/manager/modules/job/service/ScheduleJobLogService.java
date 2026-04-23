

package com.joker.gulimall.manager.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.joker.gulimall.manager.common.utils.PageUtils;
import com.joker.gulimall.manager.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
