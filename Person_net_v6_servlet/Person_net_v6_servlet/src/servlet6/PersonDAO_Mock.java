package servlet6;

import java.util.ArrayList;

public class PersonDAO_Mock implements PersonDAO
{
	ArrayList<Person> pp = new ArrayList<Person>();

	public PersonDAO_Mock()
	{
		pp.add( new Person(10, "Vasia", 	"Pupkin", 		23) );
		pp.add( new Person(14, "Kasia", 	"Lupkin", 		27) );
		pp.add( new Person(17, "Masia",		"Gupkin",		19) );
		pp.add( new Person(33, "Gasia", 	"Hupkin", 		56) );
		pp.add( new Person(60, "Lasia", 	"Jupkin", 		99) );
		
//		print(pp);
//		System.out.println("\n******загружено******");
	}

	@Override
	public void create(Person p) 
	{
		pp.add(p);
	}

	@Override
	public ArrayList<Person> read() 
	{
		return pp;
	}

	@Override
	public void update(Person p) 
	{
		int size = pp.size();
		for(int i = 0 ; i< size; i++)
		{
			if (p.id == pp.get(i).id)
			{
			pp.get(i).fname=p.fname;
			pp.get(i).lname=p.lname;
			pp.get(i).age=p.age;
			}
		}
	}

	@Override
	public void delete(Person p) 
	{
		int size = pp.size();
		for(int i = 0 ; i< size-1; i++)
		{
			if (p.id == pp.get(i).id)
			{
				pp.remove(i);	
			}
		}
	}
	
	public static void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}

}
