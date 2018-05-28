package com.cloudht.ex.service;

import com.cloudht.ex.domain.OrderHeaderDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单头信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
public interface OrderHeaderService {
	
	OrderHeaderDO get(Long exOrderHeaderId);
	
	List<OrderHeaderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderHeaderDO orderHeader);
	
	int update(OrderHeaderDO orderHeader);
	
	int remove(Long exOrderHeaderId);
	
	int batchRemove(Long[] exOrderHeaderIds);
}
