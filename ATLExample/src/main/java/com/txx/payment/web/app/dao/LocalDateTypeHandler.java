package com.txx.payment.web.app.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class LocalDateTypeHandler implements TypeHandler<LocalDateTime>{

	@Override
	public void setParameter(PreparedStatement ps, int i,
			LocalDateTime localDateTime, JdbcType jdbcType) throws SQLException {
		Timestamp ts = Timestamp.valueOf(localDateTime);
		ps.setTimestamp(i, ts);
	}

	@Override
	public LocalDateTime getResult(ResultSet rs, String columnName)
			throws SQLException {
		Timestamp ts = rs.getTimestamp(columnName);
		return ts.toLocalDateTime();
	}

	@Override
	public LocalDateTime getResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Timestamp ts = rs.getTimestamp(columnIndex);
		return ts.toLocalDateTime();
	}

	@Override
	public LocalDateTime getResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		Timestamp ts = cs.getTimestamp(columnIndex);
		return ts.toLocalDateTime();
	}

	

}
