package com.cloudht.im.dao;

import com.cloudht.im.domain.ImTrackBaseDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 通关跟踪单
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
@Mapper
public interface ImTrackBaseDao {

	ImTrackBaseDO get(Long imTrackBaseId);
	
	List<ImTrackBaseDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImTrackBaseDO imTrackBase);
	
	int update(ImTrackBaseDO imTrackBase);
	
	int remove(Long im_track_base_id);
	
	int batchRemove(Long[] imTrackBaseIds);
}
