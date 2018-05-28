package com.cloudht.doc.dao;

import com.cloudht.doc.domain.ExOrderOperationDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 17:59:26
 */
@Mapper
public interface ExOrderOperationDao {

	ExOrderOperationDO get(Long exOrderOperationId);
	
	List<ExOrderOperationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderOperationDO exOrderOperation);
	
	int update(ExOrderOperationDO exOrderOperation);
	
	int remove(Long ex_order_operation_id);
	
	int batchRemove(Long[] exOrderOperationIds);
}
