package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TuizushenqingDao;
import com.entity.TuizushenqingEntity;
import com.service.TuizushenqingService;
import com.entity.vo.TuizushenqingVO;
import com.entity.view.TuizushenqingView;

@Service("tuizushenqingService")
public class TuizushenqingServiceImpl extends ServiceImpl<TuizushenqingDao, TuizushenqingEntity> implements TuizushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuizushenqingEntity> page = this.selectPage(
                new Query<TuizushenqingEntity>(params).getPage(),
                new EntityWrapper<TuizushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuizushenqingEntity> wrapper) {
		  Page<TuizushenqingView> page =new Query<TuizushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<TuizushenqingVO> selectListVO(Wrapper<TuizushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuizushenqingVO selectVO(Wrapper<TuizushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuizushenqingView> selectListView(Wrapper<TuizushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuizushenqingView selectView(Wrapper<TuizushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
