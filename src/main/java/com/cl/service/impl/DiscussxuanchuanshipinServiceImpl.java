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


import com.cl.dao.DiscussxuanchuanshipinDao;
import com.cl.entity.DiscussxuanchuanshipinEntity;
import com.cl.service.DiscussxuanchuanshipinService;
import com.cl.entity.view.DiscussxuanchuanshipinView;

@Service("discussxuanchuanshipinService")
public class DiscussxuanchuanshipinServiceImpl extends ServiceImpl<DiscussxuanchuanshipinDao, DiscussxuanchuanshipinEntity> implements DiscussxuanchuanshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuanchuanshipinEntity> page = this.selectPage(
                new Query<DiscussxuanchuanshipinEntity>(params).getPage(),
                new EntityWrapper<DiscussxuanchuanshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuanchuanshipinEntity> wrapper) {
		  Page<DiscussxuanchuanshipinView> page =new Query<DiscussxuanchuanshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussxuanchuanshipinView> selectListView(Wrapper<DiscussxuanchuanshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuanchuanshipinView selectView(Wrapper<DiscussxuanchuanshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
