package com.nt.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
public class Interlization extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
	Locale[] l=Locale.getAvailableLocales();
	for(int i=0;i<l.length;i++)
		{
		Locale loc=l[i];
		if(!loc.getDisplayCountry().isEmpty() && !loc.getDisplayLanguage().isEmpty())
			pw.println(loc.getDisplayCountry() + "::::" + loc.getDisplayLanguage());
		}


		}
	}

