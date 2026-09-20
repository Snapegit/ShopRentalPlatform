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

import com.entity.TuizushenqingEntity;
import com.entity.view.TuizushenqingView;

import com.service.TuizushenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 退租申请
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@RestController
@RequestMapping("/tuizushenqing")
public class TuizushenqingController {
    @Autowired
    private TuizushenqingService tuizushenqingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TuizushenqingEntity tuizushenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangdong")) {
			tuizushenqing.setFangdongzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zuke")) {
			tuizushenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<TuizushenqingEntity> ew = new EntityWrapper<TuizushenqingEntity>();

		PageUtils page = tuizushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuizushenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TuizushenqingEntity tuizushenqing, 
		HttpServletRequest request){
        EntityWrapper<TuizushenqingEntity> ew = new EntityWrapper<TuizushenqingEntity>();

		PageUtils page = tuizushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tuizushenqing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TuizushenqingEntity tuizushenqing){
       	EntityWrapper<TuizushenqingEntity> ew = new EntityWrapper<TuizushenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tuizushenqing, "tuizushenqing")); 
        return R.ok().put("data", tuizushenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TuizushenqingEntity tuizushenqing){
        EntityWrapper< TuizushenqingEntity> ew = new EntityWrapper< TuizushenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tuizushenqing, "tuizushenqing")); 
		TuizushenqingView tuizushenqingView =  tuizushenqingService.selectView(ew);
		return R.ok("查询退租申请成功").put("data", tuizushenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TuizushenqingEntity tuizushenqing = tuizushenqingService.selectById(id);
        return R.ok().put("data", tuizushenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TuizushenqingEntity tuizushenqing = tuizushenqingService.selectById(id);
        return R.ok().put("data", tuizushenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TuizushenqingEntity tuizushenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuizushenqing);
        tuizushenqingService.insert(tuizushenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TuizushenqingEntity tuizushenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(tuizushenqing);
        tuizushenqingService.insert(tuizushenqing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TuizushenqingEntity tuizushenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tuizushenqing);
        tuizushenqingService.updateById(tuizushenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<TuizushenqingEntity> list = new ArrayList<TuizushenqingEntity>();
        for(Long id : ids) {
            TuizushenqingEntity tuizushenqing = tuizushenqingService.selectById(id);
            tuizushenqing.setSfsh(sfsh);
            tuizushenqing.setShhf(shhf);
            list.add(tuizushenqing);
        }
        tuizushenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tuizushenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
