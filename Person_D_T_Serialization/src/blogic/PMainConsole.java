package blogic;

import java.sql.SQLException;
import java.util.ArrayList;

import dal.PersonDAO;
import dal.PersonDAO_H2;
import dal.PersonDAO_Mock;
import dal.PersonDAO_MySQL;

public class PMainConsole 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
//		PersonDAO pd = new PersonDAO_Mock();
		PersonDAO pd = new PersonDAO_MySQL();
//		PersonDAO pd = new PersonDAO_H2();
		ArrayList<Person> pp = pd.read();

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
