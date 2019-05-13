package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.revature.util.ConnectionUtil;

public class StatusUpdate {
   Date date = new Date();
   long time = date.getTime();
	
	public void UpdateStatus(int reimb_Status_Id,  int requestId, int reimb_Resolver) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "update ers_reimbursement set reimb_status_id = ?, reimb_resolved=?, reimb_resolver = ? where reimb_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, reimb_Status_Id);
			ps.setTimestamp(2, new Timestamp(time));
			ps.setInt(3, reimb_Resolver);
			ps.setInt(4,requestId);
			ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
