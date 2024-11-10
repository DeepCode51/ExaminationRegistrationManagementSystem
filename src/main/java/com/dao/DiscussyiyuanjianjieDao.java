package com.dao;

import com.entity.DiscussyiyuanjianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiyuanjianjieVO;
import com.entity.view.DiscussyiyuanjianjieView;


/**
 * 医院简介评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public interface DiscussyiyuanjianjieDao extends BaseMapper<DiscussyiyuanjianjieEntity> {
	
	List<DiscussyiyuanjianjieVO> selectListVO(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
	
	DiscussyiyuanjianjieVO selectVO(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
	
	List<DiscussyiyuanjianjieView> selectListView(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);

	List<DiscussyiyuanjianjieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
	
	DiscussyiyuanjianjieView selectView(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
	
}
