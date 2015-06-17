package com.beaconmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.beaconmanager.common.Constants;
import com.beaconmanager.pojo.User;

public class JdbcUserDAO implements UserDAO{

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public void insert(User user){
		 
		
	}


	@Override
	public boolean authenticateUser(String userName, String password) {
		boolean result = false;
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String sql = "SELECT " + Constants.USER_NAME + ","
				+ Constants.PASSWORD
				+ " FROM USER WHERE " 
				+ Constants.USER_NAME + "= ?";
		
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);			
			
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					rs.close();
					ps.close();
				conn.close();
				} catch (SQLException e) {}
			}
		}
		return result;
	}
	
}
