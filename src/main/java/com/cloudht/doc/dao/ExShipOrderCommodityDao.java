package com.cloudht.doc.dao;

import com.cloudht.doc.domain.ExShipOrderCommodityDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 托单商品
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
@Mapper
public interface ExShipOrderCommodityDao {

	ExShipOrderCommodityDO get(Long exShipOrderCommodityId);
	
	List<ExShipOrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExShipOrderCommodityDO exShipOrderCommodity);
	
	int update(ExShipOrderCommodityDO exShipOrderCommodity);
	
	int remove(Long ex_ship_order_commodity_id);
	
	int batchRemove(Long[] exShipOrderCommodityIds);
}
