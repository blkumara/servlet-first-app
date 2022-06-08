package com.ty.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		PrintWriter printWriter = resp.getWriter();

		if (email.equals("kumara@mail.com") && password.equals("kumara123")) {
			
			Cookie cookie=new Cookie("email", email);
		    Cookie cookie2=new Cookie("password", password);
		    
		    resp.addCookie(cookie);
		    resp.addCookie(cookie2);
		    
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);

		} else {
			printWriter.write("<html><body><h1>Invalid credentials</h1></body></html>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
		}
	}
}
