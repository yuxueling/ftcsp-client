package com.cloudht.ft.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudht.ft.domain.FtCommodityDO;
import com.cloudht.ft.service.FtCommodityService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 商品信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftCommodity")
public class FtCommodityController {
	@Autowired
	private FtCommodityService ftCommodityService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftCommodity:ftCommodity")
	String FtCommodity(){
	    return "ft/ftCommodity/ftCommodity";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftCommodity:ftCommodity")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtCommodityDO> ftCommodityList = ftCommodityService.list(query);
		int total = ftCommodityService.count(query);
		PageUtils pageUtils = new PageUtils(ftCommodityList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftCommodity:add")
	String add(){
	    return "ft/ftCommodity/add";
	}

	@GetMapping("/edit/{ftCommodityId}")
	@RequiresPermissions("ft:ftCommodity:edit")
	String edit(@PathVariable("ftCommodityId") Integer ftCommodityId,Model model){
		FtCommodityDO ftCommodity = ftCommodityService.get(ftCommodityId);
		model.addAttribute("ftCommodity", ftCommodity);
	    return "ft/ftCommodity/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftCommodity:add")
	public R save( FtCommodityDO ftCommodity){
		if(ftCommodityService.save(ftCommodity)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftCommodity:edit")
	public R update( FtCommodityDO ftCommodity){
		ftCommodityService.update(ftCommodity);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftCommodity:remove")
	public R remove( Integer ftCommodityId){
		if(ftCommodityService.remove(ftCommodityId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftCommodity:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftCommodityIds){
		ftCommodityService.batchRemove(ftCommodityIds);
		return R.ok();
	}
	
}
