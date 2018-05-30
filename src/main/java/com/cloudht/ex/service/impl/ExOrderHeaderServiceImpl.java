package com.cloudht.ex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ex.dao.ExOrderHeaderDao;
import com.cloudht.ex.domain.ExOrderHeaderDO;
import com.cloudht.ex.service.ExOrderHeaderService;



@Service
public class ExOrderHeaderServiceImpl implements ExOrderHeaderService {
	@Autowired
	private ExOrderHeaderDao exOrderHeaderDao;
	
	@Override
	public ExOrderHeaderDO get(Long exOrderHeaderId){
		return exOrderHeaderDao.get(exOrderHeaderId);
	}
	
	@Override
	public List<ExOrderHeaderDO> list(Map<String, Object> map){
		return exOrderHeaderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOrderHeaderDao.count(map);
	}
	
	@Override
	public int save(ExOrderHeaderDO exOrderHeader){
		return exOrderHeaderDao.save(exOrderHeader);
	}
	
	@Override
	public int update(ExOrderHeaderDO exOrderHeader){
		return exOrderHeaderDao.update(exOrderHeader);
	}
	
	@Override
	public int remove(Long exOrderHeaderId){
		return exOrderHeaderDao.remove(exOrderHeaderId);
	}
	
	@Override
	public int batchRemove(Long[] exOrderHeaderIds){
		return exOrderHeaderDao.batchRemove(exOrderHeaderIds);
	}
	
}
