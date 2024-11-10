package com.entity.view;

import com.entity.DiscusszaixianbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线报名评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
@TableName("discusszaixianbaoming")
public class DiscusszaixianbaomingView  extends DiscusszaixianbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszaixianbaomingView(){
	}
 
 	public DiscusszaixianbaomingView(DiscusszaixianbaomingEntity discusszaixianbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, discusszaixianbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
