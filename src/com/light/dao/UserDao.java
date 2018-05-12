package com.light.dao;


import com.light.exception.DatabaseException;

public class UserDao {
	
	public void findUser(String userName,String password) {
		//TODO 调用数据库方法
		boolean isExist = true;
		if(! isExist) {
			throw new DatabaseException(null,"用户不存在","DB__0001");
		}
	}
}
