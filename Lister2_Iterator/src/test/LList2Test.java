package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Lister.LList2;

public class LList2Test 
{
	LList2 obj = new LList2();
	
	@Before
	public void start()
	{
		obj.clear();
	}
	//================================
	// check
	//================================

	@Test
	public void testCheck_null() 
	{
		int[] ini = null;
		obj.init(ini);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_null() 
	{
		int[] ini = null;
		obj.init(ini);
		obj.addStart(55);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addStart(55);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addPos(0, 55);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addPos(1, 55);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addPos(3, 55);
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_del_null() 
	{
		int[] ini = null;
		obj.init(ini);
		obj.addStart(55);
		obj.delStart();
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_del_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addStart(55);
		obj.delStart();
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_del_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addPos(0, 55);
		obj.delStart();
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_del_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addPos(1, 55);
		obj.delEnd();
		assertEquals(true, obj.check());
	}
	@Test
	public void testCheck_add_del_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addPos(3, 55);
		obj.delPos(2);
		assertEquals(true, obj.check());
	}
}


