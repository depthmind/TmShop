/**
 * 
 */
package com.tourmade.shop.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tourmade.shop.common.framework.BaseService;
import com.tourmade.shop.entity.DrawRecord;
import com.tourmade.shop.mapper.drawRecord.DrawRecordMapper;

/**
 * @author zyy
 *
 */
@Service
@Transactional(readOnly = false)
public class DrawRecordService extends BaseService {

	@Autowired
	private DrawRecordMapper mapper;
	
	/**
	 * 
	 * @date 2018年6月12日 上午10:57:25
	 * @author liuhan
	 * @todo 查询手机号当天是否已经参与过抽奖
	 */
	public DrawRecord getDrawRecordByMobilephone(String mobilephone) {
		DrawRecord drawRecord = new DrawRecord();
		try {
			drawRecord = mapper.selectDrawRecordByMobilephone(mobilephone);
		} catch (Exception e) {
			logger.error("-----查询手机号是否已经参与过抽奖失败-----" + "\n" + "-----DrawRecordService.getDrawRecordByMobilephone-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return drawRecord;
	}
	
	/**
	 * 
	 * @date 2018年6月12日 下午2:24:38
	 * @author liuhan
	 * @todo 查询当天参数抽奖人数
	 */
	public int countDrawRecordByCreateTime() {
		int result = 0;
		try {
			result = mapper.countDrawRecordByCreateTime();
		} catch (Exception e) {
			logger.error("-----查询当天参数抽奖人数失败-----" + "\n" + "-----DrawRecordService.countDrawRecordByCreateTime-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return result;
	}
	
	/**
	 * 
	 * @date 2018年6月12日 下午2:39:45
	 * @author liuhan
	 * @todo 保存抽奖记录
	 */
	public int saveDrawRecord(DrawRecord drawRecord){
		int result = 0;
		try {
			result = mapper.insertDrawRecord(drawRecord);
		} catch (Exception e) {
			logger.error("-----保存抽奖记录失败-----" + "\n" + "-----DrawRecordService.saveDrawRecord-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
		return result;
	}
	
	/**
	 * 
	 * @date 2018年6月14日 下午2:31:39
	 * @author liuhan
	 * @todo 根据手机号更新抽奖结果
	 */
	public void updateDrawRecordByMobilePhone(DrawRecord drawRecord) {
		try {
			mapper.updateDrawRecordByMobilePhone(drawRecord);
		} catch (Exception e) {
			logger.error("-----根据手机号更新抽奖结果失败-----" + "\n" + "-----DrawRecordService.updateDrawRecordByMobilePhone-----"
					+ "\n" + "-----" + e.getMessage() + "-----");
		}
	}
}
