package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuizushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuizushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuizushenqingView;


/**
 * 退租申请
 *
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
public interface TuizushenqingService extends IService<TuizushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuizushenqingVO> selectListVO(Wrapper<TuizushenqingEntity> wrapper);
   	
   	TuizushenqingVO selectVO(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);
   	
   	List<TuizushenqingView> selectListView(Wrapper<TuizushenqingEntity> wrapper);
   	
   	TuizushenqingView selectView(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuizushenqingEntity> wrapper);

   	

}

