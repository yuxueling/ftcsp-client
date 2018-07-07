package com.cloudht.ft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cloudht.ft.dao.FtClientDao;
import com.cloudht.ft.domain.FtClientDO;
import com.cloudht.ft.service.FtClientCompanyService;
import com.cloudht.ft.service.FtClientService;



@Service
public class FtClientServiceImpl implements FtClientService {
	@Autowired
	private FtClientDao ftClientDao;
	
	@Autowired
	private FtClientCompanyService ftClientCompanyService;
	
	@Override
	@Transactional
	public boolean saveClient(FtClientDO client) {
		if(client==null||client.getFtClientCompanyDO()==null) {
			return false;
		}
		try {
			ftClientDao.save(client);
			Long ftClientId = client.getFtClientId();//取出主键的值
			client.getFtClientCompanyDO().setFtClientId(ftClientId);
			ftClientCompanyService.save(client.getFtClientCompanyDO());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
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
	/**
	 * 查询公司状态 该函数务必保证数据库中公司状态大于3以上的均为审核通过，
	 * 数据库设计如有变更，请重新更改该函数逻辑
	 * @return 返回true公司信息审核通过; 返回false公司信息审核尚未通过;返回null公司信息没有填写(单个用户只能有绑定一个公司，超过一个公司也会返回null)
	 */
	@Override
	public Boolean queryClientStatus(HashMap<String, Object> hashMap) {
		List<FtClientDO> list = ftClientDao.list(hashMap);//根据传入的参数获取到公司信息
		if(list.size()==1) {//如果公司信息只有一条，说明是正确的
			return list.get(0).getAuditStatus()>3?true:false;
		}
		return null;
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
