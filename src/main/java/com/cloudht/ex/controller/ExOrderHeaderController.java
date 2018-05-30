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

import com.cloudht.ex.domain.ExOrderHeaderDO;
import com.cloudht.ex.service.ExOrderHeaderService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 出口订单头信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
 
@Controller
@RequestMapping("/ex/exOrderHeader")
public class ExOrderHeaderController {
	@Autowired
	private ExOrderHeaderService exOrderHeaderService;
	
	@GetMapping()
	@RequiresPermissions("ex:exOrderHeader:exOrderHeader")
	String exOrderHeader(){
	    return "ex/exOrderHeader/exOrderHeader";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ex:exOrderHeader:exOrderHeader")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ExOrderHeaderDO> exOrderHeaderList = exOrderHeaderService.list(query);
		int total = exOrderHeaderService.count(query);
		PageUtils pageUtils = new PageUtils(exOrderHeaderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ex:exOrderHeader:add")
	String add(){
	    return "ex/exOrderHeader/add";
	}

	@GetMapping("/edit/{exOrderHeaderId}")
	@RequiresPermissions("ex:exOrderHeader:edit")
	String edit(@PathVariable("exOrderHeaderId") Long exOrderHeaderId,Model model){
		ExOrderHeaderDO exOrderHeader = exOrderHeaderService.get(exOrderHeaderId);
		model.addAttribute("exOrderHeader", exOrderHeader);
	    return "ex/exOrderHeader/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ex:exOrderHeader:add")
	public R save( ExOrderHeaderDO exOrderHeader){
		if(exOrderHeaderService.save(exOrderHeader)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ex:exOrderHeader:edit")
	public R update( ExOrderHeaderDO exOrderHeader){
		exOrderHeaderService.update(exOrderHeader);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderHeader:remove")
	public R remove( Long exOrderHeaderId){
		if(exOrderHeaderService.remove(exOrderHeaderId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderHeader:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] exOrderHeaderIds){
		exOrderHeaderService.batchRemove(exOrderHeaderIds);
		return R.ok();
	}
	
}
