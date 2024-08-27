package com.cl.dao;

import com.cl.entity.DianyingtuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DianyingtuijianView;


/**
 * 电影推荐
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface DianyingtuijianDao extends BaseMapper<DianyingtuijianEntity> {
	
	List<DianyingtuijianView> selectListView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);

	List<DianyingtuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	
	DianyingtuijianView selectView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
	

}
