package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtCommodityDao;
import com.cloudht.ft.domain.FtCommodityDO;
import com.cloudht.ft.service.FtCommodityService;



@Service
public class FtCommodityServiceImpl implements FtCommodityService {
	@Autowired
	private FtCommodityDao ftCommodityDao;
	
	@Override
	public FtCommodityDO get(Integer ftCommodityId){
		return ftCommodityDao.get(ftCommodityId);
	}
	
	@Override
	public List<FtCommodityDO> list(Map<String, Object> map){
		return ftCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftCommodityDao.count(map);
	}
	
	@Override
	public int save(FtCommodityDO ftCommodity){
		return ftCommodityDao.save(ftCommodity);
	}
	
	@Override
	public int update(FtCommodityDO ftCommodity){
		return ftCommodityDao.update(ftCommodity);
	}
	
	@Override
	public int remove(Integer ftCommodityId){
		return ftCommodityDao.remove(ftCommodityId);
	}
	
	@Override
	public int batchRemove(Integer[] ftCommodityIds){
		return ftCommodityDao.batchRemove(ftCommodityIds);
	}
	
}
