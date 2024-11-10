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


import com.dao.DiscussyiyuanjianjieDao;
import com.entity.DiscussyiyuanjianjieEntity;
import com.service.DiscussyiyuanjianjieService;
import com.entity.vo.DiscussyiyuanjianjieVO;
import com.entity.view.DiscussyiyuanjianjieView;

@Service("discussyiyuanjianjieService")
public class DiscussyiyuanjianjieServiceImpl extends ServiceImpl<DiscussyiyuanjianjieDao, DiscussyiyuanjianjieEntity> implements DiscussyiyuanjianjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiyuanjianjieEntity> page = this.selectPage(
                new Query<DiscussyiyuanjianjieEntity>(params).getPage(),
                new EntityWrapper<DiscussyiyuanjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiyuanjianjieEntity> wrapper) {
		  Page<DiscussyiyuanjianjieView> page =new Query<DiscussyiyuanjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiyuanjianjieVO> selectListVO(Wrapper<DiscussyiyuanjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiyuanjianjieVO selectVO(Wrapper<DiscussyiyuanjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiyuanjianjieView> selectListView(Wrapper<DiscussyiyuanjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiyuanjianjieView selectView(Wrapper<DiscussyiyuanjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
