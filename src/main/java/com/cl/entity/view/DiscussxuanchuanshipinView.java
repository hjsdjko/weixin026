package com.cl.entity.view;

import com.cl.entity.DiscussxuanchuanshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 宣传视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 20:52:17
 */
@TableName("discussxuanchuanshipin")
public class DiscussxuanchuanshipinView  extends DiscussxuanchuanshipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuanchuanshipinView(){
	}
 
 	public DiscussxuanchuanshipinView(DiscussxuanchuanshipinEntity discussxuanchuanshipinEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuanchuanshipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}