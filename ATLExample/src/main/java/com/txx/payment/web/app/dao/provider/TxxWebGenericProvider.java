/**
 * 
 */
package com.txx.payment.web.app.dao.provider;

import org.apache.ibatis.jdbc.SQL;

import com.txx.payment.web.app.model.UserLogWeb;

/**
 * @author Liu Xin
 *
 */
public class TxxWebGenericProvider {

	public String addUserLog() {
		String sql = new SQL() {
			{
				INSERT_INTO("paymentEntry");
				VALUES("user_id, payment_log, payment_provider,  create_time",
						"#{user_id},#{payment_log}, #{payment_provider},#{create_time}");
			}
		}.toString();
		return sql;
	}

	public String getUserLogByID(Object target) {
		UserLogWeb obj = (UserLogWeb) target;
		String sql = new SQL() {
			{
				SELECT("l.*");
				FROM("paymentEntry l");
				WHERE("1=1");
			}
		}.toString();
		StringBuilder buffer = new StringBuilder();
		if (obj.getId() != null) {
			buffer.append(" and l.log_id = #{id}");
		}
		if (obj.getUser_id() != null) {
			buffer.append(" and l.user_id = #{user_id}");
		}
		return sql + buffer.toString();
	}

	public String getTotalUserLog(Object target) {
		UserLogWeb obj = (UserLogWeb) target;
		String sql = new SQL() {
			{
				SELECT("count(*) ");
				FROM("paymentEntry l");
				WHERE("1=1");
			}
		}.toString();
		StringBuilder buffer = new StringBuilder();
		if (obj.getPayment_prodiver() != null) {
			buffer.append(" and l.payment_provider = #{payment_provider}");
		}
		if (obj.getCreate_time() != null) {
			buffer.append(" and l.create_time > #{create_time}");
		}

		return sql + buffer.toString();
	}

	public String getAllUserLog(Object target) {
		final UserLogWeb obj = (UserLogWeb) target;
		return new SQL() {
			{
				SELECT("l.*");
				FROM("paymentEntry l");
				StringBuilder buffer = new StringBuilder();
				if (obj.getUser_id() != null) {
					buffer.append(" and l.user_id = #{user_id}");
				}
				if (obj.getPayment_prodiver() != null) {
					buffer.append(" and l.payment_provider = #{payment_provider}");
				}
				if (obj.getCreate_time() != null) {
					buffer.append(" and l.create_time > #{create_time}");
				}
				WHERE("1=1" + buffer.toString());
				ORDER_BY("l.create_time desc");
			}
		}.toString();
	}

}
