package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ljh
 * @email leojinx624@163.com
 * @date 2023-12-23 20:10:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
