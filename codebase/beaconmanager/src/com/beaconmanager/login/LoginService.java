package com.beaconmanager.login;

import com.beaconmanager.common.Util;
import com.beaconmanager.dao.JdbcUserDAO;

public class LoginService{
	
	private JdbcUserDAO userDAO;

	public String performLogin(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException{
		System.out.println("performLogin Start");
		
		if(!Util.isEmpty(loginCredentials.getUserName())
				&& !Util.isEmpty(loginCredentials.getPassword())
				&& authenticateUser(loginCredentials)){
			
				return "success";
			
		} else {
			throw new IncorrectLoginCredentialsException();
		}
	}
	
	public boolean authenticateUser(LoginCredentials loginCredentials){
		System.out.println("authenticateUser Start " + loginCredentials.getUserName() + " " + loginCredentials.getPassword());
		return userDAO.authenticateUser(loginCredentials.getUserName(), loginCredentials.getPassword());
		
	}
	
	
	public JdbcUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(JdbcUserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
