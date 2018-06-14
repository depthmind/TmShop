/**
 * 
 */
package com.tourmade.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tourmade.shop.common.action.BaseSimpleFormController;
import com.tourmade.shop.common.constant.Constant;
import com.tourmade.shop.common.model.base.value.baseconfig.Json;
import com.tourmade.shop.entity.AwardCode;
import com.tourmade.shop.entity.DrawRecord;
import com.tourmade.shop.service.AwardCodeService;
import com.tourmade.shop.service.DrawRecordService;

/**
 * @author zyy
 *
 */
@Controller
@RequestMapping("/")
public class DrawController extends BaseSimpleFormController {

	@Autowired
	private DrawRecordService drawRecordService;
	@Autowired
	private AwardCodeService awardCodeService;
	
	@RequestMapping(value = "/getDrawFlag.do", produces = "application/json;charset=utf-8")
	@ResponseBody
	public Json draw(HttpServletRequest request, HttpServletResponse response) {
		Json json = new Json();
		Boolean drawFlag = false;
		String mobilephone = null;
		DrawRecord drawRecord = null;
		DrawRecord newDrawRecord = null;
		AwardCode awardCode = null;
		int drawRecordNumber = 0;
		int awardNumber = 0;
		int result = 0;
		final int maxAwardNumber = 6;
		
		json.setSuccess(false);
		json.setMsg("请联系特美客服");
		mobilephone = request.getParameter("mobilephone");
		
		newDrawRecord = new DrawRecord();
		newDrawRecord.setMobilephone(mobilephone);
		newDrawRecord.setStatus(Constant.DRAW_STATUS_NO);
		result = drawRecordService.saveDrawRecord(newDrawRecord);
		if (result < 1) {
			return json;
		}
		
		//1. 查询该手机是否参加过抽奖，如果参加过直接return
		drawRecord = drawRecordService.getDrawRecordByMobilephone(mobilephone);
		if (null != drawRecord) {
			json.setSuccess(drawFlag);
			json.setMsg("您已经参加过本次活动！");
			return json;
		}
		
		//2. 查询奖池当天是否还有可用中奖码，如果没有直接return || 或者是判断是否达到当天中奖人数上限，是则return
		awardNumber = awardCodeService.countAwardCodeByDrawTime();
		if (awardNumber >= maxAwardNumber) {
			json.setSuccess(drawFlag);
			json.setMsg("fuck out！");
			return json;
		}
		
		//3. 判断该抽奖人是否是每10个人中的第六个人，不是直接return，是则中奖
		drawRecordNumber = drawRecordService.countDrawRecordByCreateTime();
		// 参与人数大于10时进行求模
		drawRecordNumber = drawRecordNumber > 10 ? drawRecordNumber % 10 : drawRecordNumber;
		if (maxAwardNumber == drawRecordNumber) {
			newDrawRecord.setStatus(Constant.DRAW_STATUS_YES);
			drawRecordService.updateDrawRecordByMobilePhone(newDrawRecord);
			drawFlag = true;
			json.setSuccess(drawFlag);
			json.setMsg("恭喜恭喜！");
			return json;
		} else {
			json.setSuccess(drawFlag);
			json.setMsg("fuck off！");
			return json;
		}
	}
}
