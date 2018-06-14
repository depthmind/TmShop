package com.tourmade.shop.mapper.drawRecord;

import java.util.Map;

import com.tourmade.shop.common.framework.BaseMapper;
import com.tourmade.shop.entity.DrawRecord;

public interface DrawRecordMapper extends BaseMapper {
	DrawRecord selectDrawRecordByMobilephone(String mobilephone);
	
	int countDrawRecordByCreateTime();
	
	int insertDrawRecord(DrawRecord drawRecord);
	
	void updateDrawRecordByMobilePhone(DrawRecord drawRecord);
}