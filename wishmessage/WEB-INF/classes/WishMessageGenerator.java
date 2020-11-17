package com.nt.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.time.*;

public class WishMessageGenerator extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		LocalTime t=LocalTime.now();
		int hr=t.getHour();
		String messg=null;
		if(hr<12)
			messg="Good-Morning";
		else
			if(hr<16)
			messg="Good-AfterNoon";
		else
			if(hr<20)
			messg="Good-Evening";
		else
			messg="Good-Night";

		PrintWriter pw=res.getWriter();
		pw.println("<h1 style='color:red;background-color:green;text-align:center'>"+messg+"</h1>");
		pw.println("<a href='http://localhost:3030/wishmessage/page.html'>home</a>");
		pw.close();
	}
		



}