package com.cloudht.system.controller;

import com.cloudht.common.annotation.Log;
import com.cloudht.common.controller.BaseController;
import com.cloudht.common.domain.FileDO;
import com.cloudht.common.domain.Tree;
import com.cloudht.common.service.FileService;
import com.cloudht.common.utils.MD5Utils;
import com.cloudht.common.utils.R;
import com.cloudht.common.utils.ShiroUtils;
import com.cloudht.ft.service.FtClientService;
import com.cloudht.system.domain.MenuDO;
import com.cloudht.system.domain.UserDO;
import com.cloudht.system.service.MenuService;
import com.cloudht.system.service.RoleService;
import com.cloudht.system.service.UserService;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController extends BaseController {

	@Autowired
	MenuService menuService;
	@Autowired
	FileService fileService;
	@Autowired
	RoleService roleService;
	@Autowired
	private FtClientService ftClientService;
	
	@Autowired
	private UserService userService;
	@GetMapping({ "/", "" })
	String welcome(Model model) {
		return "page/index";
//		return "redirect:/blog";
	}


	@Log("请求访问主页")
	@GetMapping({ "/index" })
	String index(Model model) {
		List<Tree<MenuDO>> menus = menuService.listMenuTree(getUserId());
		model.addAttribute("menus", menus);
		model.addAttribute("name", getUser().getName());
		FileDO fileDO = fileService.get(getUser().getPicId());
		if(fileDO!=null&&fileDO.getUrl()!=null){
			if(fileService.isExist(fileDO.getUrl())){
				model.addAttribute("picUrl",fileDO.getUrl());
			}else {
				model.addAttribute("picUrl","/img/photo_s2.png");
			}
		}else {
			model.addAttribute("picUrl","/img/photo_s2.png");
		}
		model.addAttribute("username", getUser().getUsername());
		return "index_v1";
	}

	@GetMapping("/login")
	String login() {
		return "login";
	}

	@Log("登录")
	@PostMapping("/login")
	@ResponseBody
	R ajaxLogin(String username, String password) {

		password = MD5Utils.encrypt(username, password);
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
			if("admin".equals(username))return R.ok();//如果是超级管理员直接跳过下面公司信息的效验
			//判断登录用户是否完成公司信息的审核
			HashMap<String,Object> hashMap = new HashMap<String,Object>();
			hashMap.put("username",username);//封装查询条件
			List<UserDO> list = userService.list(hashMap);//查询用户
			hashMap.remove("username");//删除刚才的查询条件，以重新使用该map
			hashMap.put("clientUserId",list.get(0).getUserId());//重新put新的条件
			//返回当前登录用户对应的公司审核状态
			String queryClientStatus = this.ftClientService.queryClientStatus(hashMap);
			return R.ok(queryClientStatus);	
		} catch (AuthenticationException e) {
			return R.error("用户或密码错误");
		}
	}

	@GetMapping("/logout")
	String logout() {
		ShiroUtils.logout();
		return "redirect:/login";
	}

	@GetMapping("/main")
	String main() {
		return "main";
	}
	/**
	 * 注册用户/sys/user/add
	 * @param model
	 * @return
	 */
	//@RequiresPermissions("sys:user:add")
	@Log("注册用户")
	@GetMapping("/register")
	String register () {
		return "/page/register";
	}
}
