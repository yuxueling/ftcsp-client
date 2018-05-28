package com.cloudht.doc.dao;

import com.cloudht.doc.domain.ExOriginCertificateDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 产地证信息
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
@Mapper
public interface ExOriginCertificateDao {

	ExOriginCertificateDO get(Long exOriginCertificateId);
	
	List<ExOriginCertificateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOriginCertificateDO exOriginCertificate);
	
	int update(ExOriginCertificateDO exOriginCertificate);
	
	int remove(Long ex_origin_certificate_id);
	
	int batchRemove(Long[] exOriginCertificateIds);
}
