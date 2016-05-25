/**
 * 
 */
package com.txx.payment.web.app.model;

/**
 * @author Liu Xin
 *
 */
public class UserLogWeb extends BaseModel{
	private String user_id;
	private String payment_log;
	private String payment_prodiver;
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the payment_log
	 */
	public String getPayment_log() {
		return payment_log;
	}
	/**
	 * @param payment_log the payment_log to set
	 */
	public void setPayment_log(String payment_log) {
		this.payment_log = payment_log;
	}
	/**
	 * @return the payment_prodiver
	 */
	public String getPayment_prodiver() {
		return payment_prodiver;
	}
	/**
	 * @param payment_prodiver the payment_prodiver to set
	 */
	public void setPayment_prodiver(String payment_prodiver) {
		this.payment_prodiver = payment_prodiver;
	}

}
