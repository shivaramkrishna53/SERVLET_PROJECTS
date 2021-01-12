package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet

{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get");
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int option=Integer.parseInt(req.getParameter("lstcountries"));
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		String capitals[]=new String[]{"delhi","sydney","bejing","washingtondc","colombo"};
		pw.println("<h1 style='text-align:center;color:red'>Capital city is::"+capitals[option]+"</h1>");
		pw.println("<a href='input.html'>Link to go to home page</a>");
		pw.close();
		
	}
	
}