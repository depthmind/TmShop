package com.tourmade.shop.mapper.awardCode;

import com.tourmade.shop.common.framework.BaseMapper;
import com.tourmade.shop.entity.AwardCode;

public interface AwardCodeMapper extends BaseMapper {
	int countAwardCodeByDrawTime();
	
	int insertAwardCode(AwardCode awardCode);
}