package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExShipOrderDao;
import com.cloudht.doc.domain.ExShipOrderDO;
import com.cloudht.doc.service.ExShipOrderService;



@Service
public class ExShipOrderServiceImpl implements ExShipOrderService {
	@Autowired
	private ExShipOrderDao exShipOrderDao;
	
	@Override
	public ExShipOrderDO get(Long exShipOrderId){
		return exShipOrderDao.get(exShipOrderId);
	}
	
	@Override
	public List<ExShipOrderDO> list(Map<String, Object> map){
		return exShipOrderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exShipOrderDao.count(map);
	}
	
	@Override
	public int save(ExShipOrderDO exShipOrder){
		return exShipOrderDao.save(exShipOrder);
	}
	
	@Override
	public int update(ExShipOrderDO exShipOrder){
		return exShipOrderDao.update(exShipOrder);
	}
	
	@Override
	public int remove(Long exShipOrderId){
		return exShipOrderDao.remove(exShipOrderId);
	}
	
	@Override
	public int batchRemove(Long[] exShipOrderIds){
		return exShipOrderDao.batchRemove(exShipOrderIds);
	}
	
}
