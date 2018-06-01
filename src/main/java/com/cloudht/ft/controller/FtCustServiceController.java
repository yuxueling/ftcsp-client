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

import com.cloudht.ft.domain.FtCustServiceDO;
import com.cloudht.ft.service.FtCustServiceService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 国外客户业务信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftCustService")
public class FtCustServiceController {
	@Autowired
	private FtCustServiceService ftCustServiceService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftCustService:ftCustService")
	String FtCustService(){
	    return "ft/ftCustService/ftCustService";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftCustService:ftCustService")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtCustServiceDO> ftCustServiceList = ftCustServiceService.list(query);
		int total = ftCustServiceService.count(query);
		PageUtils pageUtils = new PageUtils(ftCustServiceList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftCustService:add")
	String add(){
	    return "ft/ftCustService/add";
	}

	@GetMapping("/edit/{ftCustServiceId}")
	@RequiresPermissions("ft:ftCustService:edit")
	String edit(@PathVariable("ftCustServiceId") Integer ftCustServiceId,Model model){
		FtCustServiceDO ftCustService = ftCustServiceService.get(ftCustServiceId);
		model.addAttribute("ftCustService", ftCustService);
	    return "ft/ftCustService/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftCustService:add")
	public R save( FtCustServiceDO ftCustService){
		if(ftCustServiceService.save(ftCustService)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftCustService:edit")
	public R update( FtCustServiceDO ftCustService){
		ftCustServiceService.update(ftCustService);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustService:remove")
	public R remove( Integer ftCustServiceId){
		if(ftCustServiceService.remove(ftCustServiceId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustService:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftCustServiceIds){
		ftCustServiceService.batchRemove(ftCustServiceIds);
		return R.ok();
	}
	
}
