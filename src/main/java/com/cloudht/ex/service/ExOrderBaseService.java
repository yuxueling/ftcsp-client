package com.cloudht.ex.service;

import com.cloudht.ex.domain.ExOrderBaseDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单基本信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
public interface ExOrderBaseService {
	
	ExOrderBaseDO get(Long exOrderBaseId);
	
	List<ExOrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderBaseDO exOrderBase);
	
	int update(ExOrderBaseDO exOrderBase);
	
	int remove(Long exOrderBaseId);
	
	int batchRemove(Long[] exOrderBaseIds);
}
