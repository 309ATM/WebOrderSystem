package com.light.dao;


import com.light.exception.DatabaseException;

public class UserDao {
	
	public void findUser(String userName,String password) {
		//TODO �������ݿⷽ��
		boolean isExist = true;
		if(! isExist) {
			throw new DatabaseException(null,"�û�������","DB__0001");
		}
	}
}
