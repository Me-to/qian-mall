package com.qian.mall.member.dao;

import com.qian.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangqian
 * @email 694656210@qq.com
 * @date 2020-09-19 13:59:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
