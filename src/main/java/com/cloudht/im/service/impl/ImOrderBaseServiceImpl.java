package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImOrderBaseDao;
import com.cloudht.im.domain.ImOrderBaseDO;
import com.cloudht.im.service.ImOrderBaseService;



@Service
public class ImOrderBaseServiceImpl implements ImOrderBaseService {
	@Autowired
	private ImOrderBaseDao imOrderBaseDao;
	
	@Override
	public ImOrderBaseDO get(Long imOrderBaseId){
		return imOrderBaseDao.get(imOrderBaseId);
	}
	
	@Override
	public List<ImOrderBaseDO> list(Map<String, Object> map){
		return imOrderBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imOrderBaseDao.count(map);
	}
	
	@Override
	public int save(ImOrderBaseDO imOrderBase){
		return imOrderBaseDao.save(imOrderBase);
	}
	
	@Override
	public int update(ImOrderBaseDO imOrderBase){
		return imOrderBaseDao.update(imOrderBase);
	}
	
	@Override
	public int remove(Long imOrderBaseId){
		return imOrderBaseDao.remove(imOrderBaseId);
	}
	
	@Override
	public int batchRemove(Long[] imOrderBaseIds){
		return imOrderBaseDao.batchRemove(imOrderBaseIds);
	}
	
}
