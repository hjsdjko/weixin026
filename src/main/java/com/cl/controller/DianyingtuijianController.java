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

import com.cl.entity.DianyingtuijianEntity;
import com.cl.entity.view.DianyingtuijianView;

import com.cl.service.DianyingtuijianService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 电影推荐
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/dianyingtuijian")
public class DianyingtuijianController {
    @Autowired
    private DianyingtuijianService dianyingtuijianService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianyingtuijianEntity dianyingtuijian,
		HttpServletRequest request){
        EntityWrapper<DianyingtuijianEntity> ew = new EntityWrapper<DianyingtuijianEntity>();

		PageUtils page = dianyingtuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianyingtuijian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianyingtuijianEntity dianyingtuijian, 
		HttpServletRequest request){
        EntityWrapper<DianyingtuijianEntity> ew = new EntityWrapper<DianyingtuijianEntity>();

		PageUtils page = dianyingtuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianyingtuijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianyingtuijianEntity dianyingtuijian){
       	EntityWrapper<DianyingtuijianEntity> ew = new EntityWrapper<DianyingtuijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianyingtuijian, "dianyingtuijian")); 
        return R.ok().put("data", dianyingtuijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianyingtuijianEntity dianyingtuijian){
        EntityWrapper< DianyingtuijianEntity> ew = new EntityWrapper< DianyingtuijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianyingtuijian, "dianyingtuijian")); 
		DianyingtuijianView dianyingtuijianView =  dianyingtuijianService.selectView(ew);
		return R.ok("查询电影推荐成功").put("data", dianyingtuijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianyingtuijianEntity dianyingtuijian = dianyingtuijianService.selectById(id);
		dianyingtuijian = dianyingtuijianService.selectView(new EntityWrapper<DianyingtuijianEntity>().eq("id", id));
        return R.ok().put("data", dianyingtuijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianyingtuijianEntity dianyingtuijian = dianyingtuijianService.selectById(id);
		dianyingtuijian = dianyingtuijianService.selectView(new EntityWrapper<DianyingtuijianEntity>().eq("id", id));
        return R.ok().put("data", dianyingtuijian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        DianyingtuijianEntity dianyingtuijian = dianyingtuijianService.selectById(id);
        if(type.equals("1")) {
        	dianyingtuijian.setThumbsupnum(dianyingtuijian.getThumbsupnum()+1);
        } else {
        	dianyingtuijian.setCrazilynum(dianyingtuijian.getCrazilynum()+1);
        }
        dianyingtuijianService.updateById(dianyingtuijian);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianyingtuijianEntity dianyingtuijian, HttpServletRequest request){
    	dianyingtuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianyingtuijian);
        dianyingtuijianService.insert(dianyingtuijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianyingtuijianEntity dianyingtuijian, HttpServletRequest request){
    	dianyingtuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianyingtuijian);
        dianyingtuijianService.insert(dianyingtuijian);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DianyingtuijianEntity dianyingtuijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianyingtuijian);
        dianyingtuijianService.updateById(dianyingtuijian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianyingtuijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
