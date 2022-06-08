package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/hotel")
public class Hotel extends HttpServlet {

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		PrintWriter printWriter = res.getWriter();
//		String user = req.getParameter("user");
//		String htmlCode;
//		if (user != null) {
//			htmlCode = "<html ><body><h1>Welcome" + user +"To My Hotel</html ></body></h1>";
//			printWriter.write(htmlCode);
//		} else {
//			htmlCode = "<html ><body><h1>sorry you are not autherised Person</html ></body></h1>";
//		}
//		printWriter.write(htmlCode);
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		
		Cookie[] cookies=req.getCookies();
		String userName=null;
		for (Cookie cookie : cookies) {
			String user=cookie.getName();
			if(user.equals("email")) {
				userName=cookie.getValue();
				
			}
		}
		String htmlCode;
		if(userName!=null) {
			htmlCode="<html ><body><h1>Welcome" + userName +"To My Hotel</html ></body></h1>";
		
		} else {
			htmlCode = "<html ><body><h1>sorry you are not autherised Person</html ></body></h1>";
			
		}
			printWriter.println(htmlCode);
		}

}
