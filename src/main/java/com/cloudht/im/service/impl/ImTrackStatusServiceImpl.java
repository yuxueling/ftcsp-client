package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImTrackStatusDao;
import com.cloudht.im.domain.ImTrackStatusDO;
import com.cloudht.im.service.ImTrackStatusService;



@Service
public class ImTrackStatusServiceImpl implements ImTrackStatusService {
	@Autowired
	private ImTrackStatusDao imTrackStatusDao;
	
	@Override
	public ImTrackStatusDO get(Long imTrackStatusId){
		return imTrackStatusDao.get(imTrackStatusId);
	}
	
	@Override
	public List<ImTrackStatusDO> list(Map<String, Object> map){
		return imTrackStatusDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imTrackStatusDao.count(map);
	}
	
	@Override
	public int save(ImTrackStatusDO imTrackStatus){
		return imTrackStatusDao.save(imTrackStatus);
	}
	
	@Override
	public int update(ImTrackStatusDO imTrackStatus){
		return imTrackStatusDao.update(imTrackStatus);
	}
	
	@Override
	public int remove(Long imTrackStatusId){
		return imTrackStatusDao.remove(imTrackStatusId);
	}
	
	@Override
	public int batchRemove(Long[] imTrackStatusIds){
		return imTrackStatusDao.batchRemove(imTrackStatusIds);
	}
	
}
