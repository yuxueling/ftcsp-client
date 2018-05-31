package com.cloudht.im.service;

import com.cloudht.im.domain.ImTrackStatusDO;

import java.util.List;
import java.util.Map;

/**
 * 通关跟踪状态
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:37
 */
public interface ImTrackStatusService {
	
	ImTrackStatusDO get(Long imTrackStatusId);
	
	List<ImTrackStatusDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImTrackStatusDO imTrackStatus);
	
	int update(ImTrackStatusDO imTrackStatus);
	
	int remove(Long imTrackStatusId);
	
	int batchRemove(Long[] imTrackStatusIds);
}
