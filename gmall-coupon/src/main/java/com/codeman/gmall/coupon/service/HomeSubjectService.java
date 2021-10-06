package com.codeman.gmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codeman.common.utils.PageUtils;
import com.codeman.gmall.coupon.entity.HomeSubject;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
public interface HomeSubjectService extends IService<HomeSubject> {

    PageUtils queryPage(Map<String, Object> params);
}

