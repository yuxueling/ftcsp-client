package com.cloudht.ex.dao;

import com.cloudht.ex.domain.ExOrderBaseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口订单基本信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 10:34:53
 */
@Mapper
public interface ExOrderBaseDao {

	ExOrderBaseDO get(Long exOrderBaseId);
	
	List<ExOrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderBaseDO exOrderBase);
	
	int update(ExOrderBaseDO exOrderBase);
	
	int remove(Long ex_order_base_id);
	
	int batchRemove(Long[] exOrderBaseIds);
}
