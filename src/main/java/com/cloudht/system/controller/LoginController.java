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
import com.cloudht.system.domain.RoleDO;
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
			//======系统自动生成的登录代码====
			subject.login(token);
			//======共用值存放区===============
			HashMap<String,Object> hashMap = new HashMap<String,Object>();
			UserDO user = userService.get(ShiroUtils.getUserId());//获取当前登录用户
			Long newUserRoleId=null;//新用户角色id
			Long officialUserRoleId=null;//正式注册角色id
			Long adminRoleId=null;//超级管理员角色id
			{//该代码块为上面的三个角色id赋值
				List<RoleDO> roleDOs = roleService.list();//获取系统中所有的角色对象
				for(RoleDO role:roleDOs) {
					String roleSign = role.getRoleSign();
					if("newUserRole".equals(roleSign)){
						newUserRoleId = role.getRoleId();
					}
					if("officialUserRole".equals(roleSign)) {
						officialUserRoleId=role.getRoleId();
					}
					if("admin".equals(roleSign)) {
						adminRoleId=role.getRoleId();
					}
				}
			}
			//获取当前登录用户的角色id
			Long roleId=null;{
				List<Long> roleIds = user.getRoleIds();
				if(roleIds!=null&&roleIds.size()==1) {
					roleId=roleIds.get(0);
				}
			}
			//======获取公司的审核状态=============
			Boolean clientStatus=null;{
				hashMap.put("clientUserId",user.getUserId());
				clientStatus = ftClientService.queryClientStatus(hashMap);
				hashMap.remove("clientUserId");
			}
			//======如果是超级管理员直接允许登录====
			if(roleId!=null&&adminRoleId!=null&&roleId==adminRoleId) {
				return R.ok();
			}
			if(clientStatus!=null&&clientStatus) {//该代码块为公司信息审核通过的逻辑
				//判断是不是正式角色 （是-登录成功）（否-授权为正式角色，提示重新登录）
				if(roleId!=null&&officialUserRoleId!=null&&roleId==officialUserRoleId) {
					return R.ok();
				}
				userService.updateUserRoleByUseridAndRoleId(user.getUserId(),officialUserRoleId);//授权为正式角色
				return R.error("权限已更新,请重新登录");
			}else {//为null或者false没有公司信息或者审核未通过
				//判断是不是新注册角色 （是-登录成功）（否-授权为新注册角色，提示重新登录）
				if(roleId!=null&&newUserRoleId!=null&&roleId==newUserRoleId) {
					if(clientStatus==null) {
						return R.ok("请填写公司信息");//公司信息未填写，跳转到公司信息填写页面
					}
					return R.ok();
				}
				userService.updateUserRoleByUseridAndRoleId(user.getUserId(),newUserRoleId);//授权为新注册角色
				return R.error("权限已更新,请重新登录");
			}
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
