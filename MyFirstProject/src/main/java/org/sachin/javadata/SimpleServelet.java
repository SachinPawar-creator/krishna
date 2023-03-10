package org.sachin.javadata;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SimpleServelet
 */

@WebServlet(name = "SimpleServelet", urlPatterns = { "/SimpleServeletPath" }, initParams = {
		@WebInitParam(name = "defaultUser", value = "Sachin Pawar") })

public class SimpleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello From Get Method.");
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		String username = request.getParameter("userName");

		HttpSession newSession = request.getSession();
		ServletContext context = request.getServletContext();
		if (username != "" && username != null) {
			newSession.setAttribute("savedUsername", username);
			context.setAttribute("savedUsername", username);
		}
		writer.println("Hello Sandy This is Your Lover " + username);
		writer.println("The session values is: " + (String) newSession.getAttribute("savedUsername"));
		writer.println("The session context values is" + (String) context.getAttribute("savedUsername"));
		writer.println("The default username is " + getServletConfig().getInitParameter("defaultUser"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello From Get Method.");
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		String username = request.getParameter("userName");
		String firstname = request.getParameter("firstName");
		String lastname = request.getParameter("lastName");

		writer.println("Hello From Post Method Sandy This is Your Lover " + username + " His First Name is  "
				+ firstname + " His last name is  " + lastname);
		String value = request.getParameter("prof");
		writer.println("You are a: " + value + " and his location is: ");

		String[] values = request.getParameterValues("location");

		for (String data : values) {

			writer.println(data);
		}

	}

}
