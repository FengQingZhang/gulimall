package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zqf
 * @email zqf@gmail.com
 * @date 2021-11-15 22:39:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
