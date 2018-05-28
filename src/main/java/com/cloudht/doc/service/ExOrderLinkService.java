package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExOrderLinkDO;

import java.util.List;
import java.util.Map;

/**
 * 订单环节信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 16:34:02
 */
public interface ExOrderLinkService {
	
	ExOrderLinkDO get(Long exOrderLinkId);
	
	List<ExOrderLinkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderLinkDO exOrderLink);
	
	int update(ExOrderLinkDO exOrderLink);
	
	int remove(Long exOrderLinkId);
	
	int batchRemove(Long[] exOrderLinkIds);
}
