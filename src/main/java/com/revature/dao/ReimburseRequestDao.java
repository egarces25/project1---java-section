package com.revature.dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.tomcat.util.buf.TimeStamp;

import com.revature.util.ConnectionUtil;

public class ReimburseRequestDao {
	Date date = new Date();
	long time = date.getTime();
	public void InsertRequest(double reimb_Amount, String reimb_Receipt, String reimb_Description, int reimb_Author,  int reimb_Type_Id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO ERS_REIMBURSEMENT (reimb_Amount, reimb_Submitted, reimb_Description, reimb_Author,reimb_Type_Id) VALUES (?,?,?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1,  reimb_Amount);
			ps.setTimestamp(2, new Timestamp(time));
			ps.setString(3, reimb_Description);
			ps.setInt(4, reimb_Author);
			ps.setInt(5, reimb_Type_Id);
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
			}
}
