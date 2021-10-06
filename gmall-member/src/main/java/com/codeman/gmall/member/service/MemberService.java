package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.Member;

import java.util.Map;

/**
 * 会员
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
public interface MemberService extends IService<Member> {

    PageUtils queryPage(Map<String, Object> params);
}

