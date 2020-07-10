package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author cjb
 * @email 834502257@qq.com
 * @date 2020-07-10 09:15:30
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
