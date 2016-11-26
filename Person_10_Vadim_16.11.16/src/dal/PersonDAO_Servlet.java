package dal;

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

import com.google.gson.Gson;

import blogic.Person;

public class PersonDAO_Servlet extends HttpServlet
{	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		ArrayList<Person> pp = new ArrayList<Person>();
		Gson gs = new Gson();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/larisa?autoReconnect=true&useSSL=false", "root" ,"");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
			
			while (rs.next() )
			{
				pp.add( new Person( rs.getInt("id"), rs.getString(2), rs.getString("lname"), rs.getInt(4)) );
//				ret += ( rs.getInt("id") +" " + rs.getString(2) +" " + rs.getString("lname") +" " + rs.getInt(4) );
			}
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		String ret = gs.toJson(pp);
		PrintWriter prwrt = response.getWriter();
		prwrt.println(ret);
	}

	public void doPost(HttpServletRequest requ, HttpServletResponse resp) throws IOException
	{
		doGet(requ, resp);
	}
}
