package com.entity.vo;

import com.entity.ZaixianbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 在线报名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public class ZaixianbaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报考项目
	 */
	
	private String baokaoxiangmu;
		
	/**
	 * 报考位置
	 */
	
	private String baokaoweizhi;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 报考日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baokaoriqi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：报考项目
	 */
	 
	public void setBaokaoxiangmu(String baokaoxiangmu) {
		this.baokaoxiangmu = baokaoxiangmu;
	}
	
	/**
	 * 获取：报考项目
	 */
	public String getBaokaoxiangmu() {
		return baokaoxiangmu;
	}
				
	
	/**
	 * 设置：报考位置
	 */
	 
	public void setBaokaoweizhi(String baokaoweizhi) {
		this.baokaoweizhi = baokaoweizhi;
	}
	
	/**
	 * 获取：报考位置
	 */
	public String getBaokaoweizhi() {
		return baokaoweizhi;
	}
				
	
	/**
	 * 设置：相关图片
	 */
	 
	public void setXiangguantupian(String xiangguantupian) {
		this.xiangguantupian = xiangguantupian;
	}
	
	/**
	 * 获取：相关图片
	 */
	public String getXiangguantupian() {
		return xiangguantupian;
	}
				
	
	/**
	 * 设置：报考日期
	 */
	 
	public void setBaokaoriqi(Date baokaoriqi) {
		this.baokaoriqi = baokaoriqi;
	}
	
	/**
	 * 获取：报考日期
	 */
	public Date getBaokaoriqi() {
		return baokaoriqi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
