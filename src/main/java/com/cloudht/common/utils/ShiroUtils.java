package com.cloudht.common.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.cloudht.system.domain.UserDO;

public class ShiroUtils {

    public static Subject getSubjct() {
        return SecurityUtils.getSubject();
    }
    /**
	 * @return 当前登录用户的对象
	 */
    public static UserDO getUser() {
        Object object = getSubjct().getPrincipal();
        return (UserDO)object;
    }
    /**
	 * 获取session
	 * @return
	 */
	public static Session getSession() {
		return getSubjct().getSession();
	}
    /**
	 * 获取当前登录用户的id
	 * @return 当前登录用户的id
	 */
    public static Long getUserId() {
        return getUser().getUserId();
    }
    public static void logout() {
        getSubjct().logout();
    }
}
