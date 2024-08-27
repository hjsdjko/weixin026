package com.cl.entity.view;

import com.cl.entity.YinletuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 音乐推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@TableName("yinletuijian")
public class YinletuijianView  extends YinletuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinletuijianView(){
	}
 
 	public YinletuijianView(YinletuijianEntity yinletuijianEntity){
 	try {
			BeanUtils.copyProperties(this, yinletuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
