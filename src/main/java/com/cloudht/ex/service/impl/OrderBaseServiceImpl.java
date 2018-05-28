package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.OrderBaseDao;
import com.cloudht.ex.domain.OrderBaseDO;
import com.cloudht.ex.service.OrderBaseService;



@Service
public class OrderBaseServiceImpl implements OrderBaseService {
	@Autowired
	private OrderBaseDao orderBaseDao;
	
	@Override
	public OrderBaseDO get(Long exOrderBaseId){
		return orderBaseDao.get(exOrderBaseId);
	}
	
	@Override
	public List<OrderBaseDO> list(Map<String, Object> map){
		return orderBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orderBaseDao.count(map);
	}
	
	@Override
	public int save(OrderBaseDO orderBase){
		return orderBaseDao.save(orderBase);
	}
	
	@Override
	public int update(OrderBaseDO orderBase){
		return orderBaseDao.update(orderBase);
	}
	
	@Override
	public int remove(Long exOrderBaseId){
		return orderBaseDao.remove(exOrderBaseId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderBaseIds){
		return orderBaseDao.batchRemove(exOrderBaseIds);
	}
	
}
