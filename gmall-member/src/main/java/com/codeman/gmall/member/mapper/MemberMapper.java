package com.codeman.gmall.member.mapper;

import com.codeman.gmall.member.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author 张鸿杰
 * @email 
 * @date 2021-10-06 15:49:01
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {
	
}
