package dal;

import java.util.ArrayList;

import blogic.Person;

public class PersonDAO_YAML implements PersonDAO
{
	ArrayList<Person> pp = null;

	public String fileSave(ArrayList<Person> pp)
	{
		String str = "<Persons>\n";
		for (Person p : pp) 
		{
			str +="<Person>\n"+
					"<ID>" + p.id + "</ID>\n" +
					"<firstName>" + p.fname + "</firstName>\n" +
					"<lastName>" + p.lname + "</lastName>\n" +
					"<age>" + p.age + "</age>\n" +
					"<phone>" + p.telNumber + "</phone>\n"+
					"</Person>\n";
			
		}
		str += "</Persons>";
		System.out.println(str);
		return str;
	}	
	
	@Override
	public void create(Person p) 
	{
				
	}

	@Override
	public ArrayList<Person> read() 
	{
		
		return null;
	}

	@Override
	public void update(Person p) 
	{
				
	}

	@Override
	public void delete(Person p) 
	{
				
	}
}
