package dal;

import java.util.ArrayList;

import blogic.Person;

public class PersonDAO_YAML implements PersonDAO
{
	ArrayList<Person> pp = null;

	public String fileSave(ArrayList<Person> pp)
	{
		String str = "Persons: ";
		for (Person p : pp) 
		{
			str +="\n - \n   ID: " + p.id +
					"\n  firstName: " + p.fname +
					"\n  lastName: " + p.lname +
					"\n  age: " + p.age +
					"\n  phone: " + p.telNumber;
		}
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
