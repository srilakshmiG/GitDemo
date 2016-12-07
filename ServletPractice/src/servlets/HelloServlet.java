package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;

public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("Hello World");
		//req.getRequestDispatcher("/bye").forward(req,resp); // display on bye servlet
		//req.getRequestDispatcher("/bye").include(req,resp); // display the contents of both hello and bye servlet pages.
		//resp.sendRedirect("http://www.google.com");// redirects to given URL.
		String msg = getServletConfig().getInitParameter("email");
		out.println(msg);
	}
		

	}


