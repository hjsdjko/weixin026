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


import com.cl.dao.HehuangwenhuaDao;
import com.cl.entity.HehuangwenhuaEntity;
import com.cl.service.HehuangwenhuaService;
import com.cl.entity.view.HehuangwenhuaView;

@Service("hehuangwenhuaService")
public class HehuangwenhuaServiceImpl extends ServiceImpl<HehuangwenhuaDao, HehuangwenhuaEntity> implements HehuangwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HehuangwenhuaEntity> page = this.selectPage(
                new Query<HehuangwenhuaEntity>(params).getPage(),
                new EntityWrapper<HehuangwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HehuangwenhuaEntity> wrapper) {
		  Page<HehuangwenhuaView> page =new Query<HehuangwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HehuangwenhuaView> selectListView(Wrapper<HehuangwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HehuangwenhuaView selectView(Wrapper<HehuangwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
