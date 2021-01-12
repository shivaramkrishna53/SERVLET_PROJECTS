package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		String gender=req.getParameter("gender");
		PrintWriter pw=res.getWriter();
		if(gender.equalsIgnoreCase("m"))
		{
			if(age>21)
				pw.println("<h1 style='color:green;text-align:center'>Mr."+name+"you are elgible for marriage</h1>");
			else
				pw.println("<h1 style='color:red;text-align:center'>Mr."+name+"you are not elgible for marriage</h1>");
				
		}
		else
			if(gender.equalsIgnoreCase("f"))
			{
				if(age>18)
					pw.println("<h1 style='color:green;text-align:center'>Mrs."+name+"you are elgible for marriage</h1>");
				else
					pw.println("<h1 style='color:red;text-align:center'>Mrs."+name+"you are not elgible for marriage</h1>");
					
			}
		
		pw.println("<a href='input.html'><img src='images/home.png'></img></a>");
		
	}

}
