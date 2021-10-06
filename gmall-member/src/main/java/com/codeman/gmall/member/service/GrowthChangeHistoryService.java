package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.GrowthChangeHistory;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}

