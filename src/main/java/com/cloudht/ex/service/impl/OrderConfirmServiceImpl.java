package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.OrderConfirmDao;
import com.cloudht.ex.domain.OrderConfirmDO;
import com.cloudht.ex.service.OrderConfirmService;



@Service
public class OrderConfirmServiceImpl implements OrderConfirmService {
	@Autowired
	private OrderConfirmDao orderConfirmDao;
	
	@Override
	public OrderConfirmDO get(Long exOrderConfirmId){
		return orderConfirmDao.get(exOrderConfirmId);
	}
	
	@Override
	public List<OrderConfirmDO> list(Map<String, Object> map){
		return orderConfirmDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderConfirmDao.count(map);
	}
	
	@Override
	public int save(OrderConfirmDO orderConfirm){
		return orderConfirmDao.save(orderConfirm);
	}
	
	@Override
	public int update(OrderConfirmDO orderConfirm){
		return orderConfirmDao.update(orderConfirm);
	}
	
	@Override
	public int remove(Long exOrderConfirmId){
		return orderConfirmDao.remove(exOrderConfirmId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderConfirmIds){
		return orderConfirmDao.batchRemove(exOrderConfirmIds);
	}
	
}
