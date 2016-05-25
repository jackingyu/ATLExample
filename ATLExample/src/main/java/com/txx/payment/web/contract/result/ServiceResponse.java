package com.txx.payment.web.contract.result;

public class ServiceResponse {
	private StatusCode status;
	private String message;
	private Object data;
	
	public enum StatusCode {
		SUCCESS("100"),
		ERROR("200");
		
		private String _code;
		
		StatusCode(String code) {
			_code = code;
		}

		/* (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			return _code;
		}
		
		
	}
	/**
	 * @return the status
	 */
	public StatusCode getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusCode status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
}
