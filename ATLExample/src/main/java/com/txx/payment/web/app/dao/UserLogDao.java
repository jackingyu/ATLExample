/**
 * 
 */
package com.txx.payment.web.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.mapping.ResultSetType;
import org.apache.ibatis.session.RowBounds;

import com.txx.payment.web.app.dao.provider.TxxWebGenericProvider;
import com.txx.payment.web.app.model.UserLogWeb;

/**
 * @author Liu Xin
 *
 */
public interface UserLogDao extends SecurityAware{

	@InsertProvider(method = "addUserLog", type = TxxWebGenericProvider.class)
	public void insert(Object target);

	@SelectProvider(method = "getUserLogByID", type = TxxWebGenericProvider.class)
	@Results({
		@Result(id = true, property = "id", column = "id"),
		@Result(property = "user_id", column = "user_id"),
		@Result(property = "payment_log", column = "payment_log"),
		@Result(property = "payment_provider", column = "payment_provider"),
		@Result(property = "create_time", column = "create_time", typeHandler = LocalDateTypeHandler.class)})
	public UserLogWeb getItem(Object target);

	@SelectProvider(method = "getAllUserLog", type = TxxWebGenericProvider.class)
	@Options(resultSetType = ResultSetType.SCROLL_INSENSITIVE)
	@Results({
		@Result(id = true, property = "id", column = "id"),
		@Result(property = "user_id", column = "user_id"),
		@Result(property = "payment_log", column = "payment_log"),
		@Result(property = "payment_provider", column = "payment_provider"),
		@Result(property = "create_time", column = "create_time", typeHandler = LocalDateTypeHandler.class)})
	public List<UserLogWeb> getAll(RowBounds rowBounds,Object target);

	@SelectProvider(method = "getTotalUserLog", type = TxxWebGenericProvider.class)
	public int getTotal(Object target);
	
}
