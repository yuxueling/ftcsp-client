package com.cloudht.ft.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloudht.common.utils.PageUtils;
import com.cloudht.common.utils.Query;
import com.cloudht.ft.domain.SysHscodeDO;
import com.cloudht.ft.service.SysHscodeService;

@Controller
@RequestMapping("/ft/sysHscode")
public class SysHscodeController {
	@Autowired
	private SysHscodeService sysHscodeService;
	@ResponseBody
	@GetMapping("/list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<SysHscodeDO> sysHscodeList = sysHscodeService.list(query);
		int total = sysHscodeService.count(query);
		PageUtils pageUtils = new PageUtils(sysHscodeList, total);
		return pageUtils;
	}
	/**
	 * 跳转到"hs编码"页面
	 */
	@RequestMapping("/getHsCodePage")
	public String getHsCodePage() {
		return "ft/sysHscode/sysHscode";
	}
}
