package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cjb
 * @email 834502257@qq.com
 * @date 2020-07-10 09:35:55
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
