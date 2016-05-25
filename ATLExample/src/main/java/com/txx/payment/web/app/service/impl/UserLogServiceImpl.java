package com.txx.payment.web.app.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txx.payment.web.app.dao.UserLogDao;
import com.txx.payment.web.app.model.UserLogWeb;
import com.txx.payment.web.app.service.UserLogService;

@Service("userLogService")
public class UserLogServiceImpl implements UserLogService {
	@Autowired
	private UserLogDao userLogDao;


	public UserLogDao getUserLogDao() {
		return userLogDao;
	}

	public void setUserLogDao(UserLogDao userLogDao) {
		this.userLogDao = userLogDao;
	}

	@Override
	public int addItem(UserLogWeb obj){
		try{
			obj.setCreate_time(LocalDateTime.now());
			userLogDao.insert(obj);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;//TODO for last insert id
	}
	
	@Override
	public UserLogWeb getItem(Object target) {
		UserLogWeb rtn = null;
		try{
			rtn = userLogDao.getItem(target);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}

	@Override
	public List<UserLogWeb> getAll(int offset, int size, UserLogWeb obj) {
		List<UserLogWeb> rtn = null;
		try{
			rtn = userLogDao.getAll(size > 0 ? new RowBounds(offset, size) : new RowBounds(), obj);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return  rtn;
	}

	@Override
	public int getTotal(UserLogWeb obj){
		int rtn = 0;
		try{
			rtn = userLogDao.getTotal(obj);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rtn;
	}
}
