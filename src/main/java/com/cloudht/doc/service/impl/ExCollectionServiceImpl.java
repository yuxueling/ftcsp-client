package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExCollectionDao;
import com.cloudht.doc.domain.ExCollectionDO;
import com.cloudht.doc.service.ExCollectionService;



@Service
public class ExCollectionServiceImpl implements ExCollectionService {
	@Autowired
	private ExCollectionDao exCollectionDao;
	
	@Override
	public ExCollectionDO get(Long exCollectionId){
		return exCollectionDao.get(exCollectionId);
	}
	
	@Override
	public List<ExCollectionDO> list(Map<String, Object> map){
		return exCollectionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exCollectionDao.count(map);
	}
	
	@Override
	public int save(ExCollectionDO exCollection){
		return exCollectionDao.save(exCollection);
	}
	
	@Override
	public int update(ExCollectionDO exCollection){
		return exCollectionDao.update(exCollection);
	}
	
	@Override
	public int remove(Long exCollectionId){
		return exCollectionDao.remove(exCollectionId);
	}
	
	@Override
	public int batchRemove(Long[] exCollectionIds){
		return exCollectionDao.batchRemove(exCollectionIds);
	}
	
}
