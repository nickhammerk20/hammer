package dal;

import java.util.ArrayList;

import blogic.Person;

public class PersonDAO_Mock implements PersonDAO
{

	ArrayList<Person> pp = new ArrayList<Person>();
	
	public PersonDAO_Mock()
	{
		pp.add( new Person(10, "Vasia", "Pupkin", 23) );
		pp.add( new Person(14, "Kasia", "Lupkin", 27) );
		pp.add( new Person(17, "Masia", "Gupkin", 19) );
		pp.add( new Person(33, "Gasia", "Hupkin", 56) );
		pp.add( new Person(60, "Lasia", "Jupkin", 99) );

		pp.add( new Person(70, "Petya", "Pupkin", 230) );
		pp.add( new Person(71, "kasia", "Pupkin", 270) );
		pp.add( new Person(72, "masia", "Gupkin", 190) );
		pp.add( new Person(73, "gasia", "Hupkin", 560) );
		pp.add( new Person(74, "lasia", "Jupkin", 990) );

		pp.add( new Person(75, "Asia", "pupkin", 33) );
		pp.add( new Person(76, "Kasia", "lupkin", 7) );
		pp.add( new Person(77, "Masia", "gupkin", 9) );
		pp.add( new Person(78, "Gasia", "hupkin", 6) );
		pp.add( new Person(79, "Lasia", "jupkin", 9) );

		pp.add( new Person(80, "Vasia1", "Pupkinko", 10) );
		pp.add( new Person(81, "Kasia1", "Lupkinko", 11) );
		pp.add( new Person(82, "Masia1", "Gupgkinko", 21) );
		pp.add( new Person(83, "Gasia1", "Hupkinko", 55) );
		pp.add( new Person(84, "Lasia1", "Jupkinko", 91) );

		pp.add( new Person(85, "Anton", "Dugka", 55) );
		pp.add( new Person(86, "Lena", "Looper", 33) );
		pp.add( new Person(87, "Katya", "Daniessov", 22) );
		pp.add( new Person(88, "Gena", "Greeehut", 44) );
		pp.add( new Person(89, "Miha", "Lkop", 77) );

		pp.add( new Person(90, "Maks", "Assa", 35) );
		pp.add( new Person(91, "Sergey", "Qwerty", 20) );
		pp.add( new Person(92, "Pitzz", "Gupkinin", 19) );
		pp.add( new Person(93, "Country", "Hupkinin", 56) );
		pp.add( new Person(94, "Prince", "Jupkinin", 99) );
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
	public void update(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		
	}

}
