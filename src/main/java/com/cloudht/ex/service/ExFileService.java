package com.cloudht.ex.service;

import com.cloudht.ex.domain.ExFileDO;

import java.util.List;
import java.util.Map;

/**
 * 出口文件
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-31 11:12:11
 */
public interface ExFileService {
	
	ExFileDO get(Long exFileId);
	
	List<ExFileDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExFileDO exFile);
	
	int update(ExFileDO exFile);
	
	int remove(Long exFileId);
	
	int batchRemove(Long[] exFileIds);
}
