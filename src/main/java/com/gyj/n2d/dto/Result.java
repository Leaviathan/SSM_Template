package com.gyj.n2d.dto;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class Result<T> {

	private boolean success;// 是否成功标志

	private T data;// 成功时返回的数据

	private String error;// 错误信息

	public Result() {
	}

	// 成功时的构造器
	public Result(boolean _success, T _data) {
		this.success = _success;
		this.data = _data;
	}

	// 错误时的构造器
	public Result(boolean _success, String _error) {
		this.success = _success;
		this.error = _error;
	}

	// 省略getter和setter方法
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	
}