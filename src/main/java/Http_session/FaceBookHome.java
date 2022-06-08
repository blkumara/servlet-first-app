package Http_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/fbhome")
public class FaceBookHome  extends HttpServlet{

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		
		String userName=(String) httpSession.getAttribute("myuserName");//downcast String
		//		Object userName=httpSession.getAttribute("myuserName");
		
		PrintWriter printWriter=resp.getWriter();
		String htmlCode;
		
		if(userName!=null) {
			htmlCode="<html><body><h1> Welcome "+userName+"Welcome FB Home Page</h1></body></html>";
		} else {
			htmlCode="<html><body><h1> Sorry You are not authoerised Person/h1></body></html>";

		}
		printWriter.write(htmlCode);
		
	}
	
	
	
	
	
	
}
