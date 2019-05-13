package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ERS_Reimbursement;
import com.revature.services.UpdateService;

public class UpdateServlet extends DefaultServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.addHeader("Access-Control-Allow-Headers", "content-type");
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		super.service(request, response);
	}
	
	
	protected void doPut(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException {
		UpdateService updateService = new UpdateService();
		ObjectMapper om = new ObjectMapper();
		ERS_Reimbursement update = om.readValue(request.getInputStream(),ERS_Reimbursement.class);
		updateService.update(update.getReimb_Status_Id(),update.getReimb_Id() ,update.getReimb_Resolver());
		System.out.println("Updated");
		

		
	}
	
}
