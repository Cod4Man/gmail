package com.codeman.gmall.coupon.mapper;

import com.codeman.gmall.coupon.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:37:32
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubject> {
	
}
