package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.MemberLevel;

import java.util.Map;

/**
 * 会员等级
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:02
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageUtils queryPage(Map<String, Object> params);
}

