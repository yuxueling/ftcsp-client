package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtExpressCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 快件商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:04:18
 */
public interface FtExpressCommodityService {
	
	FtExpressCommodityDO get(Long ftExpressCommodityId);
	
	List<FtExpressCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtExpressCommodityDO ftExpressCommodity);
	
	int update(FtExpressCommodityDO ftExpressCommodity);
	
	int remove(Long ftExpressCommodityId);
	
	int batchRemove(Long[] ftExpressCommodityIds);
}
