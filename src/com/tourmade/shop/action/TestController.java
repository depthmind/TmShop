/**
 * 
 */
package com.tourmade.shop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tourmade.shop.common.action.BaseSimpleFormController;

/**
 * @author zyy
 *
 */
@Controller
@RequestMapping("/")
public class TestController extends BaseSimpleFormController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "test";
	}
}
