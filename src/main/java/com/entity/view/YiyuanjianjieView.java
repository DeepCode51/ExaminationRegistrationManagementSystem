package com.entity.view;

import com.entity.YiyuanjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医院简介
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
@TableName("yiyuanjianjie")
public class YiyuanjianjieView  extends YiyuanjianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiyuanjianjieView(){
	}
 
 	public YiyuanjianjieView(YiyuanjianjieEntity yiyuanjianjieEntity){
 	try {
			BeanUtils.copyProperties(this, yiyuanjianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
