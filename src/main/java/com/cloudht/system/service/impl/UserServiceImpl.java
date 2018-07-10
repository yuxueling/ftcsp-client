package com.cloudht.system.service.impl;

import java.io.ByteArrayOutputStream;
import java.util.*;

import com.cloudht.common.config.FtcspConfig;
import com.cloudht.common.domain.FileDO;
import com.cloudht.common.service.FileService;
import com.cloudht.common.utils.*;
import com.cloudht.system.vo.UserVO;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudht.common.domain.Tree;
import com.cloudht.system.dao.DeptDao;
import com.cloudht.system.dao.UserDao;
import com.cloudht.system.dao.UserRoleDao;
import com.cloudht.system.domain.DeptDO;
import com.cloudht.system.domain.UserDO;
import com.cloudht.system.domain.UserRoleDO;
import com.cloudht.system.service.UserService;
import org.springframework.web.multipart.MultipartFile;


//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userMapper;
    @Autowired
    UserRoleDao userRoleMapper;
    @Autowired
    DeptDao deptMapper;
    @Autowired
    private FileService sysFileService;
    @Autowired
    private FtcspConfig ftcspConfig;

    
//    @Cacheable(key = "#id")
    /**
     * 根据用户id获取用户对象.封装了用户拥有角色对象的集合
     * @param id 用户的主键id
     */
    @Override
    public UserDO get(Long userid) {
        UserDO user = userMapper.get(userid);
        try {
        	List<Long> roleIds = userRoleMapper.listRoleId(userid);
        	user.setRoleIds(roleIds);
        	//user.setDeptName(deptMapper.get(user.getDeptId()).getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
        return user;
    }

    @Override
    public List<UserDO> list(Map<String, Object> map) {
        return userMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return userMapper.count(map);
    }

    @Transactional
    @Override
    public int save(UserDO user) {
        int count = userMapper.save(user);
        Long userId = user.getUserId();
        List<Long> roles = user.getRoleIds();
        userRoleMapper.removeByUserId(userId);
        List<UserRoleDO> list = new ArrayList<>();
        for (Long roleId : roles) {
            UserRoleDO ur = new UserRoleDO();
            ur.setUserId(userId);
            ur.setRoleId(roleId);
            list.add(ur);
        }
        if (list.size() > 0) {
            userRoleMapper.batchSave(list);
        }
        return count;
    }

    @Override
    public int update(UserDO user) {
        int r = userMapper.update(user);
        return r;
    }

    @Override
    public int remove(Long userId) {
        userRoleMapper.removeByUserId(userId);
        return userMapper.remove(userId);
    }

    @Override
    public boolean exit(Map<String, Object> params) {
        boolean exit;
        exit = userMapper.list(params).size() > 0;
        return exit;
    }

    @Override
    public Set<String> listRoles(Long userId) {
        return null;
    }

    @Override
    public int resetPwd(UserVO userVO, UserDO userDO) throws Exception {
        if (Objects.equals(userVO.getUserDO().getUserId(), userDO.getUserId())) {
            if (Objects.equals(MD5Utils.encrypt(userDO.getUsername(), userVO.getPwdOld()), userDO.getPassword())) {
                userDO.setPassword(MD5Utils.encrypt(userDO.getUsername(), userVO.getPwdNew()));
                return userMapper.update(userDO);
            } else {
                throw new Exception("输入的旧密码有误！");
            }
        } else {
            throw new Exception("你修改的不是你登录的账号！");
        }
    }

    @Override
    public int adminResetPwd(UserVO userVO) throws Exception {
        UserDO userDO = get(userVO.getUserDO().getUserId());
        if ("admin".equals(userDO.getUsername())) {
            throw new Exception("超级管理员的账号不允许直接重置！");
        }
        userDO.setPassword(MD5Utils.encrypt(userDO.getUsername(), userVO.getPwdNew()));
        return userMapper.update(userDO);


    }

    @Transactional
    @Override
    public int batchremove(Long[] userIds) {
        int count = userMapper.batchRemove(userIds);
        userRoleMapper.batchRemoveByUserId(userIds);
        return count;
    }

    @Override
    public Tree<DeptDO> getTree() {
        List<Tree<DeptDO>> trees = new ArrayList<Tree<DeptDO>>();
        List<DeptDO> depts = deptMapper.list(new HashMap<String, Object>(16));
        Long[] pDepts = deptMapper.listParentDept();
        Long[] uDepts = userMapper.listAllDept();
        Long[] allDepts = (Long[]) ArrayUtils.addAll(pDepts, uDepts);
        for (DeptDO dept : depts) {
            if (!ArrayUtils.contains(allDepts, dept.getDeptId())) {
                continue;
            }
            Tree<DeptDO> tree = new Tree<DeptDO>();
            tree.setId(dept.getDeptId().toString());
            tree.setParentId(dept.getParentId().toString());
            tree.setText(dept.getName());
            Map<String, Object> state = new HashMap<>(16);
            state.put("opened", true);
            state.put("mType", "dept");
            tree.setState(state);
            trees.add(tree);
        }
        List<UserDO> users = userMapper.list(new HashMap<String, Object>(16));
        for (UserDO user : users) {
            Tree<DeptDO> tree = new Tree<DeptDO>();
            tree.setId(user.getUserId().toString());
            tree.setParentId(user.getDeptId().toString());
            tree.setText(user.getName());
            Map<String, Object> state = new HashMap<>(16);
            state.put("opened", true);
            state.put("mType", "user");
            tree.setState(state);
            trees.add(tree);
        }
        // 默认顶级菜单为０，根据数据库实际情况调整
        Tree<DeptDO> t = BuildTree.build(trees);
        return t;
    }

    @Override
    public int updatePersonal(UserDO userDO) {
        return userMapper.update(userDO);
    }

    @Override
    public Map<String, Object> updatePersonalImg(MultipartFile file, String avatar_data, Long userId) throws Exception {
        String fileName = file.getOriginalFilename();
        fileName = FileUtil.renameToUUID(fileName);
        FileDO sysFile = new FileDO(FileType.fileType(fileName), "/files/" + fileName, new Date());
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            //转换后存入数据库
            byte[] b = out.toByteArray();
            FileUtil.uploadFile(b, ftcspConfig.getUploadPath(), fileName);
        } catch (Exception e) {
            throw new Exception("图片裁剪错误！！");
        }
        Map<String, Object> result = new HashMap<>();
        if (sysFileService.save(sysFile) > 0) {
            UserDO userDO = new UserDO();
            userDO.setUserId(userId);
            userDO.setPicId(sysFile.getId());
            if (userMapper.update(userDO) > 0) {
                result.put("url", sysFile.getUrl());
            }
        }
        return result;
    }

	@Override
	public UserDO getUsernameAndEmailByUsername(String username) {
		return userMapper.getUsernameAndEmailByUsername(username);
	}
	/**
	 * 更新角色对象
	 * @param userId 用户表的主键
	 * @param roleId 角色表的主键
	 * @return 是否成功
	 * @author Hzof
	 */
	@Override
	public boolean updateUserRoleByUseridAndRoleId(Long userId,Long roleId) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("userId", userId);
		List<UserRoleDO> list = userRoleMapper.list(map);
		UserRoleDO userRoleDO=null;
		if (list!=null&&list.size()==1) {
			//符合逻辑,执行正常代码
			userRoleDO = list.get(0);
			userRoleDO.setRoleId(roleId);
		}
		try {
			return userRoleMapper.update(userRoleDO)==1?true:false;
		} catch (Exception e) {
			//如果出错，说明没有查询到数据，返回false
			return false;
		}
	}
}
