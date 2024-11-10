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


import com.dao.YiyuanjianjieDao;
import com.entity.YiyuanjianjieEntity;
import com.service.YiyuanjianjieService;
import com.entity.vo.YiyuanjianjieVO;
import com.entity.view.YiyuanjianjieView;

@Service("yiyuanjianjieService")
public class YiyuanjianjieServiceImpl extends ServiceImpl<YiyuanjianjieDao, YiyuanjianjieEntity> implements YiyuanjianjieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiyuanjianjieEntity> page = this.selectPage(
                new Query<YiyuanjianjieEntity>(params).getPage(),
                new EntityWrapper<YiyuanjianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiyuanjianjieEntity> wrapper) {
		  Page<YiyuanjianjieView> page =new Query<YiyuanjianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiyuanjianjieVO> selectListVO(Wrapper<YiyuanjianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiyuanjianjieVO selectVO(Wrapper<YiyuanjianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiyuanjianjieView> selectListView(Wrapper<YiyuanjianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiyuanjianjieView selectView(Wrapper<YiyuanjianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
