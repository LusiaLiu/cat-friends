package com.cat.pojo;

/**
 * @Author: Lion
 * @Description: 统一返回json实体
 * @Date: 16:13 2018/5/10
 */
public class ResultData {

	//返回信息
	private String message;
	//返回状态码
	private String code;
	//返回数据
	private Object data;
	//返回是否成功
	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
