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
	 * 查询公司状态
	 * @param hashMap 
	 * @return
	 */
	String queryClientStatus(HashMap<String, Object> hashMap);
	/**
	 * 根据用户id查询公司id
	 * @param userId 
	 * @return 公司id
	 */
	Long queryFtClientIdByUserId(Long userId);
}
