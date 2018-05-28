package com.cloudht.fi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.fi.dao.ReleaseRateDao;
import com.cloudht.fi.domain.ReleaseRateDO;
import com.cloudht.fi.service.ReleaseRateService;



@Service
public class ReleaseRateServiceImpl implements ReleaseRateService {
	@Autowired
	private ReleaseRateDao releaseRateDao;
	
	@Override
	public ReleaseRateDO get(Integer fiReleaseRateId){
		return releaseRateDao.get(fiReleaseRateId);
	}
	
	@Override
	public List<ReleaseRateDO> list(Map<String, Object> map){
		return releaseRateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return releaseRateDao.count(map);
	}
	
	@Override
	public int save(ReleaseRateDO releaseRate){
		return releaseRateDao.save(releaseRate);
	}
	
	@Override
	public int update(ReleaseRateDO releaseRate){
		return releaseRateDao.update(releaseRate);
	}
	
	@Override
	public int remove(Integer fiReleaseRateId){
		return releaseRateDao.remove(fiReleaseRateId);
	}
	
	@Override
	public int batchRemove(Integer[] fiReleaseRateIds){
		return releaseRateDao.batchRemove(fiReleaseRateIds);
	}
	
}
