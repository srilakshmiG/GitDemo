package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		System.out.println(req.getParameter("userName"));
		System.out.println(req.getParameter("password"));
		PrintWriter out = resp.getWriter();
		out.print(req.getParameter("userName") + "and password is" +req.getParameter("password"));
		
		
			if("sr".equals(req.getParameter("password")))
			{
//				Cookie c = new Cookie("uname",req.getParameter("userName"));
//				resp.addCookie(c);
				HttpSession session = req.getSession();
				session.setAttribute("uname", req.getParameter("userName"));
				req.getRequestDispatcher("register.html").forward(req, resp);
			}
			else
			{
				out.print("plaese check your password");
				req.getRequestDispatcher("Login.html").include(req, resp);
			}
			
			
			
		
	}
	

}
