package com.smm.tools.common;

import java.io.Serializable;

public class ResultData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692543113503847598L;

	/**
	 * 返回CODE
	 */
	private String code;
	
	/**
	 * 返回信息
	 */
	private String msg;
	
	/**
	 * 返回数据
	 */
	private Object data;
	
	/**
	 * 总记录数
	 * @return
	 */
	
	private Integer totalRecords;

	@Override
	public String toString() {
		return "ResultData [code=" + code + ", resultData=" + data + ", message=" + msg + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	
}
