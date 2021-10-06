package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.MemberCollectSubject;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:02
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

