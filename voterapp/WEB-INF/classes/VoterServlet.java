package com.nt.servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class VoterServlet extends HttpServlet
{
	
		public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
       
      
		if(age>=18)
			pw.println("<h1 style='color:green;bgcolor:black;text-align:center'>"+name+" you are elgible for voting</h1>");
            
		else
			pw.println("<h1 style='color:red;bgcolor:black;text-align:center'>"+name+" you are not elgible for voting wait for another"+(18-age)+"years </h1>");
            
            
            
            pw.println("<a href='http://localhost:3030/voterapp/homepage.html'><img src='images/home.png' width='200';height='300'></img></a>");
           
		pw.close();


	}

}