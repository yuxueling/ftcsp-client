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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudht.ex.domain.ExShipOrderDO;
import com.cloudht.ex.service.ExShipOrderService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 托单信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:00:23
 */
 
@Controller
@RequestMapping("/ex/exShipOrder")
public class ExShipOrderController {
	@Autowired
	private ExShipOrderService exShipOrderService;
	
	@GetMapping()
//	@RequiresPermissions("ex:exShipOrder:exShipOrder")
	String ExShipOrder(){
	    return "ex/exShipOrder/exShipOrder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ex:exShipOrder:exShipOrder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ExShipOrderDO> exShipOrderList = exShipOrderService.list(query);
		int total = exShipOrderService.count(query);
		PageUtils pageUtils = new PageUtils(exShipOrderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ex:exShipOrder:add")
	String add(){
	    return "ex/exShipOrder/add";
	}

	@GetMapping("/edit/{exShipOrderId}")
	@RequiresPermissions("ex:exShipOrder:edit")
	String edit(@PathVariable("exShipOrderId") Long exShipOrderId,Model model){
		ExShipOrderDO exShipOrder = exShipOrderService.get(exShipOrderId);
		model.addAttribute("exShipOrder", exShipOrder);
	    return "ex/exShipOrder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ex:exShipOrder:add")
	public R save( ExShipOrderDO exShipOrder){
		if(exShipOrderService.save(exShipOrder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ex:exShipOrder:edit")
	public R update( ExShipOrderDO exShipOrder){
		exShipOrderService.update(exShipOrder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ex:exShipOrder:remove")
	public R remove( Long exShipOrderId){
		if(exShipOrderService.remove(exShipOrderId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ex:exShipOrder:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] exShipOrderIds){
		exShipOrderService.batchRemove(exShipOrderIds);
		return R.ok();
	}
	
}
