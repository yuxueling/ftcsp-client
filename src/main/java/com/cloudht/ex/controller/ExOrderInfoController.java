package com.cloudht.ex.controller;

import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;
import com.cloudht.ex.domain.ExOrderHeaderDO;
import com.cloudht.ex.service.ExOrderHeaderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 出口订单头信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
 
@Controller
@RequestMapping("/ex/exOrderInfo")
public class ExOrderInfoController {
	@Autowired
	private ExOrderHeaderService exOrderHeaderService;

	@GetMapping("/add")
	@RequiresPermissions("ex:exOrderInfo:add")
	String add(){
		return "ex/exOrderInfo/add";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ex:exOrderInfo:add")
	public R save( ExOrderHeaderDO exOrderHeader){
		if(exOrderHeaderService.save(exOrderHeader)>0){
			return R.ok();
		}
		return R.error();
	}
	
}
