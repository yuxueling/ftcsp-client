package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExFeeRegistrationDO;

import java.util.List;
import java.util.Map;

/**
 * 费用明细登记
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public interface ExFeeRegistrationService {
	
	ExFeeRegistrationDO get(Long exFeeRegistrationId);
	
	List<ExFeeRegistrationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExFeeRegistrationDO exFeeRegistration);
	
	int update(ExFeeRegistrationDO exFeeRegistration);
	
	int remove(Long exFeeRegistrationId);
	
	int batchRemove(Long[] exFeeRegistrationIds);
}
