package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtInspectionCommodityDao;
import com.cloudht.ft.domain.FtInspectionCommodityDO;
import com.cloudht.ft.service.FtInspectionCommodityService;



@Service
public class FtInspectionCommodityServiceImpl implements FtInspectionCommodityService {
	@Autowired
	private FtInspectionCommodityDao ftInspectionCommodityDao;
	
	@Override
	public FtInspectionCommodityDO get(Integer ftInspectionCommodityId){
		return ftInspectionCommodityDao.get(ftInspectionCommodityId);
	}
	
	@Override
	public List<FtInspectionCommodityDO> list(Map<String, Object> map){
		return ftInspectionCommodityDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftInspectionCommodityDao.count(map);
	}
	
	@Override
	public int save(FtInspectionCommodityDO ftInspectionCommodity){
		return ftInspectionCommodityDao.save(ftInspectionCommodity);
	}
	
	@Override
	public int update(FtInspectionCommodityDO ftInspectionCommodity){
		return ftInspectionCommodityDao.update(ftInspectionCommodity);
	}
	
	@Override
	public int remove(Integer ftInspectionCommodityId){
		return ftInspectionCommodityDao.remove(ftInspectionCommodityId);
	}
	
	@Override
	public int batchRemove(Integer[] ftInspectionCommodityIds){
		return ftInspectionCommodityDao.batchRemove(ftInspectionCommodityIds);
	}
	
}
