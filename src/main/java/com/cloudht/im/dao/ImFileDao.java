package com.cloudht.im.dao;

import com.cloudht.im.domain.ImFileDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 出口文件
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2018-05-30 22:47:36
 */
@Mapper
public interface ImFileDao {

	ImFileDO get(Long imFileId);
	
	List<ImFileDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ImFileDO imFile);
	
	int update(ImFileDO imFile);
	
	int remove(Long im_file_id);
	
	int batchRemove(Long[] imFileIds);
}
