package com.light.exception;

public class DatabaseException extends RuntimeException {
		//�����쳣
		private Throwable throwable;
		
		//������Ϣ
		private String msg;
		
		//������
		private String errorCode;
		
		public DatabaseException() {
			super();
		}

		public DatabaseException(Throwable throwable, String msg, String errorCode) {
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
