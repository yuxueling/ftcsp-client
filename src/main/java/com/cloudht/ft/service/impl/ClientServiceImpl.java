package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.ClientDao;
import com.cloudht.ft.domain.ClientDO;
import com.cloudht.ft.service.ClientService;



@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;
	
	@Override
	public ClientDO get(Long ftClientId){
		return clientDao.get(ftClientId);
	}
	
	@Override
	public List<ClientDO> list(Map<String, Object> map){
		return clientDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return clientDao.count(map);
	}
	
	@Override
	public int save(ClientDO client){
		return clientDao.save(client);
	}
	
	@Override
	public int update(ClientDO client){
		return clientDao.update(client);
	}
	
	@Override
	public int remove(Long ftClientId){
		return clientDao.remove(ftClientId);
	}
	
	@Override
	public int batchRemove(Long[] ftClientIds){
		return clientDao.batchRemove(ftClientIds);
	}
	
}
