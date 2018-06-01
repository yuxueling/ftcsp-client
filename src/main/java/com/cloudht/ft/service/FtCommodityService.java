package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 商品信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
public interface FtCommodityService {
	
	FtCommodityDO get(Integer ftCommodityId);
	
	List<FtCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCommodityDO ftCommodity);
	
	int update(FtCommodityDO ftCommodity);
	
	int remove(Integer ftCommodityId);
	
	int batchRemove(Integer[] ftCommodityIds);
}
