package com.cloudht.ex.dao;

import com.cloudht.ex.domain.OrderHeaderDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单头信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
@Mapper
public interface OrderHeaderDao {

	OrderHeaderDO get(Long exOrderHeaderId);
	
	List<OrderHeaderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderHeaderDO orderHeader);
	
	int update(OrderHeaderDO orderHeader);
	
	int remove(Long ex_order_header_id);
	
	int batchRemove(Long[] exOrderHeaderIds);
}
