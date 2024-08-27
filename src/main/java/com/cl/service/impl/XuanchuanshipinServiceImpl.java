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


import com.cl.dao.XuanchuanshipinDao;
import com.cl.entity.XuanchuanshipinEntity;
import com.cl.service.XuanchuanshipinService;
import com.cl.entity.view.XuanchuanshipinView;

@Service("xuanchuanshipinService")
public class XuanchuanshipinServiceImpl extends ServiceImpl<XuanchuanshipinDao, XuanchuanshipinEntity> implements XuanchuanshipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanchuanshipinEntity> page = this.selectPage(
                new Query<XuanchuanshipinEntity>(params).getPage(),
                new EntityWrapper<XuanchuanshipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanchuanshipinEntity> wrapper) {
		  Page<XuanchuanshipinView> page =new Query<XuanchuanshipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XuanchuanshipinView> selectListView(Wrapper<XuanchuanshipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanchuanshipinView selectView(Wrapper<XuanchuanshipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
