package com.cloudht.ft.dao;

import com.cloudht.ft.domain.FtCustBankDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 国内外客户银行信息表
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
@Mapper
public interface FtCustBankDao {

	FtCustBankDO get(Integer ftCustBankId);
	
	List<FtCustBankDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustBankDO ftCustBank);
	
	int update(FtCustBankDO ftCustBank);
	
	int remove(Integer ft_cust_bank_id);
	
	int batchRemove(Integer[] ftCustBankIds);
}
