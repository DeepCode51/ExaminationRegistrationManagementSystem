package com.dao;

import com.entity.DiscusszaixianbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszaixianbaomingVO;
import com.entity.view.DiscusszaixianbaomingView;


/**
 * 在线报名评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public interface DiscusszaixianbaomingDao extends BaseMapper<DiscusszaixianbaomingEntity> {
	
	List<DiscusszaixianbaomingVO> selectListVO(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
	
	DiscusszaixianbaomingVO selectVO(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
	
	List<DiscusszaixianbaomingView> selectListView(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);

	List<DiscusszaixianbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
	
	DiscusszaixianbaomingView selectView(@Param("ew") Wrapper<DiscusszaixianbaomingEntity> wrapper);
	
}
