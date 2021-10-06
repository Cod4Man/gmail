package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.MemberLoginLog;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:02
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageUtils queryPage(Map<String, Object> params);
}

