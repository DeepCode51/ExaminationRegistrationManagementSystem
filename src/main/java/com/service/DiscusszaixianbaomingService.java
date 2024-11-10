package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszaixianbaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszaixianbaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszaixianbaomingView;


/**
 * 在线报名评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public interface DiscusszaixianbaomingService extends IService<DiscusszaixianbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszaixianbaomingVO> selectListVO(Wrapper<DiscusszaixianbaomingEntity> wrapper);
   	
   	DiscusszaixianbaomingVO selectVO(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
   	
   	List<DiscusszaixianbaomingView> selectListView(Wrapper<DiscusszaixianbaomingEntity> wrapper);
   	
   	DiscusszaixianbaomingView selectView(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszaixianbaomingEntity> wrapper);
   	
}

