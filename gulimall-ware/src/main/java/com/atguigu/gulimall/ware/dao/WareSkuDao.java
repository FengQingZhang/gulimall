package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zqf
 * @email zqf@gmail.com
 * @date 2021-11-15 23:09:59
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
