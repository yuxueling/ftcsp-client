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

import com.cloudht.ft.domain.FtClientCompanyDO;
import com.cloudht.ft.service.FtClientCompanyService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 委托方公司表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftClientCompany")
public class FtClientCompanyController {
	@Autowired
	private FtClientCompanyService ftClientCompanyService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftClientCompany:ftClientCompany")
	String FtClientCompany(){
	    return "ft/ftClientCompany/ftClientCompany";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftClientCompany:ftClientCompany")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtClientCompanyDO> ftClientCompanyList = ftClientCompanyService.list(query);
		int total = ftClientCompanyService.count(query);
		PageUtils pageUtils = new PageUtils(ftClientCompanyList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftClientCompany:add")
	String add(){
	    return "ft/ftClientCompany/add";
	}

	@GetMapping("/edit/{ftClientCompanyId}")
	@RequiresPermissions("ft:ftClientCompany:edit")
	String edit(@PathVariable("ftClientCompanyId") Integer ftClientCompanyId,Model model){
		FtClientCompanyDO ftClientCompany = ftClientCompanyService.get(ftClientCompanyId);
		model.addAttribute("ftClientCompany", ftClientCompany);
	    return "ft/ftClientCompany/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftClientCompany:add")
	public R save( FtClientCompanyDO ftClientCompany){
		if(ftClientCompanyService.save(ftClientCompany)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftClientCompany:edit")
	public R update( FtClientCompanyDO ftClientCompany){
		ftClientCompanyService.update(ftClientCompany);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftClientCompany:remove")
	public R remove( Integer ftClientCompanyId){
		if(ftClientCompanyService.remove(ftClientCompanyId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftClientCompany:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftClientCompanyIds){
		ftClientCompanyService.batchRemove(ftClientCompanyIds);
		return R.ok();
	}
	
}
