package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExOrderOperationDao;
import com.cloudht.doc.domain.ExOrderOperationDO;
import com.cloudht.doc.service.ExOrderOperationService;



@Service
public class ExOrderOperationServiceImpl implements ExOrderOperationService {
	@Autowired
	private ExOrderOperationDao exOrderOperationDao;
	
	@Override
	public ExOrderOperationDO get(Long exOrderOperationId){
		return exOrderOperationDao.get(exOrderOperationId);
	}
	
	@Override
	public List<ExOrderOperationDO> list(Map<String, Object> map){
		return exOrderOperationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOrderOperationDao.count(map);
	}
	
	@Override
	public int save(ExOrderOperationDO exOrderOperation){
		return exOrderOperationDao.save(exOrderOperation);
	}
	
	@Override
	public int update(ExOrderOperationDO exOrderOperation){
		return exOrderOperationDao.update(exOrderOperation);
	}
	
	@Override
	public int remove(Long exOrderOperationId){
		return exOrderOperationDao.remove(exOrderOperationId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderOperationIds){
		return exOrderOperationDao.batchRemove(exOrderOperationIds);
	}
	
}
