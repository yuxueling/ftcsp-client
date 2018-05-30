package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.ExOrderBaseDao;
import com.cloudht.ex.domain.ExOrderBaseDO;
import com.cloudht.ex.service.ExOrderBaseService;



@Service
public class ExOrderBaseServiceImpl implements ExOrderBaseService {
	@Autowired
	private ExOrderBaseDao exOrderBaseDao;
	
	@Override
	public ExOrderBaseDO get(Long exOrderBaseId){
		return exOrderBaseDao.get(exOrderBaseId);
	}
	
	@Override
	public List<ExOrderBaseDO> list(Map<String, Object> map){
		return exOrderBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOrderBaseDao.count(map);
	}
	
	@Override
	public int save(ExOrderBaseDO exOrderBase){
		return exOrderBaseDao.save(exOrderBase);
	}
	
	@Override
	public int update(ExOrderBaseDO exOrderBase){
		return exOrderBaseDao.update(exOrderBase);
	}
	
	@Override
	public int remove(Long exOrderBaseId){
		return exOrderBaseDao.remove(exOrderBaseId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderBaseIds){
		return exOrderBaseDao.batchRemove(exOrderBaseIds);
	}
	
}
