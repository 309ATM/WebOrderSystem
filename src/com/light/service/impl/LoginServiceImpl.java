package com.light.service.impl;

import com.light.dao.UserDao;
import com.light.exception.InvalidDataException;
import com.light.service.ILoginService;


public class LoginServiceImpl implements ILoginService{

	public void login(String userName,String pwd) {
		// TODO �Զ����ɵķ������
		if (null == userName || "".equals(userName.trim())) {
			throw new InvalidDataException(null,"�û���Ϊ��","Data_0001");
		}
		
		// TODO ���� DAO
		try {
			UserDao userDao = new UserDao();
			userDao.findUser(userName, pwd);
		} catch (Exception e) {
			System.out.println("err.jsp");
		}

	}

}
