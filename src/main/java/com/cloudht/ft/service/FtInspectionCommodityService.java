package com.cloudht.ft.service;

import com.cloudht.ft.domain.FtInspectionCommodityDO;

import java.util.List;
import java.util.Map;

/**
 * 查验商品
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 16:41:47
 */
public interface FtInspectionCommodityService {
	
	FtInspectionCommodityDO get(Integer ftInspectionCommodityId);
	
	List<FtInspectionCommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtInspectionCommodityDO ftInspectionCommodity);
	
	int update(FtInspectionCommodityDO ftInspectionCommodity);
	
	int remove(Integer ftInspectionCommodityId);
	
	int batchRemove(Integer[] ftInspectionCommodityIds);
}
