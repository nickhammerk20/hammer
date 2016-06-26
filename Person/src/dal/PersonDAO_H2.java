package dal;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import blogic.Person;

public class PersonDAO_H2 implements PersonDAO
{
	@Override
	public void create(Person p) {}

	@Override
	public ArrayList<Person> read() 
	{
//		ArrayList<Person> pp = new ArrayList<Person>();
//		
//		try
//		{
//			Class.forName("org.h2.Driver");
//			
//			Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
//			while (rs.next() )
//			{
//				pp.add( new Person( rs.getInt("id"), rs.getString(2), rs.getString("lname"), rs.getInt(4)) );
//			}
//		}
//		catch (ClassNotFoundException e)
//		{
//			e.printStackTrace();
//		}
//		return pp;
		return null;
	}

	@Override
	public void update(Person p) {}

	@Override
	public void delete(Person p) {}

}
