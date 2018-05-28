package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExCreditDO;

import java.util.List;
import java.util.Map;

/**
 * 信用证
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public interface ExCreditService {
	
	ExCreditDO get(Long exCreditId);
	
	List<ExCreditDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExCreditDO exCredit);
	
	int update(ExCreditDO exCredit);
	
	int remove(Long exCreditId);
	
	int batchRemove(Long[] exCreditIds);
}
