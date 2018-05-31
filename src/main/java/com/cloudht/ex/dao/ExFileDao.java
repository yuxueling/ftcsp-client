package com.cloudht.ex.dao;

import com.cloudht.ex.domain.ExFileDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口文件
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-31 11:12:11
 */
@Mapper
public interface ExFileDao {

	ExFileDO get(Long exFileId);
	
	List<ExFileDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExFileDO exFile);
	
	int update(ExFileDO exFile);
	
	int remove(Long ex_file_id);
	
	int batchRemove(Long[] exFileIds);
}
