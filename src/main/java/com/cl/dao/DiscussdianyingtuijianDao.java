package com.cl.dao;

import com.cl.entity.DiscussdianyingtuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussdianyingtuijianView;


/**
 * 电影推荐评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussdianyingtuijianDao extends BaseMapper<DiscussdianyingtuijianEntity> {
	
	List<DiscussdianyingtuijianView> selectListView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);

	List<DiscussdianyingtuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	
	DiscussdianyingtuijianView selectView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
	

}
