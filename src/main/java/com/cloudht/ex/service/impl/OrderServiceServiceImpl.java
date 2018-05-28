package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.OrderServiceDao;
import com.cloudht.ex.domain.OrderServiceDO;
import com.cloudht.ex.service.OrderServiceService;



@Service
public class OrderServiceServiceImpl implements OrderServiceService {
	@Autowired
	private OrderServiceDao orderServiceDao;
	
	@Override
	public OrderServiceDO get(Integer exOrderServiceId){
		return orderServiceDao.get(exOrderServiceId);
	}
	
	@Override
	public List<OrderServiceDO> list(Map<String, Object> map){
		return orderServiceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderServiceDao.count(map);
	}
	
	@Override
	public int save(OrderServiceDO orderService){
		return orderServiceDao.save(orderService);
	}
	
	@Override
	public int update(OrderServiceDO orderService){
		return orderServiceDao.update(orderService);
	}
	
	@Override
	public int remove(Integer exOrderServiceId){
		return orderServiceDao.remove(exOrderServiceId);
	}
	
	@Override
	public int batchRemove(Integer[] exOrderServiceIds){
		return orderServiceDao.batchRemove(exOrderServiceIds);
	}
	
}
