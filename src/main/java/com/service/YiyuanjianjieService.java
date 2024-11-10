package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanjianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanjianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanjianjieView;


/**
 * 医院简介
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public interface YiyuanjianjieService extends IService<YiyuanjianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanjianjieVO> selectListVO(Wrapper<YiyuanjianjieEntity> wrapper);
   	
   	YiyuanjianjieVO selectVO(@Param("ew") Wrapper<YiyuanjianjieEntity> wrapper);
   	
   	List<YiyuanjianjieView> selectListView(Wrapper<YiyuanjianjieEntity> wrapper);
   	
   	YiyuanjianjieView selectView(@Param("ew") Wrapper<YiyuanjianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanjianjieEntity> wrapper);
   	
}

