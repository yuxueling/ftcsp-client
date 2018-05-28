package com.cloudht.doc.dao;

import com.cloudht.doc.domain.ExOrderLinkDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 订单环节信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 16:34:02
 */
@Mapper
public interface ExOrderLinkDao {

	ExOrderLinkDO get(Long exOrderLinkId);
	
	List<ExOrderLinkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOrderLinkDO exOrderLink);
	
	int update(ExOrderLinkDO exOrderLink);
	
	int remove(Long ex_order_link_id);
	
	int batchRemove(Long[] exOrderLinkIds);
}
