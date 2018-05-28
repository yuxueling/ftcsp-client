package com.cloudht.im.dao;

import com.cloudht.im.domain.ImOrderCommodityDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 进口订单商品
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
@Mapper
public interface ImOrderCommodityDao {

	ImOrderCommodityDO get(Long imOrderCommodityId);
	
	List<ImOrderCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImOrderCommodityDO imOrderCommodity);
	
	int update(ImOrderCommodityDO imOrderCommodity);
	
	int remove(Long im_order_commodity_id);
	
	int batchRemove(Long[] imOrderCommodityIds);
}
