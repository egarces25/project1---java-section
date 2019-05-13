package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ERS_User;
import com.revature.services.LoginServices;
import com.revature.util.HttpException;

public class LoginServlet extends DefaultServlet{
	LoginServices loginService = new LoginServices();
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.addHeader("Access-Control-Allow-Headers", "content-type");
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		super.service(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ObjectMapper om = new ObjectMapper();
		ERS_User user = om.readValue(request.getInputStream(), ERS_User.class);
	
		Integer id = null;
		try {
			user = this.loginService.login(user);
			id = user.getErs_Id();
		} catch (HttpException e) {
			response.setStatus(e.getStatus());
			return;
		}
		
		HttpSession session = request.getSession();

		session.setAttribute("ers_users_Id", id);
		String cache = id + " " + user.getUser_First_Name() + " " + user.getUser_Last_Name() + " " + user.getUser_Role_Id();
		om.writeValue(response.getOutputStream(), cache);
	}
	
	

}
