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

import com.cl.entity.DiscusshehuangwenhuaEntity;
import com.cl.entity.view.DiscusshehuangwenhuaView;

import com.cl.service.DiscusshehuangwenhuaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 河湟文化评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@RestController
@RequestMapping("/discusshehuangwenhua")
public class DiscusshehuangwenhuaController {
    @Autowired
    private DiscusshehuangwenhuaService discusshehuangwenhuaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusshehuangwenhuaEntity discusshehuangwenhua,
		HttpServletRequest request){
        EntityWrapper<DiscusshehuangwenhuaEntity> ew = new EntityWrapper<DiscusshehuangwenhuaEntity>();

		PageUtils page = discusshehuangwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshehuangwenhua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusshehuangwenhuaEntity discusshehuangwenhua, 
		HttpServletRequest request){
        EntityWrapper<DiscusshehuangwenhuaEntity> ew = new EntityWrapper<DiscusshehuangwenhuaEntity>();

		PageUtils page = discusshehuangwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshehuangwenhua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusshehuangwenhuaEntity discusshehuangwenhua){
       	EntityWrapper<DiscusshehuangwenhuaEntity> ew = new EntityWrapper<DiscusshehuangwenhuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusshehuangwenhua, "discusshehuangwenhua")); 
        return R.ok().put("data", discusshehuangwenhuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusshehuangwenhuaEntity discusshehuangwenhua){
        EntityWrapper< DiscusshehuangwenhuaEntity> ew = new EntityWrapper< DiscusshehuangwenhuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusshehuangwenhua, "discusshehuangwenhua")); 
		DiscusshehuangwenhuaView discusshehuangwenhuaView =  discusshehuangwenhuaService.selectView(ew);
		return R.ok("查询河湟文化评论表成功").put("data", discusshehuangwenhuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusshehuangwenhuaEntity discusshehuangwenhua = discusshehuangwenhuaService.selectById(id);
		discusshehuangwenhua = discusshehuangwenhuaService.selectView(new EntityWrapper<DiscusshehuangwenhuaEntity>().eq("id", id));
        return R.ok().put("data", discusshehuangwenhua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusshehuangwenhuaEntity discusshehuangwenhua = discusshehuangwenhuaService.selectById(id);
		discusshehuangwenhua = discusshehuangwenhuaService.selectView(new EntityWrapper<DiscusshehuangwenhuaEntity>().eq("id", id));
        return R.ok().put("data", discusshehuangwenhua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusshehuangwenhuaEntity discusshehuangwenhua, HttpServletRequest request){
    	discusshehuangwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshehuangwenhua);
        discusshehuangwenhuaService.insert(discusshehuangwenhua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusshehuangwenhuaEntity discusshehuangwenhua, HttpServletRequest request){
    	discusshehuangwenhua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusshehuangwenhua);
        discusshehuangwenhuaService.insert(discusshehuangwenhua);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscusshehuangwenhuaEntity discusshehuangwenhua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusshehuangwenhua);
        discusshehuangwenhuaService.updateById(discusshehuangwenhua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusshehuangwenhuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscusshehuangwenhuaEntity discusshehuangwenhua, HttpServletRequest request,String pre){
        EntityWrapper<DiscusshehuangwenhuaEntity> ew = new EntityWrapper<DiscusshehuangwenhuaEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discusshehuangwenhuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshehuangwenhua), params), params));
        return R.ok().put("data", page);
    }








}
