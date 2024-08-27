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


import com.cl.dao.DiscusshehuangwenhuaDao;
import com.cl.entity.DiscusshehuangwenhuaEntity;
import com.cl.service.DiscusshehuangwenhuaService;
import com.cl.entity.view.DiscusshehuangwenhuaView;

@Service("discusshehuangwenhuaService")
public class DiscusshehuangwenhuaServiceImpl extends ServiceImpl<DiscusshehuangwenhuaDao, DiscusshehuangwenhuaEntity> implements DiscusshehuangwenhuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshehuangwenhuaEntity> page = this.selectPage(
                new Query<DiscusshehuangwenhuaEntity>(params).getPage(),
                new EntityWrapper<DiscusshehuangwenhuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshehuangwenhuaEntity> wrapper) {
		  Page<DiscusshehuangwenhuaView> page =new Query<DiscusshehuangwenhuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusshehuangwenhuaView> selectListView(Wrapper<DiscusshehuangwenhuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshehuangwenhuaView selectView(Wrapper<DiscusshehuangwenhuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
