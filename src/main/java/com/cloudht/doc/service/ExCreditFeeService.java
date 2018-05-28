package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExCreditFeeDO;

import java.util.List;
import java.util.Map;

/**
 * 信用证费用
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public interface ExCreditFeeService {
	
	ExCreditFeeDO get(Long exCreditFeeId);
	
	List<ExCreditFeeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExCreditFeeDO exCreditFee);
	
	int update(ExCreditFeeDO exCreditFee);
	
	int remove(Long exCreditFeeId);
	
	int batchRemove(Long[] exCreditFeeIds);
}
