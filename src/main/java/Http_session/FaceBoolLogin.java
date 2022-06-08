package Http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FaceBoolLogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		PrintWriter printWriter = resp.getWriter();

		if (email.equals("kumara@mail.com") && password.equals("984464")) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("myuserName", email);
			RequestDispatcher dispatcher = req.getRequestDispatcher("fbHome.html");
			dispatcher.forward(req, resp);
		} else {
			printWriter.write("<html><body><h1>Invalid Credential</h1></body></html>");
		}
	}
}
