package com.cloudht.ex.service;

import com.cloudht.ex.domain.ExShipOrderDO;

import java.util.List;
import java.util.Map;

/**
 * 托单信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:00:23
 */
public interface ExShipOrderService {
	
	ExShipOrderDO get(Long exShipOrderId);
	
	List<ExShipOrderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExShipOrderDO exShipOrder);
	
	int update(ExShipOrderDO exShipOrder);
	
	int remove(Long exShipOrderId);
	
	int batchRemove(Long[] exShipOrderIds);
}
