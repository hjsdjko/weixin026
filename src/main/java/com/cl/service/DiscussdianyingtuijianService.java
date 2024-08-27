package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussdianyingtuijianEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussdianyingtuijianView;


/**
 * 电影推荐评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
public interface DiscussdianyingtuijianService extends IService<DiscussdianyingtuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianyingtuijianView> selectListView(Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	DiscussdianyingtuijianView selectView(@Param("ew") Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianyingtuijianEntity> wrapper);
   	

}

