package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.OrderHeaderDao;
import com.cloudht.ex.domain.OrderHeaderDO;
import com.cloudht.ex.service.OrderHeaderService;



@Service
public class OrderHeaderServiceImpl implements OrderHeaderService {
	@Autowired
	private OrderHeaderDao orderHeaderDao;
	
	@Override
	public OrderHeaderDO get(Long exOrderHeaderId){
		return orderHeaderDao.get(exOrderHeaderId);
	}
	
	@Override
	public List<OrderHeaderDO> list(Map<String, Object> map){
		return orderHeaderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderHeaderDao.count(map);
	}
	
	@Override
	public int save(OrderHeaderDO orderHeader){
		return orderHeaderDao.save(orderHeader);
	}
	
	@Override
	public int update(OrderHeaderDO orderHeader){
		return orderHeaderDao.update(orderHeader);
	}
	
	@Override
	public int remove(Long exOrderHeaderId){
		return orderHeaderDao.remove(exOrderHeaderId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderHeaderIds){
		return orderHeaderDao.batchRemove(exOrderHeaderIds);
	}
	
}
