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
 * 店铺信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@TableName("dianpuxinxi")
public class DianpuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianpuxinxiEntity() {
		
	}
	
	public DianpuxinxiEntity(T t) {
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
	 * 租金
	 */
					
	private Double zujin;
	
	/**
	 * 朝向
	 */
					
	private String chaoxiang;
	
	/**
	 * 店铺状态
	 */
					
	private String dianpuzhuangtai;
	
	/**
	 * 周边环境
	 */
					
	private String zhoubianhuanjing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 房东账号
	 */
					
	private String fangdongzhanghao;
	
	/**
	 * 房东姓名
	 */
					
	private String fangdongxingming;
	
	/**
	 * 手机号
	 */
					
	private String shoujihao;
	
	/**
	 * 店铺介绍
	 */
					
	private String dianpujieshao;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：租金
	 */
	public void setZujin(Double zujin) {
		this.zujin = zujin;
	}
	/**
	 * 获取：租金
	 */
	public Double getZujin() {
		return zujin;
	}
	/**
	 * 设置：朝向
	 */
	public void setChaoxiang(String chaoxiang) {
		this.chaoxiang = chaoxiang;
	}
	/**
	 * 获取：朝向
	 */
	public String getChaoxiang() {
		return chaoxiang;
	}
	/**
	 * 设置：店铺状态
	 */
	public void setDianpuzhuangtai(String dianpuzhuangtai) {
		this.dianpuzhuangtai = dianpuzhuangtai;
	}
	/**
	 * 获取：店铺状态
	 */
	public String getDianpuzhuangtai() {
		return dianpuzhuangtai;
	}
	/**
	 * 设置：周边环境
	 */
	public void setZhoubianhuanjing(String zhoubianhuanjing) {
		this.zhoubianhuanjing = zhoubianhuanjing;
	}
	/**
	 * 获取：周边环境
	 */
	public String getZhoubianhuanjing() {
		return zhoubianhuanjing;
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
	 * 设置：店铺介绍
	 */
	public void setDianpujieshao(String dianpujieshao) {
		this.dianpujieshao = dianpujieshao;
	}
	/**
	 * 获取：店铺介绍
	 */
	public String getDianpujieshao() {
		return dianpujieshao;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
