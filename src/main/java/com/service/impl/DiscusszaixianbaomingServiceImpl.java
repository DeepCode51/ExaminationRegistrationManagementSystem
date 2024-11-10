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


import com.dao.DiscusszaixianbaomingDao;
import com.entity.DiscusszaixianbaomingEntity;
import com.service.DiscusszaixianbaomingService;
import com.entity.vo.DiscusszaixianbaomingVO;
import com.entity.view.DiscusszaixianbaomingView;

@Service("discusszaixianbaomingService")
public class DiscusszaixianbaomingServiceImpl extends ServiceImpl<DiscusszaixianbaomingDao, DiscusszaixianbaomingEntity> implements DiscusszaixianbaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszaixianbaomingEntity> page = this.selectPage(
                new Query<DiscusszaixianbaomingEntity>(params).getPage(),
                new EntityWrapper<DiscusszaixianbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszaixianbaomingEntity> wrapper) {
		  Page<DiscusszaixianbaomingView> page =new Query<DiscusszaixianbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszaixianbaomingVO> selectListVO(Wrapper<DiscusszaixianbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszaixianbaomingVO selectVO(Wrapper<DiscusszaixianbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszaixianbaomingView> selectListView(Wrapper<DiscusszaixianbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszaixianbaomingView selectView(Wrapper<DiscusszaixianbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
