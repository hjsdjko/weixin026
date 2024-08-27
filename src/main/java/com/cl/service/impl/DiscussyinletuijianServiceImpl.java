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


import com.cl.dao.DiscussyinletuijianDao;
import com.cl.entity.DiscussyinletuijianEntity;
import com.cl.service.DiscussyinletuijianService;
import com.cl.entity.view.DiscussyinletuijianView;

@Service("discussyinletuijianService")
public class DiscussyinletuijianServiceImpl extends ServiceImpl<DiscussyinletuijianDao, DiscussyinletuijianEntity> implements DiscussyinletuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyinletuijianEntity> page = this.selectPage(
                new Query<DiscussyinletuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussyinletuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyinletuijianEntity> wrapper) {
		  Page<DiscussyinletuijianView> page =new Query<DiscussyinletuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussyinletuijianView> selectListView(Wrapper<DiscussyinletuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyinletuijianView selectView(Wrapper<DiscussyinletuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
