package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtCustContactDao;
import com.cloudht.ft.domain.FtCustContactDO;
import com.cloudht.ft.service.FtCustContactService;



@Service
public class FtCustContactServiceImpl implements FtCustContactService {
	@Autowired
	private FtCustContactDao ftCustContactDao;
	
	@Override
	public FtCustContactDO get(Integer ftCustContactId){
		return ftCustContactDao.get(ftCustContactId);
	}
	
	@Override
	public List<FtCustContactDO> list(Map<String, Object> map){
		return ftCustContactDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftCustContactDao.count(map);
	}
	
	@Override
	public int save(FtCustContactDO ftCustContact){
		return ftCustContactDao.save(ftCustContact);
	}
	
	@Override
	public int update(FtCustContactDO ftCustContact){
		return ftCustContactDao.update(ftCustContact);
	}
	
	@Override
	public int remove(Integer ftCustContactId){
		return ftCustContactDao.remove(ftCustContactId);
	}
	
	@Override
	public int batchRemove(Integer[] ftCustContactIds){
		return ftCustContactDao.batchRemove(ftCustContactIds);
	}
	
}
