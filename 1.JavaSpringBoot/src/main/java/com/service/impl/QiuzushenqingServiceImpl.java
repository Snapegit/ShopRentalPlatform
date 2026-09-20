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


import com.dao.QiuzushenqingDao;
import com.entity.QiuzushenqingEntity;
import com.service.QiuzushenqingService;
import com.entity.vo.QiuzushenqingVO;
import com.entity.view.QiuzushenqingView;

@Service("qiuzushenqingService")
public class QiuzushenqingServiceImpl extends ServiceImpl<QiuzushenqingDao, QiuzushenqingEntity> implements QiuzushenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiuzushenqingEntity> page = this.selectPage(
                new Query<QiuzushenqingEntity>(params).getPage(),
                new EntityWrapper<QiuzushenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiuzushenqingEntity> wrapper) {
		  Page<QiuzushenqingView> page =new Query<QiuzushenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<QiuzushenqingVO> selectListVO(Wrapper<QiuzushenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiuzushenqingVO selectVO(Wrapper<QiuzushenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiuzushenqingView> selectListView(Wrapper<QiuzushenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiuzushenqingView selectView(Wrapper<QiuzushenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
