package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExFeeRegistrationDao;
import com.cloudht.doc.domain.ExFeeRegistrationDO;
import com.cloudht.doc.service.ExFeeRegistrationService;



@Service
public class ExFeeRegistrationServiceImpl implements ExFeeRegistrationService {
	@Autowired
	private ExFeeRegistrationDao exFeeRegistrationDao;
	
	@Override
	public ExFeeRegistrationDO get(Long exFeeRegistrationId){
		return exFeeRegistrationDao.get(exFeeRegistrationId);
	}
	
	@Override
	public List<ExFeeRegistrationDO> list(Map<String, Object> map){
		return exFeeRegistrationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exFeeRegistrationDao.count(map);
	}
	
	@Override
	public int save(ExFeeRegistrationDO exFeeRegistration){
		return exFeeRegistrationDao.save(exFeeRegistration);
	}
	
	@Override
	public int update(ExFeeRegistrationDO exFeeRegistration){
		return exFeeRegistrationDao.update(exFeeRegistration);
	}
	
	@Override
	public int remove(Long exFeeRegistrationId){
		return exFeeRegistrationDao.remove(exFeeRegistrationId);
	}
	
	@Override
	public int batchRemove(Long[] exFeeRegistrationIds){
		return exFeeRegistrationDao.batchRemove(exFeeRegistrationIds);
	}
	
}
