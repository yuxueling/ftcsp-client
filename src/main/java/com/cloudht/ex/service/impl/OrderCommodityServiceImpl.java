package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.OrderCommodityDao;
import com.cloudht.ex.domain.OrderCommodityDO;
import com.cloudht.ex.service.OrderCommodityService;



@Service
public class OrderCommodityServiceImpl implements OrderCommodityService {
	@Autowired
	private OrderCommodityDao orderCommodityDao;
	
	@Override
	public OrderCommodityDO get(Long exOrderCommodityId){
		return orderCommodityDao.get(exOrderCommodityId);
	}
	
	@Override
	public List<OrderCommodityDO> list(Map<String, Object> map){
		return orderCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderCommodityDao.count(map);
	}
	
	@Override
	public int save(OrderCommodityDO orderCommodity){
		return orderCommodityDao.save(orderCommodity);
	}
	
	@Override
	public int update(OrderCommodityDO orderCommodity){
		return orderCommodityDao.update(orderCommodity);
	}
	
	@Override
	public int remove(Long exOrderCommodityId){
		return orderCommodityDao.remove(exOrderCommodityId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderCommodityIds){
		return orderCommodityDao.batchRemove(exOrderCommodityIds);
	}
	
}
