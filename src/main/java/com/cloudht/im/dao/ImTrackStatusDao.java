package com.cloudht.im.dao;

import com.cloudht.im.domain.ImTrackStatusDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 通关跟踪状态
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-24 10:53:43
 */
@Mapper
public interface ImTrackStatusDao {

	ImTrackStatusDO get(Long imTrackStatusId);
	
	List<ImTrackStatusDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImTrackStatusDO imTrackStatus);
	
	int update(ImTrackStatusDO imTrackStatus);
	
	int remove(Long im_track_status_id);
	
	int batchRemove(Long[] imTrackStatusIds);
}
