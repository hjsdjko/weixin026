package com.cl.entity.view;

import com.cl.entity.NeirongleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 内容类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@TableName("neirongleixing")
public class NeirongleixingView  extends NeirongleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NeirongleixingView(){
	}
 
 	public NeirongleixingView(NeirongleixingEntity neirongleixingEntity){
 	try {
			BeanUtils.copyProperties(this, neirongleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
