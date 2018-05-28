package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImFileDao;
import com.cloudht.im.domain.ImFileDO;
import com.cloudht.im.service.ImFileService;



@Service
public class ImFileServiceImpl implements ImFileService {
	@Autowired
	private ImFileDao imFileDao;
	
	@Override
	public ImFileDO get(Long imFileId){
		return imFileDao.get(imFileId);
	}
	
	@Override
	public List<ImFileDO> list(Map<String, Object> map){
		return imFileDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imFileDao.count(map);
	}
	
	@Override
	public int save(ImFileDO imFile){
		return imFileDao.save(imFile);
	}
	
	@Override
	public int update(ImFileDO imFile){
		return imFileDao.update(imFile);
	}
	
	@Override
	public int remove(Long imFileId){
		return imFileDao.remove(imFileId);
	}
	
	@Override
	public int batchRemove(Long[] imFileIds){
		return imFileDao.batchRemove(imFileIds);
	}
	
}
