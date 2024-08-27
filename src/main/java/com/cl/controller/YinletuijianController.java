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

import com.cl.entity.YinletuijianEntity;
import com.cl.entity.view.YinletuijianView;

import com.cl.service.YinletuijianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 音乐推荐
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/yinletuijian")
public class YinletuijianController {
    @Autowired
    private YinletuijianService yinletuijianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinletuijianEntity yinletuijian,
		HttpServletRequest request){
        EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();

		PageUtils page = yinletuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinletuijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinletuijianEntity yinletuijian, 
		HttpServletRequest request){
        EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();

		PageUtils page = yinletuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinletuijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinletuijianEntity yinletuijian){
       	EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinletuijian, "yinletuijian")); 
        return R.ok().put("data", yinletuijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinletuijianEntity yinletuijian){
        EntityWrapper< YinletuijianEntity> ew = new EntityWrapper< YinletuijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinletuijian, "yinletuijian")); 
		YinletuijianView yinletuijianView =  yinletuijianService.selectView(ew);
		return R.ok("查询音乐推荐成功").put("data", yinletuijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YinletuijianEntity yinletuijian = yinletuijianService.selectById(id);
		yinletuijian = yinletuijianService.selectView(new EntityWrapper<YinletuijianEntity>().eq("id", id));
        return R.ok().put("data", yinletuijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YinletuijianEntity yinletuijian = yinletuijianService.selectById(id);
		yinletuijian = yinletuijianService.selectView(new EntityWrapper<YinletuijianEntity>().eq("id", id));
        return R.ok().put("data", yinletuijian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        YinletuijianEntity yinletuijian = yinletuijianService.selectById(id);
        if(type.equals("1")) {
        	yinletuijian.setThumbsupnum(yinletuijian.getThumbsupnum()+1);
        } else {
        	yinletuijian.setCrazilynum(yinletuijian.getCrazilynum()+1);
        }
        yinletuijianService.updateById(yinletuijian);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
    	yinletuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinletuijian);
        yinletuijianService.insert(yinletuijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
    	yinletuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinletuijian);
        yinletuijianService.insert(yinletuijian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinletuijian);
        yinletuijianService.updateById(yinletuijian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinletuijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
