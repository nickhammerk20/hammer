import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calcServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String operation = request.getParameter("op");
		int res = 0;
		switch(operation)
		{
		case "+" : res = num1 + num2; break;
		case "-" : res = num1 - num2; break;
		case "*" : res = num1 * num2; break;
		case "/" : res = num1 / num2; break;
		}
		PrintWriter prtwr = response.getWriter();
		prtwr.println( res );
	}


	public void doPost(HttpServletRequest requ, HttpServletResponse resp) throws IOException
	{
		doGet(requ, resp);
	}
}
