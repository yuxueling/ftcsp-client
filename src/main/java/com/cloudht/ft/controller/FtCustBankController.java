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

import com.cloudht.ft.domain.FtCustBankDO;
import com.cloudht.ft.service.FtCustBankService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;

/**
 * 国内外客户银行信息表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
 
@Controller
@RequestMapping("/ft/ftCustBank")
public class FtCustBankController {
	@Autowired
	private FtCustBankService ftCustBankService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftCustBank:ftCustBank")
	String FtCustBank(){
	    return "ft/ftCustBank/ftCustBank";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftCustBank:ftCustBank")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtCustBankDO> ftCustBankList = ftCustBankService.list(query);
		int total = ftCustBankService.count(query);
		PageUtils pageUtils = new PageUtils(ftCustBankList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("ft:ftCustBank:add")
	String add(){
	    return "ft/ftCustBank/add";
	}

	@GetMapping("/edit/{ftCustBankId}")
	@RequiresPermissions("ft:ftCustBank:edit")
	String edit(@PathVariable("ftCustBankId") Integer ftCustBankId,Model model){
		FtCustBankDO ftCustBank = ftCustBankService.get(ftCustBankId);
		model.addAttribute("ftCustBank", ftCustBank);
	    return "ft/ftCustBank/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftCustBank:add")
	public R save( FtCustBankDO ftCustBank){
		if(ftCustBankService.save(ftCustBank)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftCustBank:edit")
	public R update( FtCustBankDO ftCustBank){
		ftCustBankService.update(ftCustBank);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustBank:remove")
	public R remove( Integer ftCustBankId){
		if(ftCustBankService.remove(ftCustBankId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftCustBank:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ftCustBankIds){
		ftCustBankService.batchRemove(ftCustBankIds);
		return R.ok();
	}
	
}
