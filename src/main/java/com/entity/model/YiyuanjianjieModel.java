package com.entity.model;

import com.entity.YiyuanjianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 医院简介
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
public class YiyuanjianjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医院名称
	 */
	
	private String yiyuanmingcheng;
		
	/**
	 * 相关图片
	 */
	
	private String xiangguantupian;
		
	/**
	 * 内容简介
	 */
	
	private String neirongjianjie;
		
	/**
	 * 单位性质
	 */
	
	private String danweixingzhi;
		
	/**
	 * 员工人数
	 */
	
	private Integer yuangongrenshu;
		
	/**
	 * 医院院长
	 */
	
	private String yiyuanyuanzhang;
		
	/**
	 * 成立日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengliriqi;
		
	/**
	 * 成立科室
	 */
	
	private String chenglikeshi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：医院名称
	 */
	 
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
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
	 * 设置：内容简介
	 */
	 
	public void setNeirongjianjie(String neirongjianjie) {
		this.neirongjianjie = neirongjianjie;
	}
	
	/**
	 * 获取：内容简介
	 */
	public String getNeirongjianjie() {
		return neirongjianjie;
	}
				
	
	/**
	 * 设置：单位性质
	 */
	 
	public void setDanweixingzhi(String danweixingzhi) {
		this.danweixingzhi = danweixingzhi;
	}
	
	/**
	 * 获取：单位性质
	 */
	public String getDanweixingzhi() {
		return danweixingzhi;
	}
				
	
	/**
	 * 设置：员工人数
	 */
	 
	public void setYuangongrenshu(Integer yuangongrenshu) {
		this.yuangongrenshu = yuangongrenshu;
	}
	
	/**
	 * 获取：员工人数
	 */
	public Integer getYuangongrenshu() {
		return yuangongrenshu;
	}
				
	
	/**
	 * 设置：医院院长
	 */
	 
	public void setYiyuanyuanzhang(String yiyuanyuanzhang) {
		this.yiyuanyuanzhang = yiyuanyuanzhang;
	}
	
	/**
	 * 获取：医院院长
	 */
	public String getYiyuanyuanzhang() {
		return yiyuanyuanzhang;
	}
				
	
	/**
	 * 设置：成立日期
	 */
	 
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
	}
				
	
	/**
	 * 设置：成立科室
	 */
	 
	public void setChenglikeshi(String chenglikeshi) {
		this.chenglikeshi = chenglikeshi;
	}
	
	/**
	 * 获取：成立科室
	 */
	public String getChenglikeshi() {
		return chenglikeshi;
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
			
}
