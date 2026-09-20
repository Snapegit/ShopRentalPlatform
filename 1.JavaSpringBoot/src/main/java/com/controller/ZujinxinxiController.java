package com.controller;

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

import com.utils.ValidatorUtils;
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
import com.annotation.IgnoreAuth;

import com.entity.ZujinxinxiEntity;
import com.entity.view.ZujinxinxiView;

import com.service.ZujinxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 租金信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@RestController
@RequestMapping("/zujinxinxi")
public class ZujinxinxiController {
    @Autowired
    private ZujinxinxiService zujinxinxiService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZujinxinxiEntity zujinxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangdong")) {
			zujinxinxi.setFangdongzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zuke")) {
			zujinxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZujinxinxiEntity> ew = new EntityWrapper<ZujinxinxiEntity>();

		PageUtils page = zujinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zujinxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZujinxinxiEntity zujinxinxi, 
		HttpServletRequest request){
        EntityWrapper<ZujinxinxiEntity> ew = new EntityWrapper<ZujinxinxiEntity>();

		PageUtils page = zujinxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zujinxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZujinxinxiEntity zujinxinxi){
       	EntityWrapper<ZujinxinxiEntity> ew = new EntityWrapper<ZujinxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zujinxinxi, "zujinxinxi")); 
        return R.ok().put("data", zujinxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZujinxinxiEntity zujinxinxi){
        EntityWrapper< ZujinxinxiEntity> ew = new EntityWrapper< ZujinxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zujinxinxi, "zujinxinxi")); 
		ZujinxinxiView zujinxinxiView =  zujinxinxiService.selectView(ew);
		return R.ok("查询租金信息成功").put("data", zujinxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZujinxinxiEntity zujinxinxi = zujinxinxiService.selectById(id);
        return R.ok().put("data", zujinxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZujinxinxiEntity zujinxinxi = zujinxinxiService.selectById(id);
        return R.ok().put("data", zujinxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZujinxinxiEntity zujinxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zujinxinxi);
        zujinxinxiService.insert(zujinxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZujinxinxiEntity zujinxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(zujinxinxi);
        zujinxinxiService.insert(zujinxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZujinxinxiEntity zujinxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zujinxinxi);
        zujinxinxiService.updateById(zujinxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zujinxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
