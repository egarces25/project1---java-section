package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ERS_Reimbursement;
import com.revature.services.ReimbursementRequestService;

public class ReimbursementServlet extends DefaultServlet{
	ReimbursementRequestService requestServices = new ReimbursementRequestService();
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.addHeader("Access-Control-Allow-Headers", "content-type");
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		super.service(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws IOException , ServletException {
		ObjectMapper om = new ObjectMapper();
		ERS_Reimbursement requests = om.readValue(request.getInputStream() ,ERS_Reimbursement.class);
		
		requestServices.insert(requests.getReimb_Amount(), requests.getReimb_Receipt(),requests.getReimb_Description(), requests.getReimb_Author(), requests.getReimb_Type_Id());

		
	
	
	}
	

	
	

}
