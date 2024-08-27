package com.cl.dao;

import com.cl.entity.DiscussyinletuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyinletuijianView;


/**
 * 音乐推荐评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussyinletuijianDao extends BaseMapper<DiscussyinletuijianEntity> {
	
	List<DiscussyinletuijianView> selectListView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);

	List<DiscussyinletuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	
	DiscussyinletuijianView selectView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	

}
