package servlet6;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class SCommand
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
			//		PersonDAO pd = new PersonDAO_MySQL();
			PersonDAO pd = new PersonDAO_Mock();
			Gson gs = new Gson();
			String ret = "";
			Person p = null;

			String cmd = request.getParameter("cmd");

			if (!cmd.equals("read"))
			{
				p = new Person();
				p.id = Integer.parseInt(request.getParameter("id"));

				if (!cmd.equals("delete"))
				{
					p.fname = request.getParameter("fname");
					p.lname = request.getParameter("lname");
					p.age = Integer.parseInt(request.getParameter("age"));
				}
			}

			switch (cmd)
			{
				case "read"	 : ret = gs.toJson( pd.read() ); break;
				case "create": pd.create(p); break;
				case "update": pd.update(p); break;
				case "delete": pd.delete(p); break;
			}

			response.getWriter().println( ret );
			response.getWriter().flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}	
	}
}
