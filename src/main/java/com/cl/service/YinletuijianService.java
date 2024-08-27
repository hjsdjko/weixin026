package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YinletuijianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YinletuijianView;


/**
 * 音乐推荐
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface YinletuijianService extends IService<YinletuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinletuijianView> selectListView(Wrapper<YinletuijianEntity> wrapper);
   	
   	YinletuijianView selectView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinletuijianEntity> wrapper);
   	

}

