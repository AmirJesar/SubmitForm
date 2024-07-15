package com.Form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SubmitForm extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h2> This is page for Details registered through FORM you submitted");
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("gender");
		String course = request.getParameter("course");
		String condition = request.getParameter("condition");
		if (condition != null) {
			if (condition.equals("checked")) {
				out.println("<h1 style=text-align:center> Name=\t" + name + "</h1>");
				out.println("<h1 style=text-align:center> password=\t" + password + "</h1>");
				out.println("<h1 style=text-align:center> Email=\t" + email + "</h1>");
				out.println("<h1 style=text-align:center> Gender=\t" + gender + "</h1>");
				out.println("<h1 style=text-align:center> Course=\t" + course + "</h1>");
				out.println("<h1 style=text-align:center> Checkbox=\t" + condition + "</h1>");
			} else {
				out.println("<h3> you have not accepted terms and condition ");
			}
		}else {
			
			out.println("<h3> you have not accepted terms and condition");

		}

	}

}
