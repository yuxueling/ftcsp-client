package com.cloudht.ex.service;

import com.cloudht.ex.domain.OrderServiceDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单服务
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
public interface OrderServiceService {
	
	OrderServiceDO get(Integer exOrderServiceId);
	
	List<OrderServiceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderServiceDO orderService);
	
	int update(OrderServiceDO orderService);
	
	int remove(Integer exOrderServiceId);
	
	int batchRemove(Integer[] exOrderServiceIds);
}
