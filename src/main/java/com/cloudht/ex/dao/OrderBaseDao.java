package com.cloudht.ex.dao;

import com.cloudht.ex.domain.OrderBaseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单基本信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-18 11:36:14
 */
@Mapper
public interface OrderBaseDao {

	OrderBaseDO get(Long exOrderBaseId);
	
	List<OrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrderBaseDO orderBase);
	
	int update(OrderBaseDO orderBase);
	
	int remove(Long ex_order_base_id);
	
	int batchRemove(Long[] exOrderBaseIds);
}
