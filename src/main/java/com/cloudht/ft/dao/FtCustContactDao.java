package com.cloudht.ft.dao;

import com.cloudht.ft.domain.FtCustContactDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 客户联系人信息表
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-06-01 16:17:16
 */
@Mapper
public interface FtCustContactDao {

	FtCustContactDO get(Integer ftCustContactId);
	
	List<FtCustContactDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FtCustContactDO ftCustContact);
	
	int update(FtCustContactDO ftCustContact);
	
	int remove(Integer ft_cust_contact_id);
	
	int batchRemove(Integer[] ftCustContactIds);
}
