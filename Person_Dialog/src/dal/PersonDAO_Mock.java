package dal;

import java.util.ArrayList;

import blogic.Person;

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
		pp.add( new Person(71, "Andrey",	"Petrishe",  	12) );
		pp.add( new Person(12, "Volodya",	"Kovalevskij", 	23) );
		pp.add( new Person(34, "Sergey",	"Shevchenko", 	25) );
		pp.add( new Person(22, "Aleksey",	"Abrosimov", 	62) );
		pp.add( new Person(18, "Evgenii",	"Lopateckii", 	75) );
		pp.add( new Person(62, "Anton",		"Kobilko", 		82) );
		pp.add( new Person(51, "boris",		"Tkachuk", 		17) );
		pp.add( new Person(82, "Daniil",	"Bova", 		18) );
		pp.add( new Person(11, "Ivan",		"Pulinec", 		19) );
		pp.add( new Person(44, "Aleksei",	"kuts", 		18) );
		pp.add( new Person(50, "Wasilij",	"Palivoda",		65) );
		pp.add( new Person(55, "Artem",		"Palivoda",		25) );
		pp.add( new Person(56, "Dasilij",	"Palivoda",		65) );
		pp.add( new Person(51, "Gasilij",	"Palivoda",		65) );
		pp.add( new Person(57, "Basilij",	"Pabivoda",		65) );
		pp.add( new Person(66, "Jurii",		"Malyarchuk", 	40) );
		pp.add( new Person(91, "Anna", 		"trembach",		30) );
		pp.add( new Person(74, "Sveta",		"Gavrilenko",	31) );
		pp.add( new Person(86, "nastja",	"Hitraja",		30) );
		pp.add( new Person(28, "Natalja",	"Bondarjuk", 	27) );
		//		pp.add( new Person(39, "Fedor",		"Kirik", 		62) );
		//		pp.add( new Person(69, "Jin",		"Fusenko",		54) );
		//		pp.add( new Person(77, "kin",		"Antosjuk", 	36) );
		//		pp.add( new Person(96, "prutkin",	"Onichenko", 	77) );
		//		pp.add( new Person(74, "rupki", 	"Mironjuk", 	56) );
		//		pp.add( new Person(65, "Fupki",  	"Pogodina",		54) );
		//		pp.add( new Person(19, "zupki",  	"Gadjukov", 	45) );
		//		pp.add( new Person(39, "Shlupkin",	"Jakovlev", 	66) );
		//		pp.add( new Person(40, "Fantoci",	"Jakovlev", 	60) );
		//		pp.add( new Person(99, "Dupkin",	"Cherevatij", 	35) );
		
		print(pp);
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
		//pp.p.set();
	}

	@Override
	public void delete(Person p) 
	{
		pp.remove(p);
	}
	public static void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}

}
