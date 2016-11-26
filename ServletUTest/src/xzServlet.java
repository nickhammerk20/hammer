import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xzServlet extends HttpServlet
{
	public void xzDo(HttpServletRequest req, HttpServletResponse resp) throws IOException 
	{
		PrintWriter out = resp.getWriter();
		switch (req.getParameter("command")) 
		{
		case "create": 			
			out.println("Create Ok");
			break;
		case "read":
			out.println("Read Ok");
			break;
		case "update":
			out.println("Update Ok");
			break;
		case "delete":
			out.println("Delete Ok");
			break;
		}
	}
}