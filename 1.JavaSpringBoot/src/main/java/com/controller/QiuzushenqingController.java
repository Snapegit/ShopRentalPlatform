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

import com.entity.QiuzushenqingEntity;
import com.entity.view.QiuzushenqingView;

import com.service.QiuzushenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 求租申请
 * 后端接口
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
@RestController
@RequestMapping("/qiuzushenqing")
public class QiuzushenqingController {
    @Autowired
    private QiuzushenqingService qiuzushenqingService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QiuzushenqingEntity qiuzushenqing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangdong")) {
			qiuzushenqing.setFangdongzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zuke")) {
			qiuzushenqing.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QiuzushenqingEntity> ew = new EntityWrapper<QiuzushenqingEntity>();

		PageUtils page = qiuzushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuzushenqing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QiuzushenqingEntity qiuzushenqing, 
		HttpServletRequest request){
        EntityWrapper<QiuzushenqingEntity> ew = new EntityWrapper<QiuzushenqingEntity>();

		PageUtils page = qiuzushenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qiuzushenqing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QiuzushenqingEntity qiuzushenqing){
       	EntityWrapper<QiuzushenqingEntity> ew = new EntityWrapper<QiuzushenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qiuzushenqing, "qiuzushenqing")); 
        return R.ok().put("data", qiuzushenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QiuzushenqingEntity qiuzushenqing){
        EntityWrapper< QiuzushenqingEntity> ew = new EntityWrapper< QiuzushenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qiuzushenqing, "qiuzushenqing")); 
		QiuzushenqingView qiuzushenqingView =  qiuzushenqingService.selectView(ew);
		return R.ok("查询求租申请成功").put("data", qiuzushenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QiuzushenqingEntity qiuzushenqing = qiuzushenqingService.selectById(id);
        return R.ok().put("data", qiuzushenqing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QiuzushenqingEntity qiuzushenqing = qiuzushenqingService.selectById(id);
        return R.ok().put("data", qiuzushenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QiuzushenqingEntity qiuzushenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(qiuzushenqing);
        qiuzushenqingService.insert(qiuzushenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QiuzushenqingEntity qiuzushenqing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(qiuzushenqing);
        qiuzushenqingService.insert(qiuzushenqing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QiuzushenqingEntity qiuzushenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qiuzushenqing);
        qiuzushenqingService.updateById(qiuzushenqing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<QiuzushenqingEntity> list = new ArrayList<QiuzushenqingEntity>();
        for(Long id : ids) {
            QiuzushenqingEntity qiuzushenqing = qiuzushenqingService.selectById(id);
            qiuzushenqing.setSfsh(sfsh);
            qiuzushenqing.setShhf(shhf);
            list.add(qiuzushenqing);
        }
        qiuzushenqingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qiuzushenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
