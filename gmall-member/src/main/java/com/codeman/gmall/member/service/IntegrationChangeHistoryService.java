package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.IntegrationChangeHistory;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

