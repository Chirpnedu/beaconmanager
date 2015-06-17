package com.beaconmanager.login;

import java.io.Serializable;

public class LoginCredentials implements Serializable{

	private static final long serialVersionUID = 6182390898687671093L;
	
	private String userName;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		System.out.println("setpasword: " + password);
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		System.out.println("setUserName: " + userName);
		this.userName = userName;
	}
	
		

}
