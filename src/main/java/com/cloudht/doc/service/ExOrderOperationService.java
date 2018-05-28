package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExOrderOperationDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 17:59:26
 */
public interface ExOrderOperationService {
	
	ExOrderOperationDO get(Long exOrderOperationId);
	
	List<ExOrderOperationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderOperationDO exOrderOperation);
	
	int update(ExOrderOperationDO exOrderOperation);
	
	int remove(Long exOrderOperationId);
	
	int batchRemove(Long[] exOrderOperationIds);
}
