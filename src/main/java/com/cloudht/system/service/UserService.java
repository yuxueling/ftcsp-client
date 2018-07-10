package com.cloudht.system.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cloudht.system.vo.UserVO;
import org.springframework.stereotype.Service;

import com.cloudht.common.domain.Tree;
import com.cloudht.system.domain.DeptDO;
import com.cloudht.system.domain.UserDO;

import org.springframework.web.multipart.MultipartFile;

@Service
public interface UserService {
	UserDO get(Long id);

	List<UserDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(UserDO user);

	int update(UserDO user);

	int remove(Long userId);

	int batchremove(Long[] userIds);

	boolean exit(Map<String, Object> params);

	Set<String> listRoles(Long userId);

	int resetPwd(UserVO userVO,UserDO userDO) throws Exception;
	int adminResetPwd(UserVO userVO) throws Exception;
	Tree<DeptDO> getTree();

	/**
	 * 更新个人信息
	 * @param userDO
	 * @return
	 */
	int updatePersonal(UserDO userDO);

	/**
	 * 更新个人图片
	 * @param file 图片
	 * @param avatar_data 裁剪信息
	 * @param userId 用户ID
	 * @throws Exception
	 */
    Map<String, Object> updatePersonalImg(MultipartFile file, String avatar_data, Long userId) throws Exception;
    /**
     *  根据用户名查询用户信息
     * @param username
     * @return
     */
	UserDO getUsernameAndEmailByUsername(String username);
	/**
	 * 更新角色对象
	 * @param userId 用户表的主键
	 * @param roleId 角色表的主键
	 * @return 是否成功
	 * @author Hzof
	 */
	boolean updateUserRoleByUseridAndRoleId(Long userId, Long roleId);
}
