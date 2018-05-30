package com.cloudht.ex.service;

import com.cloudht.ex.domain.ExOrderHeaderDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单头信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
public interface ExOrderHeaderService {
	
	ExOrderHeaderDO get(Long exOrderHeaderId);
	
	List<ExOrderHeaderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderHeaderDO exOrderHeader);
	
	int update(ExOrderHeaderDO exOrderHeader);
	
	int remove(Long exOrderHeaderId);
	
	int batchRemove(Long[] exOrderHeaderIds);
}
