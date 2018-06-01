package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtCustContactDO;

import java.util.List;
import java.util.Map;

/**
 * 客户联系人信息表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public interface FtCustContactService {
	
	FtCustContactDO get(Integer ftCustContactId);
	
	List<FtCustContactDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustContactDO ftCustContact);
	
	int update(FtCustContactDO ftCustContact);
	
	int remove(Integer ftCustContactId);
	
	int batchRemove(Integer[] ftCustContactIds);
}
