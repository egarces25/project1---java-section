package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.ERS_Reimbursement;
import com.revature.util.ConnectionUtil;

public class GetStatusDao {
	List<ERS_Reimbursement> retrieve = new ArrayList<ERS_Reimbursement>();

	public  List<ERS_Reimbursement> getStatus(int ers_Id, int user_Role_Id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ERS_REIMBURSEMENT WHERE reimb_Status_Id = ? ";
			String sql2 = "SELECT * FROM ERS_REIMBURSEMENT";
			
			
			PreparedStatement ps;
			
			if(user_Role_Id==2)
			{
				ps = conn.prepareStatement(sql);
				ps.setInt(1, ers_Id);
			}
			else
			{
				ps = conn.prepareStatement(sql2);
			}
		
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				 ERS_Reimbursement retrieval = new ERS_Reimbursement();
				 retrieval.setReimb_Id(rs.getInt("reimb_Id"));
				retrieval.setReimb_Amount(rs.getDouble("reimb_Amount"));
				 retrieval.setReimb_Submitted(rs.getTimestamp("reimb_Submitted"));
				 retrieval.setReimb_Resolved(rs.getTimestamp("reimb_Resolved"));
				 retrieval.setReimb_Receipt(rs.getString("reimb_Receipt"));
				 retrieval.setReimb_Description(rs.getString("reimb_Description"));
				 retrieval.setReimb_Author(rs.getInt("reimb_Author"));
				 retrieval.setReimb_Resolver(rs.getInt("reimb_Resolver"));
				 retrieval.setReimb_Status_Id(rs.getInt("reimb_Status_Id"));
				 retrieval.setReimb_Type_Id(rs.getInt("reimb_Type_Id"));
				 retrieve.add(retrieval);
				 
				
			}
			return retrieve;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return  retrieve;
		}
		
		
		
	}
}
