package com.cat.controller;


import com.cat.pojo.ResultData;
import com.cat.util.BaseController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Lion
 * @Description: demoController
 * @Date: 16:40 2018/5/10
 */
@Controller
@EnableAutoConfiguration
public class DemoController extends BaseController {

	@RequestMapping("/demo")
	@ResponseBody
	public ResultData demo() {
		return setResponseEntity("测试", "200", null, true);
	}
}
