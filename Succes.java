package com.Form;

 import jakarta.servlet.ServletException;
 import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Succes extends HttpServlet {
	 
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>This is my Success Servlet</h1>");
		
//		RequestDispatcher rd = request.getRequestDispatcher("index.html");
//		rd.include(request, response);
		
	}

}
