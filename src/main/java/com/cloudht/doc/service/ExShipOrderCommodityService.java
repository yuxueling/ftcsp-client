package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExShipOrderCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 托单商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public interface ExShipOrderCommodityService {
	
	ExShipOrderCommodityDO get(Long exShipOrderCommodityId);
	
	List<ExShipOrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExShipOrderCommodityDO exShipOrderCommodity);
	
	int update(ExShipOrderCommodityDO exShipOrderCommodity);
	
	int remove(Long exShipOrderCommodityId);
	
	int batchRemove(Long[] exShipOrderCommodityIds);
}
