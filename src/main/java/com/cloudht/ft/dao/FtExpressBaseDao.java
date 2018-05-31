package com.cloudht.ft.dao;

import com.cloudht.ft.domain.FtExpressBaseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 快件信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:04:18
 */
@Mapper
public interface FtExpressBaseDao {

	FtExpressBaseDO get(Long ftExpressBaseId);
	
	List<FtExpressBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtExpressBaseDO ftExpressBase);
	
	int update(FtExpressBaseDO ftExpressBase);
	
	int remove(Long ft_express_base_id);
	
	int batchRemove(Long[] ftExpressBaseIds);
}
