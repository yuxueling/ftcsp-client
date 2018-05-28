package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExCreditDao;
import com.cloudht.doc.domain.ExCreditDO;
import com.cloudht.doc.service.ExCreditService;



@Service
public class ExCreditServiceImpl implements ExCreditService {
	@Autowired
	private ExCreditDao exCreditDao;
	
	@Override
	public ExCreditDO get(Long exCreditId){
		return exCreditDao.get(exCreditId);
	}
	
	@Override
	public List<ExCreditDO> list(Map<String, Object> map){
		return exCreditDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exCreditDao.count(map);
	}
	
	@Override
	public int save(ExCreditDO exCredit){
		return exCreditDao.save(exCredit);
	}
	
	@Override
	public int update(ExCreditDO exCredit){
		return exCreditDao.update(exCredit);
	}
	
	@Override
	public int remove(Long exCreditId){
		return exCreditDao.remove(exCreditId);
	}
	
	@Override
	public int batchRemove(Long[] exCreditIds){
		return exCreditDao.batchRemove(exCreditIds);
	}
	
}
