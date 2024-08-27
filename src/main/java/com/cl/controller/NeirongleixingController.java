package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.NeirongleixingEntity;
import com.cl.entity.view.NeirongleixingView;

import com.cl.service.NeirongleixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 内容类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/neirongleixing")
public class NeirongleixingController {
    @Autowired
    private NeirongleixingService neirongleixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NeirongleixingEntity neirongleixing,
		HttpServletRequest request){
        EntityWrapper<NeirongleixingEntity> ew = new EntityWrapper<NeirongleixingEntity>();

		PageUtils page = neirongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, neirongleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NeirongleixingEntity neirongleixing, 
		HttpServletRequest request){
        EntityWrapper<NeirongleixingEntity> ew = new EntityWrapper<NeirongleixingEntity>();

		PageUtils page = neirongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, neirongleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NeirongleixingEntity neirongleixing){
       	EntityWrapper<NeirongleixingEntity> ew = new EntityWrapper<NeirongleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( neirongleixing, "neirongleixing")); 
        return R.ok().put("data", neirongleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NeirongleixingEntity neirongleixing){
        EntityWrapper< NeirongleixingEntity> ew = new EntityWrapper< NeirongleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( neirongleixing, "neirongleixing")); 
		NeirongleixingView neirongleixingView =  neirongleixingService.selectView(ew);
		return R.ok("查询内容类型成功").put("data", neirongleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NeirongleixingEntity neirongleixing = neirongleixingService.selectById(id);
		neirongleixing = neirongleixingService.selectView(new EntityWrapper<NeirongleixingEntity>().eq("id", id));
        return R.ok().put("data", neirongleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NeirongleixingEntity neirongleixing = neirongleixingService.selectById(id);
		neirongleixing = neirongleixingService.selectView(new EntityWrapper<NeirongleixingEntity>().eq("id", id));
        return R.ok().put("data", neirongleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NeirongleixingEntity neirongleixing, HttpServletRequest request){
    	neirongleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(neirongleixing);
        neirongleixingService.insert(neirongleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NeirongleixingEntity neirongleixing, HttpServletRequest request){
    	neirongleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(neirongleixing);
        neirongleixingService.insert(neirongleixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody NeirongleixingEntity neirongleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(neirongleixing);
        neirongleixingService.updateById(neirongleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        neirongleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
