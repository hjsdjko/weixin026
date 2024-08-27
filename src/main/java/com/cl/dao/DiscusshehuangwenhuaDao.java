package com.cl.dao;

import com.cl.entity.DiscusshehuangwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusshehuangwenhuaView;


/**
 * 河湟文化评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface DiscusshehuangwenhuaDao extends BaseMapper<DiscusshehuangwenhuaEntity> {
	
	List<DiscusshehuangwenhuaView> selectListView(@Param("ew") Wrapper<DiscusshehuangwenhuaEntity> wrapper);

	List<DiscusshehuangwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshehuangwenhuaEntity> wrapper);
	
	DiscusshehuangwenhuaView selectView(@Param("ew") Wrapper<DiscusshehuangwenhuaEntity> wrapper);
	

}
