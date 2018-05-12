package com.light.service.impl;

import com.light.dao.UserDao;
import com.light.exception.InvalidDataException;
import com.light.service.ILoginService;


public class LoginServiceImpl implements ILoginService{

	public void login(String userName,String pwd) {
		// TODO 自动生成的方法存根
		if (null == userName || "".equals(userName.trim())) {
			throw new InvalidDataException(null,"用户名为空","Data_0001");
		}
		
		// TODO 调用 DAO
		try {
			UserDao userDao = new UserDao();
			userDao.findUser(userName, pwd);
		} catch (Exception e) {
			System.out.println("err.jsp");
		}

	}

}
