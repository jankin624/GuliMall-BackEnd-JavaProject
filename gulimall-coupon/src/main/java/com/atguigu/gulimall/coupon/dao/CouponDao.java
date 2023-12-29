package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ljh
 * @email leojinx624@163.com
 * @date 2023-12-23 20:12:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
