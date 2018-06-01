package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtCustServiceDao;
import com.cloudht.ft.domain.FtCustServiceDO;
import com.cloudht.ft.service.FtCustServiceService;



@Service
public class FtCustServiceServiceImpl implements FtCustServiceService {
	@Autowired
	private FtCustServiceDao ftCustServiceDao;
	
	@Override
	public FtCustServiceDO get(Integer ftCustServiceId){
		return ftCustServiceDao.get(ftCustServiceId);
	}
	
	@Override
	public List<FtCustServiceDO> list(Map<String, Object> map){
		return ftCustServiceDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftCustServiceDao.count(map);
	}
	
	@Override
	public int save(FtCustServiceDO ftCustService){
		return ftCustServiceDao.save(ftCustService);
	}
	
	@Override
	public int update(FtCustServiceDO ftCustService){
		return ftCustServiceDao.update(ftCustService);
	}
	
	@Override
	public int remove(Integer ftCustServiceId){
		return ftCustServiceDao.remove(ftCustServiceId);
	}
	
	@Override
	public int batchRemove(Integer[] ftCustServiceIds){
		return ftCustServiceDao.batchRemove(ftCustServiceIds);
	}
	
}
