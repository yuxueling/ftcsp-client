package com.cloudht.ft.service;


import java.util.List;
import java.util.Map;

import com.cloudht.ft.domain.SysHscodeDO;

/**
 * HS编码
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 16:21:30
 */
public interface SysHscodeService {
	
	SysHscodeDO get(Integer sysHscodeId);
	
	List<SysHscodeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SysHscodeDO sysHscode);
	
	int update(SysHscodeDO sysHscode);
	
	int remove(Integer sysHscodeId);
	
	int batchRemove(Integer[] sysHscodeIds);
}
