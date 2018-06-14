/**
 * 
 */
package com.tourmade.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourmade.shop.common.framework.BaseService;
import com.tourmade.shop.entity.AwardCode;
import com.tourmade.shop.mapper.awardCode.AwardCodeMapper;

/**
 * @author zyy
 *
 */
@Service
@Transactional(readOnly = false)
public class AwardCodeService extends BaseService {

	@Autowired
	private AwardCodeMapper mapper;
	
	/**
	 * 
	 * @date 2018年6月12日 下午5:04:04
	 * @author liuhan
	 * @todo 查询当天中奖纪录
	 */
	public int countAwardCodeByDrawTime() {
		int result = 0;
		try {
			result = mapper.countAwardCodeByDrawTime();
		} catch (Exception e) {
			logger.error("-----查询当天中奖纪录失败-----" + "\n" + "-----AwardCodeService.countAwardCodeByDrawTime-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return result;
	}
	
	/**
	 * 
	 * @date 2018年6月12日 下午5:18:52
	 * @author liuhan
	 * @todo 保存中奖码
	 */
	public int saveAwardCode(AwardCode awardCode) {
		int result = 0;
		try {
			result = mapper.insertAwardCode(awardCode);
		} catch (Exception e) {
			logger.error("-----保存中奖码失败-----" + "\n" + "-----AwardCodeService.saveAwardCode-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return result;
	}
}
