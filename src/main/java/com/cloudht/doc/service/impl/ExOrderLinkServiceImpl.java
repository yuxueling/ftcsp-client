package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExOrderLinkDao;
import com.cloudht.doc.domain.ExOrderLinkDO;
import com.cloudht.doc.service.ExOrderLinkService;



@Service
public class ExOrderLinkServiceImpl implements ExOrderLinkService {
	@Autowired
	private ExOrderLinkDao exOrderLinkDao;
	
	@Override
	public ExOrderLinkDO get(Long exOrderLinkId){
		return exOrderLinkDao.get(exOrderLinkId);
	}
	
	@Override
	public List<ExOrderLinkDO> list(Map<String, Object> map){
		return exOrderLinkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOrderLinkDao.count(map);
	}
	
	@Override
	public int save(ExOrderLinkDO exOrderLink){
		return exOrderLinkDao.save(exOrderLink);
	}
	
	@Override
	public int update(ExOrderLinkDO exOrderLink){
		return exOrderLinkDao.update(exOrderLink);
	}
	
	@Override
	public int remove(Long exOrderLinkId){
		return exOrderLinkDao.remove(exOrderLinkId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderLinkIds){
		return exOrderLinkDao.batchRemove(exOrderLinkIds);
	}
	
}
