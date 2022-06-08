package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Person  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter printWriter=res.getWriter();
		
		String htmlCode="<html ><body><h1>Welcome To My Dear Person</html ></body></h1>";
		printWriter.write(htmlCode);
		
	}

}
