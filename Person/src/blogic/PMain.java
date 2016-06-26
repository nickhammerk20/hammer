package blogic;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PMain 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ArrayList<Person> pp = initFromH2();

		print (pp);

		//		print18_45( pp );
		//		print_5( pp );
		//		print_chet_ID( pp );
		//		print_lenght_6( pp );
		//		print_have_J_G( pp );
		//		print_two_fname( pp );
		//		print_first_litl( pp );
		//		print_last_ko( pp );
		//		print_two_fname( pp );
		//		print_age_1_to_100( pp );
		//		print_sortByName ( pp );

	}

	// Все у кого возраст от 18 до 45
	public static void print18_45(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе у кого возраст от 18 до 45" );
		for (Person p : pp) 
		{
			if(p.age >=18 && p.age <= 45)
				System.out.println( p );
		}
	}

	// Печать всего списка
	public static void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}

	// Инициализация из базы H2 
	public static ArrayList<Person> initFromH2() throws ClassNotFoundException, SQLException
	{
		ArrayList<Person> pp = new ArrayList<Person>();

		Class.forName("org.h2.Driver");
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement st = con.createStatement();
		ResultSet rs =  st.executeQuery("SELECT * FROM PERSON");
		while (rs.next () )
		{
//			System.out.println( rs.getString(2));
			pp.add( new Person(rs.getInt("id"), rs.getString("lname"), rs.getString("fname"),rs.getInt(4)) );
		}
		return pp;
	}

	// Инициализация из списка в методе 
	public static ArrayList<Person> init()
	{
		ArrayList<Person> pp = new ArrayList<Person>();

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
		pp.add( new Person(39, "Fedor",		"Kirik", 		62) );
		pp.add( new Person(69, "Jin",		"Fusenko",		54) );
		pp.add( new Person(77, "kin",		"Antosjuk", 	36) );
		pp.add( new Person(96, "prutkin",	"Onichenko", 	77) );
		pp.add( new Person(74, "rupki", 	"Mironjuk", 	56) );
		pp.add( new Person(65, "Fupki",  	"Pogodina",		54) );
		pp.add( new Person(19, "zupki",  	"Gadjukov", 	45) );
		pp.add( new Person(39, "Shlupkin",	"Jakovlev", 	66) );
		pp.add( new Person(40, "Fantoci",	"Jakovlev", 	60) );
		pp.add( new Person(99, "Dupkin",	"Cherevatij", 	35) );

		return pp;
	}

	// Все у которых возраст кратен "5" (юбиляры)
	public static void print_5(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе у которых возраст кратен 5 (юбиляры)" );
		for (Person p : pp) 
		{
			if(p.age %5 ==0)
				System.out.println( p );
		}
	}

	// все у кого четные ID
	public static void print_chet_ID(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе у кого четные ID" );
		for (Person p : pp) 
		{
			if(p.id %2 ==0)
				System.out.println( p );
		}
	}

	// у кого в середине фамилии содержится буква "j" "g"
	public static void print_have_J_G(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе у кого в середине фамилии содержится буква j, g" );
		for (Person p : pp) 
		{
			char [] lnameChar = p.lname.toCharArray();
			for(int i=1 ; i < lnameChar.length-1 ; i++ )
			{
				if(lnameChar[i] =='j' || lnameChar[i] =='g' )
					System.out.println( p );
			}
		}
	}

	// все с фамилиями оканчивыающимися на "ko"
	public static void print_last_ko(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе с фамилиями оканчивыающимися на ko" );
		for (Person p : pp) 
		{
			char [] lnameChar = p.lname.toCharArray();
			if(lnameChar[lnameChar.length-2] =='k' && lnameChar[lnameChar.length-1] =='o' )
				System.out.println( p );
		}
	}

	// все у кого 1 буква имени или фамилии является прописной
	public static void print_first_litl(ArrayList<Person> pp)
	{
		System.out.println( "\nВсе у кого 1 буква имени или фамилии является прописной" );
		for (Person p : pp) 
		{
			char lch = p.lname.charAt(0);
			char fch = p.fname.charAt(0);
			if(Character.isLowerCase(lch) || Character.isLowerCase(fch))
				System.out.println( p );
		}
	}

	// длина имени = 6 
	public static void print_lenght_6(ArrayList<Person> pp)
	{
		System.out.println( "\nДлина имени = 6" );
		for (Person p : pp) 
		{
			if(p.fname.length()==6)
				System.out.println( p );
		}
	}

	// отсортировать персоны по возрасту и вывести
	public static void print_age_1_to_100(ArrayList<Person> pp)
	{
		System.out.println( "\nОтсортировать персоны по возрасту и вывести" );
		Person tmp = null;
		for (int i = 0; i < pp.size()-1; i++) 
		{
			for (int j = 0; j < pp.size()-1; j++) 
			{
				if((pp.get(j).age) > (pp.get(j+1).age))
				{
					tmp = pp.get(j);
					pp.set(j, pp.get(j+1));
					pp.set(j+1, tmp);
				}
			}
		}
		for(Person p : pp)
		{
			System.out.println( p );
		}
	}
	// отсортировать персоны по фамилии-имени и вывести AB...YZab...yz
	public static void print_sortByName(ArrayList<Person> pp)
	{
		System.out.println( "\nОтсортировать персоны по фамилии-имени и вывести AB...YZab...yz" );
		Person tmp = null;
		for (int i = 0; i < pp.size()-1; i++) 
		{
			for (int j = 0; j < pp.size()-1; j++) 
			{
				if((pp.get(j).fname.charAt(0)) > (pp.get(j+1).fname.charAt(0)))
				{
					tmp = pp.get(j);
					pp.set(j, pp.get(j+1));
					pp.set(j+1, tmp);
				}
				if((pp.get(j).lname.charAt(2)) > (pp.get(j+1).lname.charAt(2)))
				{
					tmp = pp.get(j);
					pp.set(j, pp.get(j+1));
					pp.set(j+1, tmp);
				}
				if((pp.get(j).lname.charAt(1)) > (pp.get(j+1).lname.charAt(1)))
				{
					tmp = pp.get(j);
					pp.set(j, pp.get(j+1));
					pp.set(j+1, tmp);
				}
				if ((pp.get(j).lname.charAt(0)) > (pp.get(j+1).lname.charAt(0)))
				{
					tmp = pp.get(j);
					pp.set(j, pp.get(j+1));
					pp.set(j+1, tmp);
				}
			}
		}
		for(Person p : pp)
		{
			System.out.println( p );
		}				 		
	}

	// вывести пары персон у которых совпадают фамилии
	public static void print_two_fname(ArrayList<Person> pp)
	{
		System.out.println( "\nВывести пары персон у которых совпадают фамилии" );
		for (Person p1 : pp) 
		{			
			for (Person p2 : pp)
			{
				if(p1.id != p2.id && p1.lname == p2.lname)
					System.out.println( p1 );
			}
		}
	}
}
