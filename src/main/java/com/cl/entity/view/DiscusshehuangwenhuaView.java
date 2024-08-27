package com.cl.entity.view;

import com.cl.entity.DiscusshehuangwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 河湟文化评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 20:52:16
 */
@TableName("discusshehuangwenhua")
public class DiscusshehuangwenhuaView  extends DiscusshehuangwenhuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshehuangwenhuaView(){
	}
 
 	public DiscusshehuangwenhuaView(DiscusshehuangwenhuaEntity discusshehuangwenhuaEntity){
 	try {
			BeanUtils.copyProperties(this, discusshehuangwenhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
