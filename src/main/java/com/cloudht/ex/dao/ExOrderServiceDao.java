package com.cloudht.ex.dao;

import com.cloudht.ex.domain.ExOrderServiceDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单服务
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
@Mapper
public interface ExOrderServiceDao {

	ExOrderServiceDO get(Integer exOrderServiceId);
	
	List<ExOrderServiceDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderServiceDO exOrderService);
	
	int update(ExOrderServiceDO exOrderService);
	
	int remove(Integer ex_order_service_id);
	
	int batchRemove(Integer[] exOrderServiceIds);
}
