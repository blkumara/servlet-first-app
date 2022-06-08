package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Data extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			String name=req.getParameter("personName");
			String email=req.getParameter("personEmail");
			String phone=req.getParameter("personPhone");
			String password=req.getParameter("personPassword");
	
			PrintWriter printWriter = res.getWriter();

			String htmlCode = "<html ><body><h1>" +name+"<br> "+email+"<br>"+phone+"<br>"+password+"</html ></body></h1>";
			printWriter.write(htmlCode);
		}
	}


