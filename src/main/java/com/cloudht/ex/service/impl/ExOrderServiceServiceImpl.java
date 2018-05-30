package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.ExOrderServiceDao;
import com.cloudht.ex.domain.ExOrderServiceDO;
import com.cloudht.ex.service.ExOrderServiceService;



@Service
public class ExOrderServiceServiceImpl implements ExOrderServiceService {
	@Autowired
	private ExOrderServiceDao exOrderServiceDao;
	
	@Override
	public ExOrderServiceDO get(Integer exOrderServiceId){
		return exOrderServiceDao.get(exOrderServiceId);
	}
	
	@Override
	public List<ExOrderServiceDO> list(Map<String, Object> map){
		return exOrderServiceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOrderServiceDao.count(map);
	}
	
	@Override
	public int save(ExOrderServiceDO exOrderService){
		return exOrderServiceDao.save(exOrderService);
	}
	
	@Override
	public int update(ExOrderServiceDO exOrderService){
		return exOrderServiceDao.update(exOrderService);
	}
	
	@Override
	public int remove(Integer exOrderServiceId){
		return exOrderServiceDao.remove(exOrderServiceId);
	}
	
	@Override
	public int batchRemove(Integer[] exOrderServiceIds){
		return exOrderServiceDao.batchRemove(exOrderServiceIds);
	}
	
}
