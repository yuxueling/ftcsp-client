package com.cloudht.system.controller;

import com.cloudht.common.annotation.Log;
import com.cloudht.common.config.Constant;
import com.cloudht.common.controller.BaseController;
import com.cloudht.common.domain.Tree;
import com.cloudht.common.service.DictService;
import com.cloudht.common.utils.*;
import com.cloudht.system.domain.DeptDO;
import com.cloudht.system.domain.RoleDO;
import com.cloudht.system.domain.UserDO;
import com.cloudht.system.service.RoleService;
import com.cloudht.system.service.UserService;
import com.cloudht.system.vo.UserVO;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RequestMapping("/sys/user")
@Controller
public class UserController extends BaseController {
	private String prefix="system/user"  ;
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	@Autowired
	DictService dictService;
	@RequiresPermissions("sys:user:user")
	@GetMapping("")
	String user(Model model) {
		return prefix + "/user";
	}

	@GetMapping("/list")
	@ResponseBody
	PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<UserDO> sysUserList = userService.list(query);
		int total = userService.count(query);
		PageUtils pageUtil = new PageUtils(sysUserList, total);
		return pageUtil;
	}
	
	/**
	 * 注册用户/sys/user/add
	 * @param model
	 * @return
	 */
	//@RequiresPermissions("sys:user:add")
	@Log("添加用户")
	@GetMapping("/add")
	String add(Model model) {
		List<RoleDO> roles = roleService.list();
		model.addAttribute("roles", roles);
		return prefix + "/add";
	}

	@RequiresPermissions("sys:user:edit")
	@Log("编辑用户")
	@GetMapping("/edit/{id}")
	String edit(Model model, @PathVariable("id") Long id) {
		UserDO userDO = userService.get(id);
		model.addAttribute("user", userDO);
		List<RoleDO> roles = roleService.list(id);
		model.addAttribute("roles", roles);
		return prefix+"/edit";
	}

	//@RequiresPermissions("sys:user:add")
	@Log("保存用户")
	@PostMapping("/save")///sys/user/save
	@ResponseBody
	R save(UserDO user) {
		user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
		user.setStatus(1);//设置新注册用户状态为正常
		List<RoleDO> list = roleService.list();
		List<Long> roleIds = new ArrayList<Long>();
		for(RoleDO role:list) {
			if("newUserRole".equals(role.getRoleSign())) {
				roleIds.add(role.getRoleId());	
			}
		}
		user.setRoleIds(roleIds);//新注册的用户设置为新注册角色
		if (userService.save(user) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@RequiresPermissions("sys:user:edit")
	@Log("更新用户")
	@PostMapping("/update")
	@ResponseBody
	R update(UserDO user) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		if (userService.update(user) > 0) {
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 向忘记密码用户发送邮件
	 * @param user
	 * @return
	 */
	@PostMapping("/retrievePasswordSendEmail")
	@ResponseBody
	String retrievePasswordSendEmail(UserDO user) {
		try {
			UserDO usernameAndEmailByUsername = userService.getUsernameAndEmailByUsername(user.getUsername());
			if(!user.getUsername().equals(usernameAndEmailByUsername.getUsername())) {
				return  "传入的数据被非法拦截或恶意修改";
			}	
		} catch (Exception e) {
			return "用户名或者邮箱错误";
		}
		//======上面是数据效验，此处调用发邮件功能=====
		try {
			Long timeEnd2 = System.currentTimeMillis()%10000;
			int timeEnd = Integer.parseInt(timeEnd2.toString());
	        if(timeEnd<1000) 
	        	timeEnd+=1000;
			System.out.println(timeEnd);
			String subject="云汇通外贸综合服务平台用户修改密码邮件";
			String content = "亲爱的用户您好，感谢您选择云汇通，您的修改密码的验证码为<a>"+timeEnd+"</a>";
			MailUtils.sendMail(subject,content, user.getEmail());
			Session session = SessionUtils.getSession();
			session.setAttribute(user.getUsername(), timeEnd);
			return "邮件发送成功";
		} catch (Exception e) {
			return "邮件发送失败，请联系管理员";
		}
	}
	

	@RequiresPermissions("sys:user:edit")
	@Log("更新用户")
	@PostMapping("/updatePeronal")
	@ResponseBody
	R updatePeronal(UserDO user) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		if (userService.updatePersonal(user) > 0) {
			return R.ok();
		}
		return R.error();
	}
	

	@RequiresPermissions("sys:user:remove")
	@Log("删除用户")
	@PostMapping("/remove")
	@ResponseBody
	R remove(Long id) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		if (userService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@RequiresPermissions("sys:user:batchRemove")
	@Log("批量删除用户")
	@PostMapping("/batchRemove")
	@ResponseBody
	R batchRemove(@RequestParam("ids[]") Long[] userIds) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		int r = userService.batchremove(userIds);
		if (r > 0) {
			return R.ok();
		}
		return R.error();
	}

	///sys/user/exit
	@PostMapping("/exit")
	@ResponseBody
	boolean exit(@RequestParam Map<String, Object> params) {
		// 存在，不通过，false
		return !userService.exit(params);
	}

	@RequiresPermissions("sys:user:resetPwd")
	@Log("请求更改用户密码")
	@GetMapping("/resetPwd/{id}")
	String resetPwd(@PathVariable("id") Long userId, Model model) {

		UserDO userDO = new UserDO();
		userDO.setUserId(userId);
		model.addAttribute("user", userDO);
		return prefix + "/reset_pwd";
	}
	/**
	 * @param username 页面传入的用户名 可以为空
	 * @return 跳转到找回密码页面
	 */
	@GetMapping("retrievePassword/{username}")
	String retrievePassword(@PathVariable("username") String username, Model model) {
		if(username.equals("null")||username.equals(""))
			username="用户输入的用户名是空啊呵呵呵呵呵呵呵呵呵呵";
		UserDO user = userService.getUsernameAndEmailByUsername(username);
		if(user==null) {
			user= new UserDO();
			user.setUsername("请在此输入用户名");
			user.setEmail("请在此输入您的邮箱");
		}
		model.addAttribute("user", user);
		return prefix + "/retrievePassword";
	}
	
	/**
	 * 忘记密码用户找回密码后的保存密码
	 * @param user
	 * @return
	 * @author 刘建华
	 */
	@PostMapping("/retrievePasswordSave")
	@ResponseBody
	R retrievePasswordSave(UserDO user) {
		try {
			Long userId = user.getUserId();
			UserDO userDO = userService.get(user.getUserId());
			if(!user.getUsername().equals(userDO.getUsername())) {//前台传入的id和用户名和后台比对
				return R.error(1, "数据被非法修改，请重新尝试");
			}
			Session session = SessionUtils.getSession();
			//获取存到session中的验证码
			int attribute = (int) session.getAttribute(user.getUsername());
			session.removeAttribute(user.getUsername());
			if(attribute!=user.getVerificationCode()) {
				return R.error(1, "请输入正确的邮箱验证码");
			}
			user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
			user.setUsername(null);user.setEmail(null);//将多余的字段重置为null ，避免多余的sql字段写入
			int update = userService.update(user);
			if(update==1) {
				return R.ok();
			}
		} catch (Exception e) {
		}
		return R.error(1, "未知错误，请联系管理员");
		
		
	}
	@Log("提交更改用户密码")
	@PostMapping("/resetPwd")
	@ResponseBody
	R resetPwd(UserVO userVO) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		try{
			userService.resetPwd(userVO,getUser());
			return R.ok();
		}catch (Exception e){
			return R.error(1,e.getMessage());
		}

	}
	@RequiresPermissions("sys:user:resetPwd")
	@Log("admin提交更改用户密码")
	@PostMapping("/adminResetPwd")
	@ResponseBody
	R adminResetPwd(UserVO userVO) {
		if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		try{
			userService.adminResetPwd(userVO);
			return R.ok();
		}catch (Exception e){
			return R.error(1,e.getMessage());
		}

	}
	@GetMapping("/tree")
	@ResponseBody
	public Tree<DeptDO> tree() {
		Tree<DeptDO> tree = new Tree<DeptDO>();
		tree = userService.getTree();
		return tree;
	}

	@GetMapping("/treeView")
	String treeView() {
		return  prefix + "/userTree";
	}

	@GetMapping("/personal")
	String personal(Model model) {
		UserDO userDO  = userService.get(getUserId());
		model.addAttribute("user",userDO);
		model.addAttribute("hobbyList",dictService.getHobbyList(userDO));
		model.addAttribute("sexList",dictService.getSexList());
		return prefix + "/personal";
	}
	@ResponseBody
	@PostMapping("/uploadImg")
	R uploadImg(@RequestParam("avatar_file") MultipartFile file, String avatar_data, HttpServletRequest request) {
		if ("test".equals(getUsername())) {
			return R.error(1, "演示系统不允许修改,完整体验请部署程序");
		}
		Map<String, Object> result = new HashMap<>();
		try {
			result = userService.updatePersonalImg(file, avatar_data, getUserId());
		} catch (Exception e) {
			return R.error("更新图像失败！");
		}
		if(result!=null && result.size()>0){
			return R.ok(result);
		}else {
			return R.error("更新图像失败！");
		}
	}
}
