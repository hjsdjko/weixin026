package com.cl.dao;

import com.cl.entity.XuanchuanshipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuanchuanshipinView;


/**
 * 宣传视频
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface XuanchuanshipinDao extends BaseMapper<XuanchuanshipinEntity> {
	
	List<XuanchuanshipinView> selectListView(@Param("ew") Wrapper<XuanchuanshipinEntity> wrapper);

	List<XuanchuanshipinView> selectListView(Pagination page,@Param("ew") Wrapper<XuanchuanshipinEntity> wrapper);
	
	XuanchuanshipinView selectView(@Param("ew") Wrapper<XuanchuanshipinEntity> wrapper);
	

}
