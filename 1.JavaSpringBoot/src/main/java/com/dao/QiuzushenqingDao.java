package com.dao;

import com.entity.QiuzushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiuzushenqingVO;
import com.entity.view.QiuzushenqingView;


/**
 * 求租申请
 * 
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
public interface QiuzushenqingDao extends BaseMapper<QiuzushenqingEntity> {
	
	List<QiuzushenqingVO> selectListVO(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);
	
	QiuzushenqingVO selectVO(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);
	
	List<QiuzushenqingView> selectListView(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);

	List<QiuzushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);

	
	QiuzushenqingView selectView(@Param("ew") Wrapper<QiuzushenqingEntity> wrapper);
	

}
