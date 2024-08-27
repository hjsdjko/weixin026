package com.cl.entity.view;

import com.cl.entity.DianyingtuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 电影推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@TableName("dianyingtuijian")
public class DianyingtuijianView  extends DianyingtuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianyingtuijianView(){
	}
 
 	public DianyingtuijianView(DianyingtuijianEntity dianyingtuijianEntity){
 	try {
			BeanUtils.copyProperties(this, dianyingtuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
