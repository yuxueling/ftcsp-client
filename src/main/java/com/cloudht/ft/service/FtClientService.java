package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtClientDO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 委托人信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-26 09:30:44
 */
public interface FtClientService {
	
	FtClientDO get(Long ftClientId);
	
	List<FtClientDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtClientDO ftClient);
	
	int update(FtClientDO ftClient);
	
	int remove(Long ftClientId);
	
	int batchRemove(Long[] ftClientIds);

	/**
	 * 查询公司状态 该函数务必保证数据库中公司状态大于3以上的均为审核通过，
	 * 数据库设计如有变更，请重新更改该函数逻辑
	 * @return 返回true公司信息审核通过; 返回false公司信息审核尚未通过;返回null公司信息没有填写(单个用户只能有绑定一个公司，超过一个公司也会返回null)
	 */
	Boolean queryClientStatus(HashMap<String, Object> hashMap);
	/**
	 * 根据用户id查询公司id
	 * @param userId 
	 * @return 公司id
	 */
	Long queryFtClientIdByUserId(Long userId);

	/**
	 * @param client 用户对象 传入null返回false;client.getFtClientCompanyDO()传入null会返回false
	 * @return 是否成功
	 */
	boolean saveClient(FtClientDO client);
}
