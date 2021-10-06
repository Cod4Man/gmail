package com.codeman.gmall.product.mapper;

import com.codeman.gmall.product.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:55:15
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
	
}
