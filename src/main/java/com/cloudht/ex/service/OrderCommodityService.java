package com.cloudht.ex.service;

import com.cloudht.ex.domain.OrderCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 出口订单商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
public interface OrderCommodityService {
	
	OrderCommodityDO get(Long exOrderCommodityId);
	
	List<OrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderCommodityDO orderCommodity);
	
	int update(OrderCommodityDO orderCommodity);
	
	int remove(Long exOrderCommodityId);
	
	int batchRemove(Long[] exOrderCommodityIds);
}
