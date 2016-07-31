package Lister_Generic;

public class PMain 
{
	public static void main(String[] args)
	{
		PList0 lst = new PList0();
		lst.init( init ());
		print( (Person[]) lst.toArray() );
		Person p1 = new Person (10, "Vasia", 	"Pupkin", 		23);
		lst.addStart(p1);
		Person p = (Person) lst.get(0);
	}

	public static void print(Person[] pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}

	public static Person[] init()
	{
		Person[] pp = new Person[5];

		pp[0] = new Person (10, "Vasia", 	"Pupkin", 		23);
		pp[1] = new Person (14, "Kasia", 	"Lupkin", 		27);
		pp[2] = new Person (17, "Masia",	"Gupkin",		19);
		pp[3] = new Person (33, "Gasia", 	"Hupkin", 		56);
		pp[4] = new Person (60, "Lasia", 	"Jupkin", 		99);

		return pp;
	}
}
