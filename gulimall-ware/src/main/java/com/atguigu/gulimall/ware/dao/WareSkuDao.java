package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author ljh
 * @email leojinx624@163.com
 * @date 2023-12-23 22:03:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
