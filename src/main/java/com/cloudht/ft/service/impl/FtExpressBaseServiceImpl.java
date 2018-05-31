package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtExpressBaseDao;
import com.cloudht.ft.domain.FtExpressBaseDO;
import com.cloudht.ft.service.FtExpressBaseService;



@Service
public class FtExpressBaseServiceImpl implements FtExpressBaseService {
	@Autowired
	private FtExpressBaseDao ftExpressBaseDao;
	
	@Override
	public FtExpressBaseDO get(Long ftExpressBaseId){
		return ftExpressBaseDao.get(ftExpressBaseId);
	}
	
	@Override
	public List<FtExpressBaseDO> list(Map<String, Object> map){
		return ftExpressBaseDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftExpressBaseDao.count(map);
	}
	
	@Override
	public int save(FtExpressBaseDO ftExpressBase){
		return ftExpressBaseDao.save(ftExpressBase);
	}
	
	@Override
	public int update(FtExpressBaseDO ftExpressBase){
		return ftExpressBaseDao.update(ftExpressBase);
	}
	
	@Override
	public int remove(Long ftExpressBaseId){
		return ftExpressBaseDao.remove(ftExpressBaseId);
	}
	
	@Override
	public int batchRemove(Long[] ftExpressBaseIds){
		return ftExpressBaseDao.batchRemove(ftExpressBaseIds);
	}
	
}
