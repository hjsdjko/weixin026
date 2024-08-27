package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusshehuangwenhuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusshehuangwenhuaView;


/**
 * 河湟文化评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface DiscusshehuangwenhuaService extends IService<DiscusshehuangwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshehuangwenhuaView> selectListView(Wrapper<DiscusshehuangwenhuaEntity> wrapper);
   	
   	DiscusshehuangwenhuaView selectView(@Param("ew") Wrapper<DiscusshehuangwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshehuangwenhuaEntity> wrapper);
   	

}

