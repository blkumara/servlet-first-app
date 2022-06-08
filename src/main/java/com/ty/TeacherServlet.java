package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TeacherServlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("TeName");
		String subject=req.getParameter("TeSubject");
		
		PrintWriter printWriter=resp.getWriter();//when it will shoe method not allowed then we will use dopost method
		
		printWriter.write("<html><body>");
		printWriter.write("<h1>Name Is:"+name+"</h1>");
		printWriter.write("<h1>Subject Is:"+subject+"</h1>");
		printWriter.write("</html></body>");
	}
				
}
