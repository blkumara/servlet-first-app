package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String name=req.getParameter("stName");
			String email=req.getParameter("stEmail");
			
			PrintWriter printWriter=resp.getWriter();
			
			printWriter.write("<html><body>");
			printWriter.write("<h1>Name Is:"+name+"</h1>");
			printWriter.write("<h1>Email Is:"+email+"</h1>");
			printWriter.write("</html></body>");
					
		
		}
}
