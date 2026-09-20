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
 * 租金信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@TableName("zujinxinxi")
public class ZujinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZujinxinxiEntity() {
		
	}
	
	public ZujinxinxiEntity(T t) {
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
	 * 商铺名称
	 */
					
	private String shangpumingcheng;
	
	/**
	 * 商铺地址
	 */
					
	private String shangpudizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 面积㎡
	 */
					
	private Double dianpumianji;
	
	/**
	 * 租金费用
	 */
					
	private Double zujinfeiyong;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 费用状态
	 */
					
	private String feiyongzhuangtai;
	
	/**
	 * 房东账号
	 */
					
	private String fangdongzhanghao;
	
	/**
	 * 房东姓名
	 */
					
	private String fangdongxingming;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 租金详情
	 */
					
	private String zujinxiangqing;
	
	
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
	 * 设置：商铺名称
	 */
	public void setShangpumingcheng(String shangpumingcheng) {
		this.shangpumingcheng = shangpumingcheng;
	}
	/**
	 * 获取：商铺名称
	 */
	public String getShangpumingcheng() {
		return shangpumingcheng;
	}
	/**
	 * 设置：商铺地址
	 */
	public void setShangpudizhi(String shangpudizhi) {
		this.shangpudizhi = shangpudizhi;
	}
	/**
	 * 获取：商铺地址
	 */
	public String getShangpudizhi() {
		return shangpudizhi;
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
	 * 设置：面积㎡
	 */
	public void setDianpumianji(Double dianpumianji) {
		this.dianpumianji = dianpumianji;
	}
	/**
	 * 获取：面积㎡
	 */
	public Double getDianpumianji() {
		return dianpumianji;
	}
	/**
	 * 设置：租金费用
	 */
	public void setZujinfeiyong(Double zujinfeiyong) {
		this.zujinfeiyong = zujinfeiyong;
	}
	/**
	 * 获取：租金费用
	 */
	public Double getZujinfeiyong() {
		return zujinfeiyong;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：费用状态
	 */
	public void setFeiyongzhuangtai(String feiyongzhuangtai) {
		this.feiyongzhuangtai = feiyongzhuangtai;
	}
	/**
	 * 获取：费用状态
	 */
	public String getFeiyongzhuangtai() {
		return feiyongzhuangtai;
	}
	/**
	 * 设置：房东账号
	 */
	public void setFangdongzhanghao(String fangdongzhanghao) {
		this.fangdongzhanghao = fangdongzhanghao;
	}
	/**
	 * 获取：房东账号
	 */
	public String getFangdongzhanghao() {
		return fangdongzhanghao;
	}
	/**
	 * 设置：房东姓名
	 */
	public void setFangdongxingming(String fangdongxingming) {
		this.fangdongxingming = fangdongxingming;
	}
	/**
	 * 获取：房东姓名
	 */
	public String getFangdongxingming() {
		return fangdongxingming;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号
	 */
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
	/**
	 * 设置：租金详情
	 */
	public void setZujinxiangqing(String zujinxiangqing) {
		this.zujinxiangqing = zujinxiangqing;
	}
	/**
	 * 获取：租金详情
	 */
	public String getZujinxiangqing() {
		return zujinxiangqing;
	}

}
