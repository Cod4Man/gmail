package com.codeman.gmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.member.entity.MemberReceiveAddress;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:02
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageUtils queryPage(Map<String, Object> params);
}

