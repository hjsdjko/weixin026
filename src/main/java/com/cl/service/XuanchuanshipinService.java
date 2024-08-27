package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XuanchuanshipinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XuanchuanshipinView;


/**
 * 宣传视频
 *
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
public interface XuanchuanshipinService extends IService<XuanchuanshipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanchuanshipinView> selectListView(Wrapper<XuanchuanshipinEntity> wrapper);
   	
   	XuanchuanshipinView selectView(@Param("ew") Wrapper<XuanchuanshipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanchuanshipinEntity> wrapper);
   	

}

