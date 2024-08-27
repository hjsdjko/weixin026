package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.NeirongleixingDao;
import com.cl.entity.NeirongleixingEntity;
import com.cl.service.NeirongleixingService;
import com.cl.entity.view.NeirongleixingView;

@Service("neirongleixingService")
public class NeirongleixingServiceImpl extends ServiceImpl<NeirongleixingDao, NeirongleixingEntity> implements NeirongleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NeirongleixingEntity> page = this.selectPage(
                new Query<NeirongleixingEntity>(params).getPage(),
                new EntityWrapper<NeirongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NeirongleixingEntity> wrapper) {
		  Page<NeirongleixingView> page =new Query<NeirongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<NeirongleixingView> selectListView(Wrapper<NeirongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NeirongleixingView selectView(Wrapper<NeirongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
