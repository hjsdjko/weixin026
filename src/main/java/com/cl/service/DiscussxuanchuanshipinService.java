package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussxuanchuanshipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussxuanchuanshipinView;


/**
 * 宣传视频评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussxuanchuanshipinService extends IService<DiscussxuanchuanshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuanchuanshipinView> selectListView(Wrapper<DiscussxuanchuanshipinEntity> wrapper);
   	
   	DiscussxuanchuanshipinView selectView(@Param("ew") Wrapper<DiscussxuanchuanshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuanchuanshipinEntity> wrapper);
   	

}

