package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.NeirongleixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.NeirongleixingView;


/**
 * 内容类型
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface NeirongleixingService extends IService<NeirongleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NeirongleixingView> selectListView(Wrapper<NeirongleixingEntity> wrapper);
   	
   	NeirongleixingView selectView(@Param("ew") Wrapper<NeirongleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NeirongleixingEntity> wrapper);
   	

}

