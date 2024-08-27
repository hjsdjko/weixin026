package com.cl.dao;

import com.cl.entity.DiscussxuanchuanshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxuanchuanshipinView;


/**
 * 宣传视频评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussxuanchuanshipinDao extends BaseMapper<DiscussxuanchuanshipinEntity> {
	
	List<DiscussxuanchuanshipinView> selectListView(@Param("ew") Wrapper<DiscussxuanchuanshipinEntity> wrapper);

	List<DiscussxuanchuanshipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuanchuanshipinEntity> wrapper);
	
	DiscussxuanchuanshipinView selectView(@Param("ew") Wrapper<DiscussxuanchuanshipinEntity> wrapper);
	

}
