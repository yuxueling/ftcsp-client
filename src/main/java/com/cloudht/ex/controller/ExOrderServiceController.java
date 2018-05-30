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

import com.cloudht.ex.domain.ExOrderServiceDO;
import com.cloudht.ex.service.ExOrderServiceService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 出口订单服务
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
 
@Controller
@RequestMapping("/ex/exOrderService")
public class ExOrderServiceController {
	@Autowired
	private ExOrderServiceService exOrderServiceService;
	
	@GetMapping()
	@RequiresPermissions("ex:exOrderService:exOrderService")
	String ExOrderService(){
	    return "ex/exOrderService/exOrderService";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ex:exOrderService:exOrderService")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ExOrderServiceDO> exOrderServiceList = exOrderServiceService.list(query);
		int total = exOrderServiceService.count(query);
		PageUtils pageUtils = new PageUtils(exOrderServiceList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ex:exOrderService:add")
	String add(){
	    return "ex/exOrderService/add";
	}

	@GetMapping("/edit/{exOrderServiceId}")
	@RequiresPermissions("ex:exOrderService:edit")
	String edit(@PathVariable("exOrderServiceId") Integer exOrderServiceId,Model model){
		ExOrderServiceDO exOrderService = exOrderServiceService.get(exOrderServiceId);
		model.addAttribute("exOrderService", exOrderService);
	    return "ex/exOrderService/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ex:exOrderService:add")
	public R save( ExOrderServiceDO exOrderService){
		if(exOrderServiceService.save(exOrderService)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ex:exOrderService:edit")
	public R update( ExOrderServiceDO exOrderService){
		exOrderServiceService.update(exOrderService);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderService:remove")
	public R remove( Integer exOrderServiceId){
		if(exOrderServiceService.remove(exOrderServiceId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ex:exOrderService:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] exOrderServiceIds){
		exOrderServiceService.batchRemove(exOrderServiceIds);
		return R.ok();
	}
	
}
