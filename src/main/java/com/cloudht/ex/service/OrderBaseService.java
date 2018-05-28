package com.cloudht.ex.service;

import com.cloudht.ex.domain.OrderBaseDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单基本信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
public interface OrderBaseService {
	
	OrderBaseDO get(Long exOrderBaseId);
	
	List<OrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderBaseDO orderBase);
	
	int update(OrderBaseDO orderBase);
	
	int remove(Long exOrderBaseId);
	
	int batchRemove(Long[] exOrderBaseIds);
}
