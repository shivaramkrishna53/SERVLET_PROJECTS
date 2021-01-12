package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Local;

public class CalculatorServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("do get");
		doPost(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do post");
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		String action=req.getParameter("cal");
		
		if(action.equalsIgnoreCase("countries")||action.equalsIgnoreCase("languages"))
		{
		Locale loc[]=Locale.getAvailableLocales();
		if(action.equalsIgnoreCase("countries"))
		{
			for (Locale l : loc) {
			pw.println("<h1>"+l.getDisplayCountry()+"</h1>");
			}
		}
			else
				if(action.equalsIgnoreCase("languages"))
				{
					for (Locale l : loc) {
					pw.println("<h1>"+l.getDisplayLanguage()+"</h1>");
					}
				
		}
		
		
		}
		else
		{
			int num1=Integer.parseInt(req.getParameter("first"));
			int num2=Integer.parseInt(req.getParameter("second"));	
		
		if(action.equalsIgnoreCase("add"))
		{
			int res=num1+num2;
			pw.println("<h1 style='text-align:center;color:green'>The Addition Result is::"+res+"</h1>");
		}
		else
			if(action.equalsIgnoreCase("substract"))
			{
				int res=num1-num2;
				pw.println("<h1 style='text-align:center;color:green'>The Substraction Result is::"+res+"</h1>");
				
			}
			else
				if(action.equalsIgnoreCase("multiply"))
				{
					int res=num1*num2;
					pw.println("<h1 style='text-align:center;color:green'>The Multiplication Result is::"+res+"</h1>");
					
				}
				else
					if(action.equalsIgnoreCase("division"))
					{
						if(num2==0)
							pw.println("<h1 style='color:red;text-align:center'>Second Number cannot be 0</h1>");
						float res=(float)num1/num2;
						pw.println("<h1 style='text-align:center;color:green'>The Division Result is::"+res+"</h1>");
						
					}
					else
						if(action.equalsIgnoreCase("countries"))
						{
							pw.println("<h1>hellow</h1>");
						}
		
	}
	
}
}
