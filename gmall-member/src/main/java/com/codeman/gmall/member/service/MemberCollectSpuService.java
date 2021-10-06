package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.MemberCollectSpu;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}

