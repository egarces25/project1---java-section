package com.revature.services;
import com.revature.dao.UserDao;
import com.revature.beans.ERS_User;
import com.revature.util.HttpException;

public class LoginServices{
	UserDao loginDao = new UserDao();
	public ERS_User login(ERS_User users) {
		
		if(users.getErs_Password() == null || users.getErs_Username() == null) {
			throw new HttpException(422);
		}
		
	
		users = loginDao.getPasswordByUsername(users.getErs_Username());
		
		if (!users.getErs_Password().equals(users.getErs_Password())) {
			throw new HttpException(400);
		}
		
		return users;
	}
	public LoginServices(UserDao loginDao) {
		super();
		this.loginDao = loginDao;
	}
	public LoginServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	