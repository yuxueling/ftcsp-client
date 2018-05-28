package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExCreditFeeDao;
import com.cloudht.doc.domain.ExCreditFeeDO;
import com.cloudht.doc.service.ExCreditFeeService;



@Service
public class ExCreditFeeServiceImpl implements ExCreditFeeService {
	@Autowired
	private ExCreditFeeDao exCreditFeeDao;
	
	@Override
	public ExCreditFeeDO get(Long exCreditFeeId){
		return exCreditFeeDao.get(exCreditFeeId);
	}
	
	@Override
	public List<ExCreditFeeDO> list(Map<String, Object> map){
		return exCreditFeeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exCreditFeeDao.count(map);
	}
	
	@Override
	public int save(ExCreditFeeDO exCreditFee){
		return exCreditFeeDao.save(exCreditFee);
	}
	
	@Override
	public int update(ExCreditFeeDO exCreditFee){
		return exCreditFeeDao.update(exCreditFee);
	}
	
	@Override
	public int remove(Long exCreditFeeId){
		return exCreditFeeDao.remove(exCreditFeeId);
	}
	
	@Override
	public int batchRemove(Long[] exCreditFeeIds){
		return exCreditFeeDao.batchRemove(exCreditFeeIds);
	}
	
}
