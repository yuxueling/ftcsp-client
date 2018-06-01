package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtCustServiceDO;

import java.util.List;
import java.util.Map;

/**
 * 国外客户业务信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public interface FtCustServiceService {
	
	FtCustServiceDO get(Integer ftCustServiceId);
	
	List<FtCustServiceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustServiceDO ftCustService);
	
	int update(FtCustServiceDO ftCustService);
	
	int remove(Integer ftCustServiceId);
	
	int batchRemove(Integer[] ftCustServiceIds);
}
