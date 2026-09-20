package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiuzushenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiuzushenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiuzushenqingView;


/**
 * 求租申请
 *
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
public interface QiuzushenqingService extends IService<QiuzushenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiuzushenqingVO> selectListVO(Wrapper<QiuzushenqingEntity> wrapper);
   	
   	QiuzushenqingVO selectVO(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);
   	
   	List<QiuzushenqingView> selectListView(Wrapper<QiuzushenqingEntity> wrapper);
   	
   	QiuzushenqingView selectView(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiuzushenqingEntity> wrapper);

   	

}

