package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtExpressBaseDO;

import java.util.List;
import java.util.Map;

/**
 * 快件信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:04:18
 */
public interface FtExpressBaseService {
	
	FtExpressBaseDO get(Long ftExpressBaseId);
	
	List<FtExpressBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtExpressBaseDO ftExpressBase);
	
	int update(FtExpressBaseDO ftExpressBase);
	
	int remove(Long ftExpressBaseId);
	
	int batchRemove(Long[] ftExpressBaseIds);
}
