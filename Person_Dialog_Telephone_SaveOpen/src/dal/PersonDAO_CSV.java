package dal;

import java.util.ArrayList;

import blogic.Person;

public class PersonDAO_CSV implements PersonDAO 
{
	ArrayList<Person> pp = null;

	@Override
	public void create(Person p) {}

	@Override
	public ArrayList<Person> read() 
	{
		return null;
	}

	@Override
	public void update(Person p) {}

	@Override
	public void delete(Person p) {}
	
	public void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}
	
	public String fileSave(ArrayList<Person> pp)
	{
		String str = "";
		for (Person p : pp) 
		{
			str +=p.id + ", " + p.fname + ", " + p.lname + ", " + p.age + ", " + p.telNumber+"\n";
		}
		System.out.println(str);
		return str;
	}
}
