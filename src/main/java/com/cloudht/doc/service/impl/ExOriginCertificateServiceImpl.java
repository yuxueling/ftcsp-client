package com.cloudht.doc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.cloudht.doc.dao.ExOriginCertificateDao;
import com.cloudht.doc.domain.ExOriginCertificateDO;
import com.cloudht.doc.service.ExOriginCertificateService;



@Service
public class ExOriginCertificateServiceImpl implements ExOriginCertificateService {
	@Autowired
	private ExOriginCertificateDao exOriginCertificateDao;
	
	@Override
	public ExOriginCertificateDO get(Long exOriginCertificateId){
		return exOriginCertificateDao.get(exOriginCertificateId);
	}
	
	@Override
	public List<ExOriginCertificateDO> list(Map<String, Object> map){
		return exOriginCertificateDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return exOriginCertificateDao.count(map);
	}
	
	@Override
	public int save(ExOriginCertificateDO exOriginCertificate){
		return exOriginCertificateDao.save(exOriginCertificate);
	}
	
	@Override
	public int update(ExOriginCertificateDO exOriginCertificate){
		return exOriginCertificateDao.update(exOriginCertificate);
	}
	
	@Override
	public int remove(Long exOriginCertificateId){
		return exOriginCertificateDao.remove(exOriginCertificateId);
	}
	
	@Override
	public int batchRemove(Long[] exOriginCertificateIds){
		return exOriginCertificateDao.batchRemove(exOriginCertificateIds);
	}
	
}
