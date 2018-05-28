package com.cloudht.im.dao;

import com.cloudht.im.domain.ImAgencyContractDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 进口代理合同
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
@Mapper
public interface ImAgencyContractDao {

	ImAgencyContractDO get(Long imAgencyContractId);
	
	List<ImAgencyContractDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImAgencyContractDO imAgencyContract);
	
	int update(ImAgencyContractDO imAgencyContract);
	
	int remove(Long im_agency_contract_id);
	
	int batchRemove(Long[] imAgencyContractIds);
}
