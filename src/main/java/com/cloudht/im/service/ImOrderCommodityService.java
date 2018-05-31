package com.cloudht.im.service;

import com.cloudht.im.domain.ImOrderCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 进口订单商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
public interface ImOrderCommodityService {
	
	ImOrderCommodityDO get(Long imOrderCommodityId);
	
	List<ImOrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImOrderCommodityDO imOrderCommodity);
	
	int update(ImOrderCommodityDO imOrderCommodity);
	
	int remove(Long imOrderCommodityId);
	
	int batchRemove(Long[] imOrderCommodityIds);
}
