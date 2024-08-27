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

import com.cl.entity.HehuangwenhuaEntity;
import com.cl.entity.view.HehuangwenhuaView;

import com.cl.service.HehuangwenhuaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 河湟文化
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/hehuangwenhua")
public class HehuangwenhuaController {
    @Autowired
    private HehuangwenhuaService hehuangwenhuaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HehuangwenhuaEntity hehuangwenhua,
		HttpServletRequest request){
        EntityWrapper<HehuangwenhuaEntity> ew = new EntityWrapper<HehuangwenhuaEntity>();

		PageUtils page = hehuangwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hehuangwenhua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HehuangwenhuaEntity hehuangwenhua, 
		HttpServletRequest request){
        EntityWrapper<HehuangwenhuaEntity> ew = new EntityWrapper<HehuangwenhuaEntity>();

		PageUtils page = hehuangwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hehuangwenhua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HehuangwenhuaEntity hehuangwenhua){
       	EntityWrapper<HehuangwenhuaEntity> ew = new EntityWrapper<HehuangwenhuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hehuangwenhua, "hehuangwenhua")); 
        return R.ok().put("data", hehuangwenhuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HehuangwenhuaEntity hehuangwenhua){
        EntityWrapper< HehuangwenhuaEntity> ew = new EntityWrapper< HehuangwenhuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hehuangwenhua, "hehuangwenhua")); 
		HehuangwenhuaView hehuangwenhuaView =  hehuangwenhuaService.selectView(ew);
		return R.ok("查询河湟文化成功").put("data", hehuangwenhuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HehuangwenhuaEntity hehuangwenhua = hehuangwenhuaService.selectById(id);
		hehuangwenhua.setClicknum(hehuangwenhua.getClicknum()+1);
		hehuangwenhuaService.updateById(hehuangwenhua);
		hehuangwenhua = hehuangwenhuaService.selectView(new EntityWrapper<HehuangwenhuaEntity>().eq("id", id));
        return R.ok().put("data", hehuangwenhua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HehuangwenhuaEntity hehuangwenhua = hehuangwenhuaService.selectById(id);
		hehuangwenhua.setClicknum(hehuangwenhua.getClicknum()+1);
		hehuangwenhuaService.updateById(hehuangwenhua);
		hehuangwenhua = hehuangwenhuaService.selectView(new EntityWrapper<HehuangwenhuaEntity>().eq("id", id));
        return R.ok().put("data", hehuangwenhua);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        HehuangwenhuaEntity hehuangwenhua = hehuangwenhuaService.selectById(id);
        if(type.equals("1")) {
        	hehuangwenhua.setThumbsupnum(hehuangwenhua.getThumbsupnum()+1);
        } else {
        	hehuangwenhua.setCrazilynum(hehuangwenhua.getCrazilynum()+1);
        }
        hehuangwenhuaService.updateById(hehuangwenhua);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HehuangwenhuaEntity hehuangwenhua, HttpServletRequest request){
    	hehuangwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hehuangwenhua);
        hehuangwenhuaService.insert(hehuangwenhua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HehuangwenhuaEntity hehuangwenhua, HttpServletRequest request){
    	hehuangwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hehuangwenhua);
        hehuangwenhuaService.insert(hehuangwenhua);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HehuangwenhuaEntity hehuangwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hehuangwenhua);
        hehuangwenhuaService.updateById(hehuangwenhua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hehuangwenhuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
