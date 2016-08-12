package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import blogic.HTableLine;
import blogic.Person;

public class HTableLineTest 
{
	HTableLine obj = new HTableLine();
	Person[] ini_many = {
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
			new Person(51, "boris",		"Tkachuk", 		17),
			};
	Person[] ini_two = {
			new Person(10, "Vasia", 	"Pupkin", 		23),
			new Person(14, "Kasia", 	"Lupkin", 		27),
			};
	Person[] ini_one = {
			new Person(10, "Vasia", 	"Pupkin", 		23),
			};
	Person[] ini_null = {};
	
	@Before
	public void start()
	{
		obj.clear();
	};
	
	
	@Test
	public void test_init_many() 
	{
		obj.init(ini_many);
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person (12, "Volodya", "Kovalevskij", 23),
				new Person (51, "boris", "Tkachuk", 17),
				new Person (17, "Masia", "Gupkin", 19),
				new Person (33, "Gasia", "Hupkin", 56),
				new Person (62, "Anton", "Kobilko", 82),
				new Person (22, "Aleksey", "Abrosimov", 62),
				new Person (60, "Lasia", "Jupkin", 99),
				new Person (34, "Sergey", "Shevchenko", 25),
				new Person (14, "Kasia", "Lupkin", 27),
				new Person (71, "Andrey", "Petrishe", 12),
				new Person (18, "Evgenii", "Lopateckii", 75),
				new Person (10, "Vasia", "Pupkin", 23)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_two() 
	{
		obj.init(ini_two);
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person(14, "Kasia", 	"Lupkin", 		27),
				new Person(10, "Vasia", 	"Pupkin", 		23)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_one() 
	{
		obj.init(ini_one);
		Person[] act = obj.toArray();
		Person[] exp = ini_one;
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_null() 
	{
		obj.init(ini_null);
		Person[] act = obj.toArray();
		Person[] exp = ini_null;
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_del_many() 
	{
		obj.init(ini_many);
		obj.del(new Person (33, "Gasia", "Hupkin", 56));
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person (12, "Volodya", "Kovalevskij", 23),
				new Person (51, "boris", "Tkachuk", 17),
				new Person (17, "Masia", "Gupkin", 19),
				new Person (62, "Anton", "Kobilko", 82),
				new Person (22, "Aleksey", "Abrosimov", 62),
				new Person (60, "Lasia", "Jupkin", 99),
				new Person (34, "Sergey", "Shevchenko", 25),
				new Person (14, "Kasia", "Lupkin", 27),
				new Person (71, "Andrey", "Petrishe", 12),
				new Person (18, "Evgenii", "Lopateckii", 75),
				new Person (10, "Vasia", "Pupkin", 23)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two() 
	{
		obj.init(ini_two);
		obj.del(new Person(14, "Kasia", 	"Lupkin", 		27));
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person(10, "Vasia", 	"Pupkin", 		23)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_one() 
	{
		obj.init(ini_one);
		obj.del(new Person(10, "Vasia", 	"Pupkin", 		23));
		Person[] act = obj.toArray();
		Person[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_del_null() 
	{
		obj.init(ini_null);
		obj.del(new Person(10, "Vasia", 	"Pupkin", 		23));
	}
	
	@Test
	public void test_get_many() 
	{
		obj.init(ini_many);
		assertEquals(11, obj.get(new Person(10, "Vasia", 	"Pupkin", 		23)));
	}
	@Test
	public void test_get_two() 
	{
		obj.init(ini_two);
		assertEquals(11, obj.get(new Person(10, "Vasia", 	"Pupkin", 		23)));
	}
	@Test
	public void test_get_one() 
	{
		obj.init(ini_one);
		assertEquals(11, obj.get(new Person(10, "Vasia", 	"Pupkin", 		23)));
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_get_null() 
	{
		obj.init(ini_null);
		obj.get(new Person(10, "Vasia", 	"Pupkin", 		23));
	}
	
	@Test
	public void test_add_many() 
	{
		obj.init(ini_many);
		obj.add( new Person(66, "Jurii",		"Malyarchuk", 	40) );
		obj.add( new Person(91, "Anna", 		"trembach",		30) );
		obj.add( new Person(74, "Sveta",		"Gavrilenko",	31) );
		obj.add( new Person(86, "nastja",		"Hitraja",		30) );
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person (12, "Volodya", 	"Kovalevskij", 		23),
				new Person (51, "boris", 	"Tkachuk", 			17),
				new Person (17, "Masia", 	"Gupkin", 			19),
				new Person (33, "Gasia", 	"Hupkin", 			56),
				new Person (62, "Anton", 	"Kobilko", 			82),
				new Person (22, "Aleksey", 	"Abrosimov", 		62),
				new Person (60, "Lasia", 	"Jupkin", 			99),
				new Person (34, "Sergey", 	"Shevchenko", 		25),
				new Person (14, "Kasia", 	"Lupkin", 			27),
				new Person (71, "Andrey", 	"Petrishe", 		12),
				new Person (18, "Evgenii", 	"Lopateckii",		75),
				new Person (10, "Vasia", 	"Pupkin", 			23),
				new Person(66, "Jurii",		"Malyarchuk", 		40),
				new Person(91, "Anna", 		"trembach",			30),
				new Person(74, "Sveta",		"Gavrilenko",		31),
				new Person(86, "nastja",	"Hitraja",			30)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_two() 
	{
		obj.init(ini_two);
		obj.add( new Person(86, "nastja",		"Hitraja",		30) );
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person(14, "Kasia", 		"Lupkin", 		27),
				new Person(10, "Vasia", 		"Pupkin", 		23),
				new Person(86, "nastja",		"Hitraja",		30)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_one() 
	{
		obj.init(ini_one);
		obj.add( new Person(86, "nastja",		"Hitraja",		30) );
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person(10, "Vasia", 		"Pupkin", 		23),
				new Person(86, "nastja",		"Hitraja",		30)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_null_person() 
	{
		obj.init(ini_null);
		obj.add( new Person(86, "nastja",		"Hitraja",		30) );
		Person[] act = obj.toArray();
		Person[] exp = {
				new Person(86, "nastja",		"Hitraja",		30)
				};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_null_null() 
	{
		obj.init(ini_null);
		obj.add( new Person() );
		Person[] act = obj.toArray();
		Person[] exp = ini_null;
		assertArrayEquals(exp, act);
	}
	
	
	@Test
	public void test_clear_many() 
	{
		obj.init(ini_many);
		obj.clear();
		int exp = obj.size();
		assertEquals(exp, 0);
	}
	@Test
	public void test_clear_two() 
	{
		obj.init(ini_two);
		obj.clear();
		int exp = obj.size();
		assertEquals(exp, 0);
	}
	@Test
	public void test_clear_one() 
	{
		obj.init(ini_one);
		obj.clear();
		int exp = obj.size();
		assertEquals(exp, 0);
	}
	@Test
	public void test_clear_null() 
	{
		obj.init(ini_null);
		obj.clear();
		int exp = obj.size();
		assertEquals(exp, 0);
	}
	
	
	@Test
	public void test_size_many() 
	{
		obj.init(ini_many);
		int exp = obj.size();
		int act = 12;
		assertEquals(exp, act);
	}
	@Test
	public void test_size_two() 
	{
		obj.init(ini_two);
		int exp = obj.size();
		int act = 2;
		assertEquals(exp, act);
	}
	@Test
	public void test_size_one() 
	{
		obj.init(ini_one);
		int exp = obj.size();
		int act = 1;
		assertEquals(exp, act);
	}
	@Test
	public void test_size_null() 
	{
		obj.init(ini_null);
		int exp = obj.size();
		int act = 0;
		assertEquals(exp, act);
	}
	
	@Test
	public void test_pow_many() 
	{
		obj.init(ini_many);
		double exp = obj.pow();
		double act = 12.37;
		assertEquals(exp, act, 0.01);
	}
	@Test
	public void test_pow_two() 
	{
		obj.init(ini_two);
		double exp = obj.size();
		double act = 2;
		assertEquals(exp, act, 0.01);
	}
	@Test
	public void test_pow_one() 
	{
		obj.init(ini_one);
		double exp = obj.pow();
		double act = 1.03;
		assertEquals(exp, act, 0.01);
	}
	@Test
	public void test_pow_null() 
	{
		obj.init(ini_null);
		double exp = obj.pow();
		double act = 0;
		assertEquals(exp, act, 0.01);
	}
}
