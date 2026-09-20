package com.entity.view;

import com.entity.TuizushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 退租申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@TableName("tuizushenqing")
public class TuizushenqingView  extends TuizushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuizushenqingView(){
	}
 
 	public TuizushenqingView(TuizushenqingEntity tuizushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, tuizushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
