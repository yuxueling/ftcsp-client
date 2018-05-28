package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExShipOrderCommodityDao;
import com.cloudht.doc.domain.ExShipOrderCommodityDO;
import com.cloudht.doc.service.ExShipOrderCommodityService;



@Service
public class ExShipOrderCommodityServiceImpl implements ExShipOrderCommodityService {
	@Autowired
	private ExShipOrderCommodityDao exShipOrderCommodityDao;
	
	@Override
	public ExShipOrderCommodityDO get(Long exShipOrderCommodityId){
		return exShipOrderCommodityDao.get(exShipOrderCommodityId);
	}
	
	@Override
	public List<ExShipOrderCommodityDO> list(Map<String, Object> map){
		return exShipOrderCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exShipOrderCommodityDao.count(map);
	}
	
	@Override
	public int save(ExShipOrderCommodityDO exShipOrderCommodity){
		return exShipOrderCommodityDao.save(exShipOrderCommodity);
	}
	
	@Override
	public int update(ExShipOrderCommodityDO exShipOrderCommodity){
		return exShipOrderCommodityDao.update(exShipOrderCommodity);
	}
	
	@Override
	public int remove(Long exShipOrderCommodityId){
		return exShipOrderCommodityDao.remove(exShipOrderCommodityId);
	}
	
	@Override
	public int batchRemove(Long[] exShipOrderCommodityIds){
		return exShipOrderCommodityDao.batchRemove(exShipOrderCommodityIds);
	}
	
}
