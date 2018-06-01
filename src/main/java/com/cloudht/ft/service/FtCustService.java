package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtCustDO;

import java.util.List;
import java.util.Map;

/**
 * 客户信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public interface FtCustService {
	
	FtCustDO get(Integer ftCustId);
	
	List<FtCustDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustDO ftCust);
	
	int update(FtCustDO ftCust);
	
	int remove(Integer ftCustId);
	
	int batchRemove(Integer[] ftCustIds);
}
