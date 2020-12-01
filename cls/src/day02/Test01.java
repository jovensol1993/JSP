package day02;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/day02/Test01.cls")
public class Test01 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/views/day02/Test01.jsp";
		
		RequestDispatcher rd = req.getRequestDispatcher(view);
		
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
