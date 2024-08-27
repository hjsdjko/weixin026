package com.cl.dao;

import com.cl.entity.HehuangwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HehuangwenhuaView;


/**
 * 河湟文化
 * 
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface HehuangwenhuaDao extends BaseMapper<HehuangwenhuaEntity> {
	
	List<HehuangwenhuaView> selectListView(@Param("ew") Wrapper<HehuangwenhuaEntity> wrapper);

	List<HehuangwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<HehuangwenhuaEntity> wrapper);
	
	HehuangwenhuaView selectView(@Param("ew") Wrapper<HehuangwenhuaEntity> wrapper);
	

}
