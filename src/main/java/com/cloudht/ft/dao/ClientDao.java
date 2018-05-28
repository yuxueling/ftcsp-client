package com.cloudht.ft.dao;

import com.cloudht.ft.domain.ClientDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 委托人信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-17 18:19:12
 */
@Mapper
public interface ClientDao {

	ClientDO get(Long ftClientId);
	
	List<ClientDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ClientDO client);
	
	int update(ClientDO client);
	
	int remove(Long ft_client_id);
	
	int batchRemove(Long[] ftClientIds);
}
