package com.cloudht.ex.dao;

import com.cloudht.ex.domain.OrderConfirmDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单确认信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
@Mapper
public interface OrderConfirmDao {

	OrderConfirmDO get(Long exOrderConfirmId);
	
	List<OrderConfirmDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderConfirmDO orderConfirm);
	
	int update(OrderConfirmDO orderConfirm);
	
	int remove(Long ex_order_confirm_id);
	
	int batchRemove(Long[] exOrderConfirmIds);
}
