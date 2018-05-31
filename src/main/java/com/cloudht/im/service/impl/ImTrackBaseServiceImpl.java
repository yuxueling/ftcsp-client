package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImTrackBaseDao;
import com.cloudht.im.domain.ImTrackBaseDO;
import com.cloudht.im.service.ImTrackBaseService;



@Service
public class ImTrackBaseServiceImpl implements ImTrackBaseService {
	@Autowired
	private ImTrackBaseDao imTrackBaseDao;
	
	@Override
	public ImTrackBaseDO get(Long imTrackBaseId){
		return imTrackBaseDao.get(imTrackBaseId);
	}
	
	@Override
	public List<ImTrackBaseDO> list(Map<String, Object> map){
		return imTrackBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imTrackBaseDao.count(map);
	}
	
	@Override
	public int save(ImTrackBaseDO imTrackBase){
		return imTrackBaseDao.save(imTrackBase);
	}
	
	@Override
	public int update(ImTrackBaseDO imTrackBase){
		return imTrackBaseDao.update(imTrackBase);
	}
	
	@Override
	public int remove(Long imTrackBaseId){
		return imTrackBaseDao.remove(imTrackBaseId);
	}
	
	@Override
	public int batchRemove(Long[] imTrackBaseIds){
		return imTrackBaseDao.batchRemove(imTrackBaseIds);
	}
	
}
