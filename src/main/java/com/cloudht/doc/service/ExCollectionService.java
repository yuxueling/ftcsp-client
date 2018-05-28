package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExCollectionDO;

import java.util.List;
import java.util.Map;

/**
 * 托收收汇
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
public interface ExCollectionService {
	
	ExCollectionDO get(Long exCollectionId);
	
	List<ExCollectionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExCollectionDO exCollection);
	
	int update(ExCollectionDO exCollection);
	
	int remove(Long exCollectionId);
	
	int batchRemove(Long[] exCollectionIds);
}
