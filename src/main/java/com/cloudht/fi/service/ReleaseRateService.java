package com.cloudht.fi.service;

import com.cloudht.fi.domain.ReleaseRateDO;

import java.util.List;
import java.util.Map;

/**
 * 汇率发布
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-23 23:00:36
 */
public interface ReleaseRateService {
	
	ReleaseRateDO get(Integer fiReleaseRateId);
	
	List<ReleaseRateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReleaseRateDO releaseRate);
	
	int update(ReleaseRateDO releaseRate);
	
	int remove(Integer fiReleaseRateId);
	
	int batchRemove(Integer[] fiReleaseRateIds);
}
