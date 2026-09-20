package com.dao;

import com.entity.TuizushenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuizushenqingVO;
import com.entity.view.TuizushenqingView;


/**
 * 退租申请
 * 
 * @author 
 * @email 
 * @date 2024-02-07 16:48:48
 */
public interface TuizushenqingDao extends BaseMapper<TuizushenqingEntity> {
	
	List<TuizushenqingVO> selectListVO(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);
	
	TuizushenqingVO selectVO(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);
	
	List<TuizushenqingView> selectListView(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);

	List<TuizushenqingView> selectListView(Pagination page,@Param("ew") Wrapper<TuizushenqingEntity> wrapper);

	
	TuizushenqingView selectView(@Param("ew") Wrapper<TuizushenqingEntity> wrapper);
	

}
