package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImOrderCommodityDao;
import com.cloudht.im.domain.ImOrderCommodityDO;
import com.cloudht.im.service.ImOrderCommodityService;



@Service
public class ImOrderCommodityServiceImpl implements ImOrderCommodityService {
	@Autowired
	private ImOrderCommodityDao imOrderCommodityDao;
	
	@Override
	public ImOrderCommodityDO get(Long imOrderCommodityId){
		return imOrderCommodityDao.get(imOrderCommodityId);
	}
	
	@Override
	public List<ImOrderCommodityDO> list(Map<String, Object> map){
		return imOrderCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imOrderCommodityDao.count(map);
	}
	
	@Override
	public int save(ImOrderCommodityDO imOrderCommodity){
		return imOrderCommodityDao.save(imOrderCommodity);
	}
	
	@Override
	public int update(ImOrderCommodityDO imOrderCommodity){
		return imOrderCommodityDao.update(imOrderCommodity);
	}
	
	@Override
	public int remove(Long imOrderCommodityId){
		return imOrderCommodityDao.remove(imOrderCommodityId);
	}
	
	@Override
	public int batchRemove(Long[] imOrderCommodityIds){
		return imOrderCommodityDao.batchRemove(imOrderCommodityIds);
	}
	
}
