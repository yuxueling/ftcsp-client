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

import com.cloudht.ft.domain.FtCustContactDO;
import com.cloudht.ft.service.FtCustContactService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 客户联系人信息表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftCustContact")
public class FtCustContactController {
	@Autowired
	private FtCustContactService ftCustContactService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftCustContact:ftCustContact")
	String FtCustContact(){
	    return "ft/ftCustContact/ftCustContact";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftCustContact:ftCustContact")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtCustContactDO> ftCustContactList = ftCustContactService.list(query);
		int total = ftCustContactService.count(query);
		PageUtils pageUtils = new PageUtils(ftCustContactList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftCustContact:add")
	String add(){
	    return "ft/ftCustContact/add";
	}

	@GetMapping("/edit/{ftCustContactId}")
	@RequiresPermissions("ft:ftCustContact:edit")
	String edit(@PathVariable("ftCustContactId") Integer ftCustContactId,Model model){
		FtCustContactDO ftCustContact = ftCustContactService.get(ftCustContactId);
		model.addAttribute("ftCustContact", ftCustContact);
	    return "ft/ftCustContact/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftCustContact:add")
	public R save( FtCustContactDO ftCustContact){
		if(ftCustContactService.save(ftCustContact)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftCustContact:edit")
	public R update( FtCustContactDO ftCustContact){
		ftCustContactService.update(ftCustContact);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustContact:remove")
	public R remove( Integer ftCustContactId){
		if(ftCustContactService.remove(ftCustContactId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustContact:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftCustContactIds){
		ftCustContactService.batchRemove(ftCustContactIds);
		return R.ok();
	}
	
}
