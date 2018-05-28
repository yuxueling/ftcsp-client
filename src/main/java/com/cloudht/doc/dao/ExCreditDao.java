package com.cloudht.doc.dao;

import com.cloudht.doc.domain.ExCreditDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 信用证
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:52
 */
@Mapper
public interface ExCreditDao {

	ExCreditDO get(Long exCreditId);
	
	List<ExCreditDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExCreditDO exCredit);
	
	int update(ExCreditDO exCredit);
	
	int remove(Long ex_credit_id);
	
	int batchRemove(Long[] exCreditIds);
}
