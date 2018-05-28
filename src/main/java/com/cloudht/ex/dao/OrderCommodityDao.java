package com.cloudht.ex.dao;

import com.cloudht.ex.domain.OrderCommodityDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单商品
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
@Mapper
public interface OrderCommodityDao {

	OrderCommodityDO get(Long exOrderCommodityId);
	
	List<OrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderCommodityDO orderCommodity);
	
	int update(OrderCommodityDO orderCommodity);
	
	int remove(Long ex_order_commodity_id);
	
	int batchRemove(Long[] exOrderCommodityIds);
}
