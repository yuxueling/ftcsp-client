package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtCustDao;
import com.cloudht.ft.domain.FtCustDO;
import com.cloudht.ft.service.FtCustService;



@Service
public class FtCustServiceImpl implements FtCustService {
	@Autowired
	private FtCustDao ftCustDao;
	
	@Override
	public FtCustDO get(Integer ftCustId){
		return ftCustDao.get(ftCustId);
	}
	
	@Override
	public List<FtCustDO> list(Map<String, Object> map){
		return ftCustDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftCustDao.count(map);
	}
	
	@Override
	public int save(FtCustDO ftCust){
		return ftCustDao.save(ftCust);
	}
	
	@Override
	public int update(FtCustDO ftCust){
		return ftCustDao.update(ftCust);
	}
	
	@Override
	public int remove(Integer ftCustId){
		return ftCustDao.remove(ftCustId);
	}
	
	@Override
	public int batchRemove(Integer[] ftCustIds){
		return ftCustDao.batchRemove(ftCustIds);
	}
	
}
