package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtExpressCommodityDao;
import com.cloudht.ft.domain.FtExpressCommodityDO;
import com.cloudht.ft.service.FtExpressCommodityService;



@Service
public class FtExpressCommodityServiceImpl implements FtExpressCommodityService {
	@Autowired
	private FtExpressCommodityDao ftExpressCommodityDao;
	
	@Override
	public FtExpressCommodityDO get(Long ftExpressCommodityId){
		return ftExpressCommodityDao.get(ftExpressCommodityId);
	}
	
	@Override
	public List<FtExpressCommodityDO> list(Map<String, Object> map){
		return ftExpressCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftExpressCommodityDao.count(map);
	}
	
	@Override
	public int save(FtExpressCommodityDO ftExpressCommodity){
		return ftExpressCommodityDao.save(ftExpressCommodity);
	}
	
	@Override
	public int update(FtExpressCommodityDO ftExpressCommodity){
		return ftExpressCommodityDao.update(ftExpressCommodity);
	}
	
	@Override
	public int remove(Long ftExpressCommodityId){
		return ftExpressCommodityDao.remove(ftExpressCommodityId);
	}
	
	@Override
	public int batchRemove(Long[] ftExpressCommodityIds){
		return ftExpressCommodityDao.batchRemove(ftExpressCommodityIds);
	}
	
}
