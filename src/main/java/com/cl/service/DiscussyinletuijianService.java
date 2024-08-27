package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussyinletuijianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyinletuijianView;


/**
 * 音乐推荐评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussyinletuijianService extends IService<DiscussyinletuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinletuijianView> selectListView(Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	DiscussyinletuijianView selectView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinletuijianEntity> wrapper);
   	

}

