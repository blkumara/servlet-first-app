package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String n = req.getParameter("myPersonName");
		PrintWriter printWriter = res.getWriter();

		String htmlCode = "<html ><body><h1>Welcome " + n + "</html ></body></h1>";
		printWriter.write(htmlCode);
	}

}
