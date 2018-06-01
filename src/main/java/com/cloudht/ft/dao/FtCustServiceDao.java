package com.cloudht.ft.dao;

import com.cloudht.ft.domain.FtCustServiceDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 国外客户业务信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
@Mapper
public interface FtCustServiceDao {

	FtCustServiceDO get(Integer ftCustServiceId);
	
	List<FtCustServiceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustServiceDO ftCustService);
	
	int update(FtCustServiceDO ftCustService);
	
	int remove(Integer ft_cust_service_id);
	
	int batchRemove(Integer[] ftCustServiceIds);
}
