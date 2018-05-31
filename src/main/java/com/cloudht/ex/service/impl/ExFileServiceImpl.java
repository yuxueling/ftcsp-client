package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.ExFileDao;
import com.cloudht.ex.domain.ExFileDO;
import com.cloudht.ex.service.ExFileService;



@Service
public class ExFileServiceImpl implements ExFileService {
	@Autowired
	private ExFileDao exFileDao;
	
	@Override
	public ExFileDO get(Long exFileId){
		return exFileDao.get(exFileId);
	}
	
	@Override
	public List<ExFileDO> list(Map<String, Object> map){
		return exFileDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exFileDao.count(map);
	}
	
	@Override
	public int save(ExFileDO exFile){
		return exFileDao.save(exFile);
	}
	
	@Override
	public int update(ExFileDO exFile){
		return exFileDao.update(exFile);
	}
	
	@Override
	public int remove(Long exFileId){
		return exFileDao.remove(exFileId);
	}
	
	@Override
	public int batchRemove(Long[] exFileIds){
		return exFileDao.batchRemove(exFileIds);
	}
	
}
