package org.o7planning.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//ServletOutputStream out = response.getOutputStream();
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");

		out.println("<body>");
		out.println("<h3>Hello World Семен</h3>");
		out.println("This is my first Servlet");
		out.println("</body>");
		out.println("<html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
