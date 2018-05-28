package com.cloudht.im.service;

import com.cloudht.im.domain.ImOrderBaseDO;

import java.util.List;
import java.util.Map;

/**
 * 进口订单信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
public interface ImOrderBaseService {
	
	ImOrderBaseDO get(Long imOrderBaseId);
	
	List<ImOrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImOrderBaseDO imOrderBase);
	
	int update(ImOrderBaseDO imOrderBase);
	
	int remove(Long imOrderBaseId);
	
	int batchRemove(Long[] imOrderBaseIds);
}
