package com.cloudht.doc.service;

import com.cloudht.doc.domain.ExOriginCertificateDO;

import java.util.List;
import java.util.Map;

/**
 * 产地证信息
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-25 15:42:53
 */
public interface ExOriginCertificateService {
	
	ExOriginCertificateDO get(Long exOriginCertificateId);
	
	List<ExOriginCertificateDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ExOriginCertificateDO exOriginCertificate);
	
	int update(ExOriginCertificateDO exOriginCertificate);
	
	int remove(Long exOriginCertificateId);
	
	int batchRemove(Long[] exOriginCertificateIds);
}
