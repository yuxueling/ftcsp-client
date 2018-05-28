package com.cloudht.im.service;

import com.cloudht.im.domain.ImFileDO;

import java.util.List;
import java.util.Map;

/**
 * 出口文件
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 15:03:11
 */
public interface ImFileService {
	
	ImFileDO get(Long imFileId);
	
	List<ImFileDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImFileDO imFile);
	
	int update(ImFileDO imFile);
	
	int remove(Long imFileId);
	
	int batchRemove(Long[] imFileIds);
}
