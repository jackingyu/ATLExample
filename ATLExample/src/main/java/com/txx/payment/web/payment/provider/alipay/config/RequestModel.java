package com.txx.payment.web.payment.provider.alipay.config;

public class RequestModel {
	//商户订单号
	private String out_trade_no;
	//订单名称
	private String subject;
	//付款金额
	private String total_fee;
	//商品展示地址
	private String show_url;
	//订单描述
	private String body;
	//超时时间
	private String it_b_pay;
	//钱包token
	private String extern_token;
	//支付类型
	private String payment_type;
	/**
	 * @return the out_trade_no
	 */
	public String getOut_trade_no() {
		return out_trade_no;
	}
	/**
	 * @param out_trade_no the out_trade_no to set
	 */
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the total_fee
	 */
	public String getTotal_fee() {
		return total_fee;
	}
	/**
	 * @param total_fee the total_fee to set
	 */
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	/**
	 * @return the show_url
	 */
	public String getShow_url() {
		return show_url;
	}
	/**
	 * @param show_url the show_url to set
	 */
	public void setShow_url(String show_url) {
		this.show_url = show_url;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the it_b_pay
	 */
	public String getIt_b_pay() {
		return it_b_pay;
	}
	/**
	 * @param it_b_pay the it_b_pay to set
	 */
	public void setIt_b_pay(String it_b_pay) {
		this.it_b_pay = it_b_pay;
	}
	/**
	 * @return the extern_token
	 */
	public String getExtern_token() {
		return extern_token;
	}
	/**
	 * @param extern_token the extern_token to set
	 */
	public void setExtern_token(String extern_token) {
		this.extern_token = extern_token;
	}
	/**
	 * @return the payment_type
	 */
	public String getPayment_type() {
		return payment_type;
	}
	/**
	 * @param payment_type the payment_type to set
	 */
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	
}
