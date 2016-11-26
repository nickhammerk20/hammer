package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.client.entity.UrlEncodedFormEntity;

import com.google.gson.Gson;

public class Servlet_person extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String cmd = request.getParameter("cmd");
		
		System.out.println("servlet start ");
		
		Gson gs = new Gson();
		PersonDAO pd = new PersonDAO_MySQL();
		Person p = new Person();
		
		String ret = "";
		
		if (!cmd.equals("read"))
		{
			p.id = Integer.parseInt(request.getParameter("id"));
			System.out.println("id = " + p.id);
			
			if (!cmd.equals("delete"))
			{
				p.fname = request.getParameter("fname");
				p.lname = request.getParameter("lname");
				p.age = Integer.parseInt(request.getParameter("age"));
				
				System.out.println("age = " + p.age + "fname = " + p.fname + "lname = " + p.lname);
			}
		}

		switch (cmd)
		{
			case "read"	 : 
			{
				System.out.println("123");
				
				ret = gs.toJson(pd.read());
				System.out.println(ret);
				break;
			}
			case "create": pd.create(p); break;
			case "update": pd.update(p); break;
			case "delete": pd.delete(p); break;

		}

		PrintWriter prtwr = response.getWriter();
		prtwr.println( ret );

	}

	public void doPost(HttpServletRequest requ, HttpServletResponse resp) throws IOException
	{
		doGet(requ, resp);
	}	
}
