/**
 * 
 */
package com.txx.payment.web.app.service;

import java.util.List;

import com.txx.payment.web.app.model.UserLogWeb;

/**
 * @author Liu Xin
 *
 */
public interface UserLogService {
	public int addItem(UserLogWeb obj);
	public UserLogWeb getItem(Object target);
	public List<UserLogWeb> getAll(int offset, int size, UserLogWeb obj);
	public int getTotal(UserLogWeb target);
}
