package com.revature.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ERS_Reimbursement;
import com.revature.beans.ERS_User;
import com.revature.services.GetStatusService;
import com.revature.services.RetrieveService;

public class GetStatusServlet extends DefaultServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.addHeader("Access-Control-Allow-Headers", "content-type");
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		super.service(request, response);
	}
	

	protected void doPost(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException {
		GetStatusService statusService = new GetStatusService();

		ObjectMapper om = new ObjectMapper();
		ERS_User getStatus= om.readValue(request.getInputStream(), ERS_User.class);
		List retrieval = statusService.getStatusId(getStatus.getErs_Id(), getStatus.getUser_Role_Id());
		om.writeValue(response.getOutputStream(), retrieval);
	
}
	}
