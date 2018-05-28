package com.cloudht.im.dao;

import com.cloudht.im.domain.ImOrderBaseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 进口订单信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
@Mapper
public interface ImOrderBaseDao {

	ImOrderBaseDO get(Long imOrderBaseId);
	
	List<ImOrderBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImOrderBaseDO imOrderBase);
	
	int update(ImOrderBaseDO imOrderBase);
	
	int remove(Long im_order_base_id);
	
	int batchRemove(Long[] imOrderBaseIds);
}
