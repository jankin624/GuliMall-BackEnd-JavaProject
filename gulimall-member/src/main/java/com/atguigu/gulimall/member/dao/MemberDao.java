package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ljh
 * @email leojinx624@163.com
 * @date 2023-12-23 22:02:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
