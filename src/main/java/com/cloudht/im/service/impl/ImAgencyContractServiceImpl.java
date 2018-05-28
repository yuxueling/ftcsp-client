package com.cloudht.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.im.dao.ImAgencyContractDao;
import com.cloudht.im.domain.ImAgencyContractDO;
import com.cloudht.im.service.ImAgencyContractService;



@Service
public class ImAgencyContractServiceImpl implements ImAgencyContractService {
	@Autowired
	private ImAgencyContractDao imAgencyContractDao;
	
	@Override
	public ImAgencyContractDO get(Long imAgencyContractId){
		return imAgencyContractDao.get(imAgencyContractId);
	}
	
	@Override
	public List<ImAgencyContractDO> list(Map<String, Object> map){
		return imAgencyContractDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imAgencyContractDao.count(map);
	}
	
	@Override
	public int save(ImAgencyContractDO imAgencyContract){
		return imAgencyContractDao.save(imAgencyContract);
	}
	
	@Override
	public int update(ImAgencyContractDO imAgencyContract){
		return imAgencyContractDao.update(imAgencyContract);
	}
	
	@Override
	public int remove(Long imAgencyContractId){
		return imAgencyContractDao.remove(imAgencyContractId);
	}
	
	@Override
	public int batchRemove(Long[] imAgencyContractIds){
		return imAgencyContractDao.batchRemove(imAgencyContractIds);
	}
	
}
