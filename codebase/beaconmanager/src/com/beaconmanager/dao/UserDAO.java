package com.beaconmanager.dao;

import com.beaconmanager.pojo.User;


public interface UserDAO {
	public void insert(User user);
	public boolean authenticateUser(String userName, String password);
}
