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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudht.ft.domain.FtCustDO;
import com.cloudht.ft.service.FtCustService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 客户信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftCust")
public class FtCustController {
	@Autowired
	private FtCustService ftCustService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftCust:ftCust")
	String FtCust(){
	    return "ft/ftCust/ftCust";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftCust:ftCust")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtCustDO> ftCustList = ftCustService.list(query);
		int total = ftCustService.count(query);
		PageUtils pageUtils = new PageUtils(ftCustList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftCust:add")
	String add(){
	    return "ft/ftCust/add";
	}

	@GetMapping("/edit/{ftCustId}")
	@RequiresPermissions("ft:ftCust:edit")
	String edit(@PathVariable("ftCustId") Integer ftCustId,Model model){
		FtCustDO ftCust = ftCustService.get(ftCustId);
		model.addAttribute("ftCust", ftCust);
	    return "ft/ftCust/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftCust:add")
	public R save( FtCustDO ftCust){
		if(ftCustService.save(ftCust)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftCust:edit")
	public R update( FtCustDO ftCust){
		ftCustService.update(ftCust);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftCust:remove")
	public R remove( Integer ftCustId){
		if(ftCustService.remove(ftCustId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftCust:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftCustIds){
		ftCustService.batchRemove(ftCustIds);
		return R.ok();
	}
	
}
