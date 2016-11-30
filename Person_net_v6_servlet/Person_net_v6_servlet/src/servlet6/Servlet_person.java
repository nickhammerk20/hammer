package servlet6;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_person extends HttpServlet 
{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println();
		System.out.println(request.getQueryString());
		
		new SCommand().doGet(request, response);


		
//		PrintWriter prtwr = response.getWriter();
//
//		prtwr.println( ret );
	}

	public void doPost(HttpServletRequest requ, HttpServletResponse resp) throws IOException
	{
		doGet(requ, resp);
	}	
}
