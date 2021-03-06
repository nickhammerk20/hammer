﻿package Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Task.GList;
import Task.GList1;
import Task.Person;

@RunWith(Parameterized.class)
public class GListTest
{
	GList<Person> obj = null;

	@Parameters
	public static Collection<Object[]> GList()
	{
		return Arrays.asList(new Object[][]
				{
			{ new GList1<Person>()},
			//			{ new AList1()}, 
				});
	}

	public GListTest(GList<Person> Paramet) 
	{
		obj = Paramet;
	}

	@Before
	public void start()
	{
		obj.clear();
	}

	//================================
	// init  ++
	//================================

	@Test
	public void test_init_null() 
	{
		Person[] ini = null;
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_init_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_init_1() 
	{
		Person[] ini = {
				new Person(14, "Kasia", 	"Lupkin", 		27)}; 
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_init_2() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27)}; 
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_init_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}

	//================================
	// size  ++
	//================================

	@Test
	public void test_Size_null() 
	{
		Person[] ini = null;
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(1, obj.size());
	}
	@Test
	public void test_Size_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(2, obj.size());
	}
	@Test
	public void test_Size_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(12, obj.size());
	}
	//================================
	// toArray  ++
	//================================
	@Test
	public void test_toArray_null() 
	{
		Person[] ini = null;
		Person[] ini2 = {};
		obj.init(ini);
		Person[] objArr = new Person [obj.size()];
		int j = 0;
		for(Person i : obj)
		{
			objArr[j] = i;
			j++;			
		}
		assertArrayEquals(objArr, ini2);
	}
	@Test
	public void test_toArray_0() 
	{
		Person[] ini = {		
		};
		obj.init(ini);
		Person[] objArr = new Person [obj.size()];
		int j = 0;
		for(Person i : obj)
		{
			objArr[j] = i;
			j++;			
		}
		assertArrayEquals(objArr, ini);
	}
	@Test
	public void test_toArray_1() 
	{
		Person[] ini = {			
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		Person[] objArr = new Person [obj.size()];
		int j = 0;
		for(Person i : obj)
		{
			objArr[j] = i;
			j++;			
		}
		assertArrayEquals(objArr, ini);
	}
	@Test
	public void test_toArray_2() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),				
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		Person[] objArr = new Person [obj.size()];
		int j = 0;
		for(Person i : obj)
		{
			objArr[j] = i;
			j++;			
		}
		assertArrayEquals(objArr, ini);
	}
	@Test
	public void test_toArray_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		Person[] objArr = new Person [obj.size()];
		int j = 0;
		for(Person i : obj)
		{
			objArr[j] = i;
			j++;			
		}
		assertArrayEquals(objArr, ini);
	}
	//================================
	// clear  ++
	//================================
	@Test
	public void test_Clear_null() 
	{
		Person[] ini = null;
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Clear_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Clear_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Clear_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Clear_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
	}
	//================================
	// addStart  ++
	//================================
	@Test
	public void test_AddStart_0() 
	{
		Person[] ini = {
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23),
		};
		obj.init(ini);
		obj.addStart(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddStart_1() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(10, "Vasia", 	"Pupkin", 		23),
		};
		obj.init(ini);
		obj.addStart(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddStart_2() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
		};
		obj.init(ini);
		obj.addStart(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddStart_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99)
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99)
		};
		obj.init(ini);
		obj.addStart(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	//================================
	// addEnd  ++
	//================================
	@Test
	public void test_AddEnd_0() 
	{
		Person[] ini = {
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23)};
		obj.init(ini);
		obj.addEnd(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddEnd_1() 
	{
		Person[] ini = {
				new Person(60, "Lasia", 	"Jupkin", 		99)};
		Person[] ini2 = {
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23)};
		obj.init(ini);
		obj.addEnd(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddEnd_2() 
	{
		Person[] ini = {
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99)};
		Person[] ini2 = {
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23)};
		obj.init(ini);
		obj.addEnd(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_AddEnd_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99)};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23)};
		obj.init(ini);
		obj.addEnd(new Person(12, "Volodya",	"Kovalevskij", 	23));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	//================================
	// sort  ++
	//================================
	@Test
	public void test_Sort_0() 
	{
		Person[] ini = {					
		};
		Person[] ini2 = {				
		};
		obj.init(ini);
		obj.sort();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Sort_1() 
	{
		Person[] ini = {
				new Person(33, "Gasia", 	"Hupkin", 		56)						
		};
		Person[] ini2 = {				
				new Person(33, "Gasia", 	"Hupkin", 		56)
		};
		obj.init(ini);
		obj.sort();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Sort_2() 
	{
		Person[] ini = {
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56)						
		};
		Person[] ini2 = {				
				new Person(33, "Gasia", 	"Hupkin", 		56),				
				new Person(88, "Masia",		"Gupkin",		19)
		};
		obj.init(ini);
		obj.sort();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Sort_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(88, "Masia",		"Gupkin",		19)
		};
		obj.init(ini);
		obj.sort();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	//================================
	// toString  ++
	//================================
	@Test
	public void test_ToString_0() 
	{
		Person[] ini = {		
		};
		obj.init(ini);
		String objStr = obj.toString();
		int j = 0;
		String expIter = "";
		for(Person i : obj)
		{
			expIter +=( i );
			if(j < obj.size()-1)
				expIter += ",";
			j++;			
		}
		assertEquals(expIter, objStr);			
	}
	@Test
	public void test_ToString_1() 
	{
		Person[] ini = {
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		String objStr = obj.toString();
		int j = 0;
		String expIter = "";
		for(Person i : obj)
		{
			expIter +=( i );
			if(j < obj.size()-1)
				expIter += ",";
			j++;			
		}
		assertEquals(expIter, objStr);			
	}
	@Test
	public void test_ToString_2() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		String objStr = obj.toString();
		int j = 0;
		String expIter = "";
		for(Person i : obj)
		{
			expIter +=( i );
			if(j < obj.size()-1)
				expIter += ",";
			j++;			
		}
		assertEquals(expIter, objStr);			
	}
	@Test
	public void test_ToString_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12)				
		};
		obj.init(ini);
		String objStr = obj.toString();
		int j = 0;
		String expIter = "";
		for(Person i : obj)
		{
			expIter +=( i );
			if(j < obj.size()-1)
				expIter += ",";
			j++;			
		}
		assertEquals(expIter, objStr);				
	}
	//================================
	// min  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Min_Ex() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.min());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_Min_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.min());
	}
	@Test
	public void test_Min_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[0], obj.min());
	}
	@Test
	public void test_Min_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[1], obj.min());
	}
	@Test
	public void test_Min_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[0], obj.min());
	}

	//================================
	// max  ++
	//================================
	@Test (expected=IllegalArgumentException.class)
	public void test_Max_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.max());
	}
	@Test
	public void test_Max_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[0], obj.max());
	}
	@Test
	public void test_Max_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[0], obj.max());
	}
	@Test
	public void test_Max_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[5], obj.max());
	}
	//================================
	// minPos  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MinPos_Ex() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_MinPos_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(1, obj.minPos());
	}
	@Test
	public void test_MinPos_many() 
	{
		Person[] ini = {
				new Person(88, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(17, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(6, obj.minPos());
	}

	//================================
	// maxPos  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MaxPos_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(2, obj.maxPos());
	}

	//================================
	// revers  ++
	//================================
	@Test
	public void test_Revers_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		obj.revers();
		int j = obj.size();
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j--;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Revers_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.revers();
		int j = obj.size()-1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j--;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Revers_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.revers();
		int j = obj.size()-1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j--;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Revers_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		int j = obj.size();
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j--;
		}
		assertEquals(exp, 0);
	}
	//================================
	// halfRevers  ++
	//================================
	@Test
	public void test_halfRevers_0() 
	{
		Person[] ini = {
		};
		Person[] ini2 = {			
		};
		obj.init(ini);
		obj.halfRevers();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_halfRevers_1() 
	{
		Person[] ini = {
				new Person(34, "Sergey",	"Shevchenko", 	25)
		};
		Person[] ini2 = {
				new Person(34, "Sergey",	"Shevchenko", 	25)				
		};
		obj.init(ini);
		obj.halfRevers();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_halfRevers_2() 
	{
		Person[] ini = {
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(34, "Sergey",	"Shevchenko", 	25)
		};
		Person[] ini2 = {
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(14, "Kasia", 	"Lupkin", 		27)
		};
		obj.init(ini);
		obj.halfRevers();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_halfRevers_many1() 
	{
		Person[] ini = {
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25)
		};
		Person[] ini2 = {
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56)
		};
		obj.init(ini);
		obj.halfRevers();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_halfRevers_many2() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)
		};
		Person[] ini2 = {
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
		};
		obj.init(ini);
		obj.halfRevers();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	//================================
	// get  ++
	//================================
	@Test (expected=IllegalArgumentException.class)
	public void test_Get_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		obj.get(0);
	}
	@Test
	public void test_Get_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[0], obj.get(0));
	}
	@Test
	public void test_Get_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[1], obj.get(1));
	}
	@Test
	public void test_Get_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		assertEquals(ini[2], obj.get(2));
	}
	//================================
	// set  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Set_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		obj.set(0,new Person(10, "Vasia", 	"Pupkin", 		23));
	}
	@Test
	public void test_Set_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.set(0,new Person(10, "Vasia", 	"Pupkin", 		23));
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),};
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Set_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.set(1,new Person(10, "Vasia", 	"Pupkin", 		23));
		Person[] ini2 = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(10, "Vasia", 	"Pupkin", 		23),};
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);

	}
	@Test
	public void test_Set_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		obj.init(ini);
		obj.set(3,new Person(11, "Vasia", 	"Pupkin", 		23));
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(11, "Vasia", 	"Pupkin", 		23),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17),};
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);

	}
	//================================
	// addPos  ++
	//================================

	@Test
	public void test_addPos_0() 
	{
		Person[] ini = {};
		Person[] ini2 = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		obj.addPos(0, new Person(51, "boris",		"Tkachuk", 		17));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_addPos_1() 
	{
		Person[] ini = {
				new Person(18, "Evgenii",	"Lopateckii", 	75)};
		Person[] ini2 = {
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		obj.addPos(1, new Person(51, "boris",		"Tkachuk", 		17));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_addPos_2() 
	{
		Person[] ini = {
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82)};
		Person[] ini2 = {
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(51, "boris",		"Tkachuk", 		17),
				new Person(62, "Anton",		"Kobilko", 		82)};
		obj.init(ini);
		obj.addPos(1, new Person(51, "boris",		"Tkachuk", 		17));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_addPos_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82)};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		obj.addPos(3, new Person(33, "Gasia", 	"Hupkin", 		56));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_addPos_many_end() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82)};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		obj.addPos(4, new Person(51, "boris",		"Tkachuk", 		17));
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	//================================
	// DelPos  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_Expc() 
	{
		Person[] ini = {};
		obj.init(ini);
		obj.delPos(1);

	}
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_0() 
	{
		Person[] ini = {};
		Person[] ini2 = {};
		obj.init(ini);
		Person del = obj.delPos(1);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);

	}
	@Test
	public void test_DelPos_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		Person[] ini2 = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delPos(0);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);
	}
	@Test
	public void test_DelPos_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		Person[] ini2 = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delPos(1);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[1], del);
	}
	@Test
	public void test_DelPos_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delPos(5);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[5], del);
	}
	@Test
	public void test_DelPos_many_end() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)
				};
		Person[] ini2 = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
//				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)
				};
		obj.init(ini);
		Person del = obj.delPos(4);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini2[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[4], del);
	}
	//================================
	// DelStart  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelStart_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		Person del = obj.delStart();
		int j = 1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);
	}
	@Test
	public void test_DelStart_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delStart();
		int j = 1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);
	}
	@Test
	public void test_DelStart_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delStart();
		int j = 1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);
	}
	@Test
	public void test_DelStart_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delStart();
		int j = 1;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[0], del);
	}
	//================================
	// DelEnd  ++
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelEnd_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		Person del = obj.delEnd();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[obj.size()], del);
	}
	@Test
	public void test_DelEnd_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delEnd();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[obj.size()], del);
	}
	@Test
	public void test_DelEnd_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delEnd();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[obj.size()], del);
	}
	@Test
	public void test_DelEnd_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		Person del = obj.delEnd();
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
		assertEquals(ini[obj.size()], del);
	}

	//================================
	// Iterator  ++
	//================================
	
	@Test
	public void test_Iterator_0() 
	{
		Person[] ini = {};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Iterator_1() 
	{
		Person[] ini = {
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Iterator_2() 
	{
		Person[] ini = {
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
	@Test
	public void test_Iterator_many() 
	{
		Person[] ini = {
				new Person(10, "Vasia", 	"Pupkin", 		23),
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(88, "Masia",		"Gupkin",		19),
				new Person(33, "Gasia", 	"Hupkin", 		56),
				new Person(60, "Lasia", 	"Jupkin", 		99),
				new Person(71, "Andrey",	"Petrishe",  	12),
				new Person(12, "Volodya",	"Kovalevskij", 	23),
				new Person(34, "Sergey",	"Shevchenko", 	25),
				new Person(22, "Aleksey",	"Abrosimov", 	62),
				new Person(18, "Evgenii",	"Lopateckii", 	75),
				new Person(62, "Anton",		"Kobilko", 		82),
				new Person(51, "boris",		"Tkachuk", 		17)};
		obj.init(ini);
		int j = 0;
		int exp = 0;
		for(Person i : obj)
		{
			if( 0 != i.compareTo(ini[j]) )
			{
				exp += 1;
			};
			j++;
		}
		assertEquals(exp, 0);
	}
}


