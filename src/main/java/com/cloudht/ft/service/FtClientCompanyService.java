package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtClientCompanyDO;

import java.util.List;
import java.util.Map;

/**
 * 委托方公司表
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public interface FtClientCompanyService {
	
	FtClientCompanyDO get(Integer ftClientCompanyId);
	
	List<FtClientCompanyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtClientCompanyDO ftClientCompany);
	
	int update(FtClientCompanyDO ftClientCompany);
	
	int remove(Integer ftClientCompanyId);
	
	int batchRemove(Integer[] ftClientCompanyIds);
}
