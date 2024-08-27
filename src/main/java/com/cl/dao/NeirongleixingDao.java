package com.cl.dao;

import com.cl.entity.NeirongleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NeirongleixingView;


/**
 * 内容类型
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface NeirongleixingDao extends BaseMapper<NeirongleixingEntity> {
	
	List<NeirongleixingView> selectListView(@Param("ew") Wrapper<NeirongleixingEntity> wrapper);

	List<NeirongleixingView> selectListView(Pagination page,@Param("ew") Wrapper<NeirongleixingEntity> wrapper);
	
	NeirongleixingView selectView(@Param("ew") Wrapper<NeirongleixingEntity> wrapper);
	

}
