package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HehuangwenhuaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HehuangwenhuaView;


/**
 * 河湟文化
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface HehuangwenhuaService extends IService<HehuangwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HehuangwenhuaView> selectListView(Wrapper<HehuangwenhuaEntity> wrapper);
   	
   	HehuangwenhuaView selectView(@Param("ew") Wrapper<HehuangwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HehuangwenhuaEntity> wrapper);
   	

}

