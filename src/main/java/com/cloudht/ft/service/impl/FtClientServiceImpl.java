package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtClientDao;
import com.cloudht.ft.domain.FtClientDO;
import com.cloudht.ft.service.FtClientService;



@Service
public class FtClientServiceImpl implements FtClientService {
	@Autowired
	private FtClientDao ftClientDao;
	
	@Override
	public FtClientDO get(Long ftClientId){
		return ftClientDao.get(ftClientId);
	}
	
	@Override
	public List<FtClientDO> list(Map<String, Object> map){
		return ftClientDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ftClientDao.count(map);
	}
	
	@Override
	public int save(FtClientDO ftClient){
		return ftClientDao.save(ftClient);
	}
	
	@Override
	public int update(FtClientDO ftClient){
		return ftClientDao.update(ftClient);
	}
	
	@Override
	public int remove(Long ftClientId){
		return ftClientDao.remove(ftClientId);
	}
	
	@Override
	public int batchRemove(Long[] ftClientIds){
		return ftClientDao.batchRemove(ftClientIds);
	}

	@Override
	public String queryClientStatus(HashMap<String, Object> hashMap) {
		List<FtClientDO> list = ftClientDao.list(hashMap);
		if(list.size()>1) {
			return "请联系管理员";
		}
		if(list.size()==0) {
			return "请填写公司信息";
		}
		return list.get(0).getAuditStatus()>3?"审核通过":list.get(0).getStatus();
	}

	@Override
	public Long queryFtClientIdByUserId(Long userId) {
		HashMap<String,Object> hashMap = new HashMap<String, Object>();
		hashMap.put("clientUserId", userId);
		List<FtClientDO> list = ftClientDao.list(hashMap);
		if(list.size()!=1) {
			return null;
		}
		return list.get(0).getFtClientId();
	}
	
}
