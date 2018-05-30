package com.cloudht.ex.service;

import com.cloudht.ex.domain.ExOrderServiceDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单服务
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
public interface ExOrderServiceService {
	
	ExOrderServiceDO get(Integer exOrderServiceId);
	
	List<ExOrderServiceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderServiceDO exOrderService);
	
	int update(ExOrderServiceDO exOrderService);
	
	int remove(Integer exOrderServiceId);
	
	int batchRemove(Integer[] exOrderServiceIds);
}
