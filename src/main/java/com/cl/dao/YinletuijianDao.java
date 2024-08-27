package com.cl.dao;

import com.cl.entity.YinletuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YinletuijianView;


/**
 * 音乐推荐
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface YinletuijianDao extends BaseMapper<YinletuijianEntity> {
	
	List<YinletuijianView> selectListView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);

	List<YinletuijianView> selectListView(Pagination page,@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	
	YinletuijianView selectView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	

}
