package com.cloudht.ft.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.cloudht.ft.domain.SysHscodeDO;

@Mapper
public interface SysHscodeDao {

	SysHscodeDO get(Integer sysHscodeId);
	
	List<SysHscodeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SysHscodeDO sysHscode);
	
	int update(SysHscodeDO sysHscode);
	
	int remove(Integer sys_hscode_id);
	
	int batchRemove(Integer[] sysHscodeIds);
}

