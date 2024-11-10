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


import com.dao.ZaixianbaomingDao;
import com.entity.ZaixianbaomingEntity;
import com.service.ZaixianbaomingService;
import com.entity.vo.ZaixianbaomingVO;
import com.entity.view.ZaixianbaomingView;

@Service("zaixianbaomingService")
public class ZaixianbaomingServiceImpl extends ServiceImpl<ZaixianbaomingDao, ZaixianbaomingEntity> implements ZaixianbaomingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixianbaomingEntity> page = this.selectPage(
                new Query<ZaixianbaomingEntity>(params).getPage(),
                new EntityWrapper<ZaixianbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixianbaomingEntity> wrapper) {
		  Page<ZaixianbaomingView> page =new Query<ZaixianbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixianbaomingVO> selectListVO(Wrapper<ZaixianbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixianbaomingVO selectVO(Wrapper<ZaixianbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixianbaomingView> selectListView(Wrapper<ZaixianbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixianbaomingView selectView(Wrapper<ZaixianbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
