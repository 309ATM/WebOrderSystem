package com.light.exception;

public class InvalidDataException extends RuntimeException {
	
	//接收异常
	private Throwable throwable;
	
	//错误信息
	private String msg;
	
	//错误码
	private String errorCode;
	
	public InvalidDataException() {
		super();
	}

	public InvalidDataException(Throwable throwable, String msg, String errorCode) {
		super();
		this.throwable = throwable;
		this.msg = msg;
		this.errorCode = errorCode;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public String getMsg() {
		return msg;
	}

	public String getErrorCode() {
		return errorCode;
	}
	
	

}
