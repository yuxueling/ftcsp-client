package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtCustBankDao;
import com.cloudht.ft.domain.FtCustBankDO;
import com.cloudht.ft.service.FtCustBankService;



@Service
public class FtCustBankServiceImpl implements FtCustBankService {
	@Autowired
	private FtCustBankDao ftCustBankDao;
	
	@Override
	public FtCustBankDO get(Integer ftCustBankId){
		return ftCustBankDao.get(ftCustBankId);
	}
	
	@Override
	public List<FtCustBankDO> list(Map<String, Object> map){
		return ftCustBankDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftCustBankDao.count(map);
	}
	
	@Override
	public int save(FtCustBankDO ftCustBank){
		return ftCustBankDao.save(ftCustBank);
	}
	
	@Override
	public int update(FtCustBankDO ftCustBank){
		return ftCustBankDao.update(ftCustBank);
	}
	
	@Override
	public int remove(Integer ftCustBankId){
		return ftCustBankDao.remove(ftCustBankId);
	}
	
	@Override
	public int batchRemove(Integer[] ftCustBankIds){
		return ftCustBankDao.batchRemove(ftCustBankIds);
	}
	
}
