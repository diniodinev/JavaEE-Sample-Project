package com.musala;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "start", value = "/start")
public class StartClass extends HttpServlet {

	private static final long serialVersionUID = 8278993581913421736L;

	@Override
	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession(true);

		Integer counter = (Integer) session.getAttribute("COUNTER");
		if (counter == null) {
			counter = 0;
		}
		
		if (null == session.getAttribute("ID")
				&& request.getParameter("id") != null) {
			request.getSession().setAttribute("ID", request.getParameter("id"));
		} else{
			request.getSession().setAttribute("ID", request.getParameter("id"));
		}
	

		writer.print("ID : ");
		writer.println(session.getAttribute("ID"));

		writer.println("counter" + counter++);
		session.setAttribute("COUNTER", counter);

		response.setContentType("text/html");
		writer.append("<html><body>The passed Get id from the request is:")
				.append(String.valueOf(request.getSession()
						.getMaxInactiveInterval()));
	}
}
