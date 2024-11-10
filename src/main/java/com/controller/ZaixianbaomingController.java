package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZaixianbaomingEntity;
import com.entity.view.ZaixianbaomingView;

import com.service.ZaixianbaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 在线报名
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
@RestController
@RequestMapping("/zaixianbaoming")
public class ZaixianbaomingController {
    @Autowired
    private ZaixianbaomingService zaixianbaomingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZaixianbaomingEntity zaixianbaoming, HttpServletRequest request){

        EntityWrapper<ZaixianbaomingEntity> ew = new EntityWrapper<ZaixianbaomingEntity>();
    	PageUtils page = zaixianbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianbaoming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZaixianbaomingEntity zaixianbaoming, HttpServletRequest request){
        EntityWrapper<ZaixianbaomingEntity> ew = new EntityWrapper<ZaixianbaomingEntity>();
    	PageUtils page = zaixianbaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zaixianbaoming), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZaixianbaomingEntity zaixianbaoming){
       	EntityWrapper<ZaixianbaomingEntity> ew = new EntityWrapper<ZaixianbaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zaixianbaoming, "zaixianbaoming")); 
        return R.ok().put("data", zaixianbaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZaixianbaomingEntity zaixianbaoming){
        EntityWrapper< ZaixianbaomingEntity> ew = new EntityWrapper< ZaixianbaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zaixianbaoming, "zaixianbaoming")); 
		ZaixianbaomingView zaixianbaomingView =  zaixianbaomingService.selectView(ew);
		return R.ok("查询在线报名成功").put("data", zaixianbaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZaixianbaomingEntity zaixianbaoming = zaixianbaomingService.selectById(id);
        return R.ok().put("data", zaixianbaoming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZaixianbaomingEntity zaixianbaoming = zaixianbaomingService.selectById(id);
        return R.ok().put("data", zaixianbaoming);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        ZaixianbaomingEntity zaixianbaoming = zaixianbaomingService.selectById(id);
        if(type.equals("1")) {
        	zaixianbaoming.setThumbsupnum(zaixianbaoming.getThumbsupnum()+1);
        } else {
        	zaixianbaoming.setCrazilynum(zaixianbaoming.getCrazilynum()+1);
        }
        zaixianbaomingService.updateById(zaixianbaoming);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZaixianbaomingEntity zaixianbaoming, HttpServletRequest request){
    	zaixianbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianbaoming);

        zaixianbaomingService.insert(zaixianbaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ZaixianbaomingEntity zaixianbaoming, HttpServletRequest request){
    	zaixianbaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zaixianbaoming);

        zaixianbaomingService.insert(zaixianbaoming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZaixianbaomingEntity zaixianbaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zaixianbaoming);
        zaixianbaomingService.updateById(zaixianbaoming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zaixianbaomingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZaixianbaomingEntity> wrapper = new EntityWrapper<ZaixianbaomingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zaixianbaomingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
