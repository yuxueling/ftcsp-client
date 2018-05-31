package com.cloudht.ex.dao;

import com.cloudht.ex.domain.ExShipOrderDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 托单信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:00:23
 */
@Mapper
public interface ExShipOrderDao {

	ExShipOrderDO get(Long exShipOrderId);
	
	List<ExShipOrderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExShipOrderDO exShipOrder);
	
	int update(ExShipOrderDO exShipOrder);
	
	int remove(Long ex_ship_order_id);
	
	int batchRemove(Long[] exShipOrderIds);
}
