package com.nt.servlet;
import jakarta.servlet.*;
import java.io.*;
import java.util.*;
public class DateServlet extends GenericServlet

{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		//res.setcontenttype is used to set the content so that the browser displays the content of the response object as html web page
		res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
		Date dt=new Date();
		pw.println(dt);
		pw.close();


	}
}
