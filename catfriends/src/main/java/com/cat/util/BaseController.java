package com.cat.util;


import com.cat.pojo.ResultData;

/**
 * @Author: Lion
 * @Description: 封装的BaseController
 * @Date: 16:13 2018/5/10
 */

public class BaseController {

	/**
	 * @Author: Lion
	 * @Description: 统一返回json格式
	 * @Date: 16:09 2018/5/10
	 */
	public ResultData setResponseEntity(String message, String code, Object data, boolean success) {
		ResultData body = new ResultData();
		body.setMessage(message);
		body.setCode(code);
		body.setData(data);
		body.setSuccess(success);
		return body;
	}
}