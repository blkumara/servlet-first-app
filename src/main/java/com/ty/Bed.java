package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet(value = "/bed")
public class Bed extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter printWriter = res.getWriter();

		String user = req.getParameter("user");
		String htmlCode;
		if (user != null) {
			htmlCode = "<html ><body><h1>Welcome" + user + "It Is your Bed</html ></body></h1>";
			printWriter.write(htmlCode);
		} else {
			htmlCode = "<html ><body><h1>sorry you are not autherised Person</html ></body></h1>";
		}
		printWriter.write(htmlCode);
	}

}
