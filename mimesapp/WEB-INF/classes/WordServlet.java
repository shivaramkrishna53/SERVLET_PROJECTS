package com.nt.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class WordServlet extends HttpServlet 
{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("application/msword");
		PrintWriter pw=res.getWriter();
		pw.println("<table border='1' bgcolor='red' align='center'>");
		pw.println("<tr> <th>TeamName</th> <th>TeamCap</th></tr>");
		pw.println("<tr><td>srh</td><td>DavidWarner</td></tr>");
		pw.println("<tr><td>csk</td><td>dhoni</td></tr>");
		pw.println("</table>");
		pw.close();


	}
	
}
