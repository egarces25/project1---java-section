package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.beans.*;
import com.revature.util.ConnectionUtil;
import com.revature.util.HttpException;

import java.sql.SQLException;

public class UserDao {
	
	
	public ERS_User getPasswordByUsername(String username) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT  * from ers_users WHERE ERS_USERNAME = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("ers_users_id");
				String password = rs.getString("ERS_PASSWORD");
				String firstName = rs.getString("user_first_name");
				String lastName = rs.getString("user_last_name");
				int roleId = rs.getInt("user__role_id");
				
				  return new ERS_User(id,username,password,firstName, lastName,roleId);
				 
			}else {
				throw new HttpException(400);}
					
			}catch(SQLException e) {
				e.printStackTrace();
				throw new HttpException(500);
			}
					
		}
		

}
