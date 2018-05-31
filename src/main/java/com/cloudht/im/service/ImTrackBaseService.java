package com.cloudht.im.service;

import com.cloudht.im.domain.ImTrackBaseDO;

import java.util.List;
import java.util.Map;

/**
 * 通关跟踪单
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
public interface ImTrackBaseService {
	
	ImTrackBaseDO get(Long imTrackBaseId);
	
	List<ImTrackBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImTrackBaseDO imTrackBase);
	
	int update(ImTrackBaseDO imTrackBase);
	
	int remove(Long imTrackBaseId);
	
	int batchRemove(Long[] imTrackBaseIds);
}
