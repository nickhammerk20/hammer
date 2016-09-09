package blogic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import dal.PersonDAO;
import dal.PersonDAO_Mock;

public class PMain 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		PersonDAO pd = new PersonDAO_Mock();
		
		ArrayList<Person> pp = pd.read();
		
		//Collections.sort(pp);
		Collections.sort(pp, new PersonLnameComp());
		
		print(pp);
//		
//		Person p = new Person();
//
//		p.id = 1112;
//		p.fname = "An";
//		p.lname = "LastName";
//		p.age = 25;
//		
//		update(p);
//	
//		create(p);
//
//		p.id = 11;
//		delete(p);
//		
//		ArrayList<Person> pp = initFromH2();
//		
//		Person p = new Person();
//
//		p.id = 111;
//		p.fname = "An";
//		p.lname = "LastName";
//		p.age = 25;
//		
//		createMySQL(p);
//		p.id = 111;
//		p.age = 45;
//		updateMySQL(p);
//		deleteMySQL(p);
//		
//		ArrayList<Person> pp = initFromMySQL();
//		print( pp );
//		
//		System.out.println( "printPairsWithEqualLNane" );
//		printPairsWithEqualLNane( pp );
//		
//		System.out.println( "printSortedByLNameAndFNane" );
//		printSortedByLNameAndFNane( pp );
//		
//		System.out.println( "printSortedByAge" );
//		printSortedByAge( pp );
//		
//		System.out.println( "printAgeDiv5" );
//		printAgeDiv5( pp );
//		
//		System.out.println( "printEvenId" );
//		printEvenId( pp );
//		
//		System.out.println( "printMidG" );
//		printMidG( pp );
//		
//		System.out.println( "printEndsKO" );
//		printEndsKO( pp );
//		
//		System.out.println( "printSmallFirst" );
//		printSmallFirst( pp );
//		
//		System.out.println( "printLenFname6" );
//		printLenFname6( pp );
	}

	public static void print18_45(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			if(p.age >=18 && p.age <= 45)
				System.out.println( p );
		}
	}

	public static void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}

	public static void printAgeDiv5(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			if(p.age%5 == 0)
				System.out.println( p );
		}
	}

	public static void printEvenId(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			if(p.id%2 == 0)
				System.out.println( p );
		}
	}

	public static void printMidG(ArrayList<Person> pp)
	{
		String str = "";
		int len = 0;
		char c;

		for (Person p : pp) 
		{
			str = p.lname;
			len = str.length();

			for (int i = 1; i < len -1; i++) {
				c = str.charAt(i);
				if (c == 'g') {
					System.out.println( p );
					break;
				}
			}
		}
	}

	public static void printEndsKO(ArrayList<Person> pp)
	{
		String str = "";
		String subStr = "";
		int len = 0;

		for (Person p : pp) 
		{
			str = p.lname;
			len = str.length();
			subStr = str.substring(len -2);

			if (subStr.equals("ko")) {
				System.out.println( p );
			}
		}	
	}

	public static void printSmallFirst(ArrayList<Person> pp)
	{
		String str = "";
		for (Person p : pp) 
		{
			str = p.lname;		
			if ( Character.isLowerCase( str.charAt(0)) ) {
				System.out.println( p );
			}

			str = p.fname;			
			if ( Character.isLowerCase( str.charAt(0)) ) {
				System.out.println( p );
			}
		}
	}

	public static void printLenFname6(ArrayList<Person> pp)
	{
		String str = "";
		int len = 0;

		for (Person p : pp) 
		{
			str = p.fname;
			len = str.length();

			if (len == 6) {
				System.out.println( p );
			}
		}	
	}

	public static void printSortedByAge(ArrayList<Person> pp)
	{
		int len = pp.size();
		int age1 = 0;
		int age2 = 0;
		for (int i = 0; i < len -1; i++)
		{
			for (int j = 0; j < len -1 -i; j++)
			{
				age1 = pp.get(j).age;
				age2 = pp.get(j +1).age;
				if (age1 > age2)
				{
					Collections.rotate(pp.subList(j, j +2), -1);	
				}
			}
		}
		print(pp);
	}
	
	public static void printSortedByLNameAndFNane(ArrayList<Person> pp)
	{
		int len = pp.size();
		for (int i = 0; i < len -1; i++)
		{
			for (int j = 0; j < len -1 -i; j++)
			{
				if (pp.get(j).lname.compareToIgnoreCase(pp.get(j +1).lname) > 0)
				{
					Collections.rotate(pp.subList(j, j +2), -1);	
				}
				else if (pp.get(j).lname.compareToIgnoreCase(pp.get(j +1).lname) == 0 && pp.get(j).fname.compareToIgnoreCase(pp.get(j +1).fname) > 0)
				{
					Collections.rotate(pp.subList(j, j +2), -1);
				}
			}
		}
		print(pp);
	}
	
	public static void printPairsWithEqualLNane(ArrayList<Person> pp)
	{
		int len = pp.size();
		for (int i = 0; i < len -1; i++)
		{
			for (int j = 0; j < len -1 -i; j++)
			{
				if (pp.get(j).lname.compareToIgnoreCase(pp.get(j +1).lname) > 0)
				{
					Collections.rotate(pp.subList(j, j +2), -1);	
				}
			}
		}
	
		for (int i = 0; i < len -1; i++)
		{
			if (pp.get(i).lname.compareToIgnoreCase(pp.get(i +1).lname) == 0)
			{
				System.out.println( pp.get(i) );	
				System.out.println( pp.get(i +1) );
			}
		}
	}
}
