package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author cjb
 * @email 834502257@qq.com
 * @date 2020-07-09 14:09:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
