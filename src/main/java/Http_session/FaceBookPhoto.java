package Http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/fbphoto")
public class FaceBookPhoto extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession httpSession = req.getSession();

		Object username = httpSession.getAttribute("myuserName");
		PrintWriter printWriter = resp.getWriter();

		String htmlCode;

		if (username != null) {
			htmlCode = "<html><body><h1>Welcome" + username + "to FB Photos Page</h1></body></html>";
		} else {
			htmlCode = "<html><body><h1>Sorry you are not authorised person</h1></body></html>";

		}

			printWriter.write(htmlCode);

	}

}
