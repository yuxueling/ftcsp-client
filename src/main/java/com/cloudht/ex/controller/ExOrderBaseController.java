package com.cloudht.ex.controller;

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

import com.cloudht.ex.domain.ExOrderBaseDO;
import com.cloudht.ex.service.ExOrderBaseService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 出口订单基本信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
 
@Controller
@RequestMapping("/ex/exOrderBase")
public class ExOrderBaseController {
	@Autowired
	private ExOrderBaseService exOrderBaseService;
	
	@GetMapping()
	@RequiresPermissions("ex:exOrderBase:exOrderBase")
	String ExOrderBase(){
	    return "ex/exOrderBase/exOrderBase";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ex:exOrderBase:exOrderBase")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ExOrderBaseDO> exOrderBaseList = exOrderBaseService.list(query);
		int total = exOrderBaseService.count(query);
		PageUtils pageUtils = new PageUtils(exOrderBaseList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ex:exOrderBase:add")
	String add(){
	    return "ex/exOrderBase/add";
	}

	@GetMapping("/edit/{exOrderBaseId}")
	@RequiresPermissions("ex:exOrderBase:edit")
	String edit(@PathVariable("exOrderBaseId") Long exOrderBaseId,Model model){
		ExOrderBaseDO exOrderBase = exOrderBaseService.get(exOrderBaseId);
		model.addAttribute("exOrderBase", exOrderBase);
	    return "ex/exOrderBase/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ex:exOrderBase:add")
	public R save( ExOrderBaseDO exOrderBase){
		if(exOrderBaseService.save(exOrderBase)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ex:exOrderBase:edit")
	public R update( ExOrderBaseDO exOrderBase){
		exOrderBaseService.update(exOrderBase);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderBase:remove")
	public R remove( Long exOrderBaseId){
		if(exOrderBaseService.remove(exOrderBaseId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderBase:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] exOrderBaseIds){
		exOrderBaseService.batchRemove(exOrderBaseIds);
		return R.ok();
	}
	
}
