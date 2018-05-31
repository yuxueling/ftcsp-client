package com.cloudht.im.service;

import com.cloudht.im.domain.ImAgencyContractDO;

import java.util.List;
import java.util.Map;

/**
 * 进口代理合同
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
public interface ImAgencyContractService {
	
	ImAgencyContractDO get(Long imAgencyContractId);
	
	List<ImAgencyContractDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImAgencyContractDO imAgencyContract);
	
	int update(ImAgencyContractDO imAgencyContract);
	
	int remove(Long imAgencyContractId);
	
	int batchRemove(Long[] imAgencyContractIds);
}
