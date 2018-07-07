package com.cloudht.ft.controller;

import java.util.Date;
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

import com.cloudht.ft.domain.FtClientDO;
import com.cloudht.ft.service.FtClientService;
import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.common.utils.R;
import com.cloudht.common.utils.ShiroUtils;

/**
 * 委托人信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-26 09:30:44
 */
 
@Controller
@RequestMapping("/ft/ftClient")
public class FtClientController {
	@Autowired
	private FtClientService ftClientService;
	
	@GetMapping()
	@RequiresPermissions("ft:ftClient:ftClient")
	String FtClient(){
	    return "ft/ftClient/ftClient";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("ft:ftClient:ftClient")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FtClientDO> ftClientList = ftClientService.list(query);
		int total = ftClientService.count(query);
		PageUtils pageUtils = new PageUtils(ftClientList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("ft:ftClient:add")
	String add(){
	    return "ft/ftClient/add";
	}

	@GetMapping("/edit/{ftClientId}")
	@RequiresPermissions("ft:ftClient:edit")
	String edit(@PathVariable("ftClientId") Long ftClientId,Model model){
		FtClientDO ftClient = ftClientService.get(ftClientId);
		model.addAttribute("ftClient", ftClient);
	    return "ft/ftClient/edit";
	}
	
	/**
	 * 保存"/ft/ftClient/save"
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("ft:ftClient:add")
	public R save( FtClientDO ftClient){
		if(ftClientService.save(ftClient)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 保存"/ft/ftClient/saveClient"
	 */
	@ResponseBody
	@PostMapping("/saveClient")
	@RequiresPermissions("ft:ftClient:add")
	public R saveClient( FtClientDO ftClient){
		if(ftClient.getMarketerId()!=null&&ftClient.getMarketerId()>0) {
			ftClient.setAuditStatus(1);//如果客户端传来了营销人员id,设置为已经分配营销
		}else {
			ftClient.setAuditStatus(0);//没有传来设置为新注册
		}
		ftClient.setClientUserId(ShiroUtils.getUserId());//设置委托方用户id
		ftClient.setClientType(0);//设置客户类型为有效客户
		ftClient.setGmtCreate(new Date());//设置创建时间
		if(ftClientService.saveClient(ftClient)){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("ft:ftClient:edit")
	public R update( FtClientDO ftClient){
		ftClientService.update(ftClient);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("ft:ftClient:remove")
	public R remove( Long ftClientId){
		if(ftClientService.remove(ftClientId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("ft:ftClient:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ftClientIds){
		ftClientService.batchRemove(ftClientIds);
		return R.ok();
	}
	
}
