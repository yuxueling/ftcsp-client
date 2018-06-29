package com.cloudht.common.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.support.DefaultSubjectContext;
import org.apache.shiro.subject.Subject;

import com.cloudht.system.domain.UserDO;

public class SessionUtils {
	private static SecurityUtils securityUtils;
	/**
	 * 获取当前登录用户的id
	 * @return 当前登录用户的id
	 * @author Hzof
	 */
	public static Long getUserId() {
		Session session = SecurityUtils.getSubject().getSession();
		SimplePrincipalCollection principalCollection = (SimplePrincipalCollection)session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
    	UserDO ud = (UserDO) principalCollection.getPrimaryPrincipal();
    	return ud.getUserId();
	}
	/**
	 * @return 当前登录用户的对象
	 */
	public static UserDO getUserDO() {
		Session session = SecurityUtils.getSubject().getSession();
		SimplePrincipalCollection principalCollection = (SimplePrincipalCollection)session.getAttribute(DefaultSubjectContext.PRINCIPALS_SESSION_KEY);
    	return (UserDO) principalCollection.getPrimaryPrincipal();
	}
	/**
	 * 获取session
	 * @return
	 */
	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}
}
