package com.entity.view;

import com.entity.ZaixianbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在线报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
@TableName("zaixianbaoming")
public class ZaixianbaomingView  extends ZaixianbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaixianbaomingView(){
	}
 
 	public ZaixianbaomingView(ZaixianbaomingEntity zaixianbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, zaixianbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
