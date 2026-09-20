package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 投诉建议
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-07 16:48:49
 */
@TableName("tousujianyi")
public class TousujianyiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TousujianyiEntity() {
		
	}
	
	public TousujianyiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 投诉编号
	 */
					
	private String tousubianhao;
	
	/**
	 * 投诉标题
	 */
					
	private String tousubiaoti;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 投诉内容
	 */
					
	private String tousuneirong;
	
	/**
	 * 投诉时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tousushijian;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投诉编号
	 */
	public void setTousubianhao(String tousubianhao) {
		this.tousubianhao = tousubianhao;
	}
	/**
	 * 获取：投诉编号
	 */
	public String getTousubianhao() {
		return tousubianhao;
	}
	/**
	 * 设置：投诉标题
	 */
	public void setTousubiaoti(String tousubiaoti) {
		this.tousubiaoti = tousubiaoti;
	}
	/**
	 * 获取：投诉标题
	 */
	public String getTousubiaoti() {
		return tousubiaoti;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：投诉内容
	 */
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
	/**
	 * 设置：投诉时间
	 */
	public void setTousushijian(Date tousushijian) {
		this.tousushijian = tousushijian;
	}
	/**
	 * 获取：投诉时间
	 */
	public Date getTousushijian() {
		return tousushijian;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
