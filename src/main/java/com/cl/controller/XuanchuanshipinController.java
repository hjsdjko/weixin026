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

import com.cl.entity.XuanchuanshipinEntity;
import com.cl.entity.view.XuanchuanshipinView;

import com.cl.service.XuanchuanshipinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 宣传视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/xuanchuanshipin")
public class XuanchuanshipinController {
    @Autowired
    private XuanchuanshipinService xuanchuanshipinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuanchuanshipinEntity xuanchuanshipin,
		HttpServletRequest request){
        EntityWrapper<XuanchuanshipinEntity> ew = new EntityWrapper<XuanchuanshipinEntity>();

		PageUtils page = xuanchuanshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuanchuanshipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuanchuanshipinEntity xuanchuanshipin, 
		HttpServletRequest request){
        EntityWrapper<XuanchuanshipinEntity> ew = new EntityWrapper<XuanchuanshipinEntity>();

		PageUtils page = xuanchuanshipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuanchuanshipin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuanchuanshipinEntity xuanchuanshipin){
       	EntityWrapper<XuanchuanshipinEntity> ew = new EntityWrapper<XuanchuanshipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuanchuanshipin, "xuanchuanshipin")); 
        return R.ok().put("data", xuanchuanshipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuanchuanshipinEntity xuanchuanshipin){
        EntityWrapper< XuanchuanshipinEntity> ew = new EntityWrapper< XuanchuanshipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuanchuanshipin, "xuanchuanshipin")); 
		XuanchuanshipinView xuanchuanshipinView =  xuanchuanshipinService.selectView(ew);
		return R.ok("查询宣传视频成功").put("data", xuanchuanshipinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuanchuanshipinEntity xuanchuanshipin = xuanchuanshipinService.selectById(id);
		xuanchuanshipin = xuanchuanshipinService.selectView(new EntityWrapper<XuanchuanshipinEntity>().eq("id", id));
        return R.ok().put("data", xuanchuanshipin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuanchuanshipinEntity xuanchuanshipin = xuanchuanshipinService.selectById(id);
		xuanchuanshipin = xuanchuanshipinService.selectView(new EntityWrapper<XuanchuanshipinEntity>().eq("id", id));
        return R.ok().put("data", xuanchuanshipin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XuanchuanshipinEntity xuanchuanshipin = xuanchuanshipinService.selectById(id);
        if(type.equals("1")) {
        	xuanchuanshipin.setThumbsupnum(xuanchuanshipin.getThumbsupnum()+1);
        } else {
        	xuanchuanshipin.setCrazilynum(xuanchuanshipin.getCrazilynum()+1);
        }
        xuanchuanshipinService.updateById(xuanchuanshipin);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuanchuanshipinEntity xuanchuanshipin, HttpServletRequest request){
    	xuanchuanshipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuanchuanshipin);
        xuanchuanshipinService.insert(xuanchuanshipin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuanchuanshipinEntity xuanchuanshipin, HttpServletRequest request){
    	xuanchuanshipin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuanchuanshipin);
        xuanchuanshipinService.insert(xuanchuanshipin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuanchuanshipinEntity xuanchuanshipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuanchuanshipin);
        xuanchuanshipinService.updateById(xuanchuanshipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuanchuanshipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
