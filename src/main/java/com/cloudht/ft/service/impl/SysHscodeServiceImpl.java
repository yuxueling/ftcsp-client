package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudht.ft.dao.SysHscodeDao;
import com.cloudht.ft.domain.SysHscodeDO;
import com.cloudht.ft.service.SysHscodeService;

import java.util.List;
import java.util.Map;



@Service
public class SysHscodeServiceImpl implements SysHscodeService {
	@Autowired
	private SysHscodeDao sysHscodeDao;
	
	@Override
	public SysHscodeDO get(Integer sysHscodeId){
		return sysHscodeDao.get(sysHscodeId);
	}
	
	@Override
	public List<SysHscodeDO> list(Map<String, Object> map){
		return sysHscodeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return sysHscodeDao.count(map);
	}
	
	@Override
	public int save(SysHscodeDO sysHscode){
		return sysHscodeDao.save(sysHscode);
	}
	
	@Override
	public int update(SysHscodeDO sysHscode){
		return sysHscodeDao.update(sysHscode);
	}
	
	@Override
	public int remove(Integer sysHscodeId){
		return sysHscodeDao.remove(sysHscodeId);
	}
	
	@Override
	public int batchRemove(Integer[] sysHscodeIds){
		return sysHscodeDao.batchRemove(sysHscodeIds);
	}
	
}
