//package com.revature.servlet;
//
//import java.io.IOException;
//
//import com.revature.beans.*;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.catalina.servlets.DefaultServlet;
//
//public class UserServlet extends DefaultServlet {
//
//
//	@Override
//	public void init() {
//		System.out.println("Website name: " + this.getServletContext().getInitParameter("website-name"));
//		System.out.println("UserServlet is initializing");
//		System.out.println("Init param of name: " + this.getInitParameter("name"));
//	}	
//
//	}
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Service being called");
//		
//		
//		super.service(req, resp);
//	}
//	
//	
//	
//}
