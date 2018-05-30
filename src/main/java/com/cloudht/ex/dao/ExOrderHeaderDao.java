package com.cloudht.ex.dao;

import com.cloudht.ex.domain.ExOrderHeaderDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单头信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
@Mapper
public interface ExOrderHeaderDao {

	ExOrderHeaderDO get(Long exOrderHeaderId);
	
	List<ExOrderHeaderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderHeaderDO exOrderHeader);
	
	int update(ExOrderHeaderDO exOrderHeader);
	
	int remove(Long ex_order_header_id);
	
	int batchRemove(Long[] exOrderHeaderIds);
}
