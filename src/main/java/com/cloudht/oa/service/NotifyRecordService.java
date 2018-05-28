package com.cloudht.oa.service;

import com.cloudht.oa.domain.NotifyRecordDO;

import java.util.List;
import java.util.Map;

/**
 * 通知通告发送记录
 * 
 * @author yuxueling
 * @email 980899486@qq.com
 * @date 2017-10-09 17:18:45
 */
public interface NotifyRecordService {
	
	NotifyRecordDO get(Long id);
	
	List<NotifyRecordDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NotifyRecordDO notifyRecord);
	
	int update(NotifyRecordDO notifyRecord);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	/**
	 * 更改阅读状态
	 * @return
	 */
	int changeRead(NotifyRecordDO notifyRecord);
}
