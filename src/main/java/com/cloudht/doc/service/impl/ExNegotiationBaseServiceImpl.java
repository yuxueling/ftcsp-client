package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExNegotiationBaseDao;
import com.cloudht.doc.domain.ExNegotiationBaseDO;
import com.cloudht.doc.service.ExNegotiationBaseService;



@Service
public class ExNegotiationBaseServiceImpl implements ExNegotiationBaseService {
	@Autowired
	private ExNegotiationBaseDao exNegotiationBaseDao;
	
	@Override
	public ExNegotiationBaseDO get(Long exNegotiationBaseId){
		return exNegotiationBaseDao.get(exNegotiationBaseId);
	}
	
	@Override
	public List<ExNegotiationBaseDO> list(Map<String, Object> map){
		return exNegotiationBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exNegotiationBaseDao.count(map);
	}
	
	@Override
	public int save(ExNegotiationBaseDO exNegotiationBase){
		return exNegotiationBaseDao.save(exNegotiationBase);
	}
	
	@Override
	public int update(ExNegotiationBaseDO exNegotiationBase){
		return exNegotiationBaseDao.update(exNegotiationBase);
	}
	
	@Override
	public int remove(Long exNegotiationBaseId){
		return exNegotiationBaseDao.remove(exNegotiationBaseId);
	}
	
	@Override
	public int batchRemove(Long[] exNegotiationBaseIds){
		return exNegotiationBaseDao.batchRemove(exNegotiationBaseIds);
	}
	
}
