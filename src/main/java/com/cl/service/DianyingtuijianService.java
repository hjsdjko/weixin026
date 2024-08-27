package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DianyingtuijianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DianyingtuijianView;


/**
 * 电影推荐
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface DianyingtuijianService extends IService<DianyingtuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingtuijianView> selectListView(Wrapper<DianyingtuijianEntity> wrapper);
   	
   	DianyingtuijianView selectView(@Param("ew") Wrapper<DianyingtuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingtuijianEntity> wrapper);
   	

}

