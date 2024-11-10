package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiyuanjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiyuanjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiyuanjianjieView;


/**
 * 医院简介评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public interface DiscussyiyuanjianjieService extends IService<DiscussyiyuanjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiyuanjianjieVO> selectListVO(Wrapper<DiscussyiyuanjianjieEntity> wrapper);
   	
   	DiscussyiyuanjianjieVO selectVO(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
   	
   	List<DiscussyiyuanjianjieView> selectListView(Wrapper<DiscussyiyuanjianjieEntity> wrapper);
   	
   	DiscussyiyuanjianjieView selectView(@Param("ew") Wrapper<DiscussyiyuanjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiyuanjianjieEntity> wrapper);
   	
}

