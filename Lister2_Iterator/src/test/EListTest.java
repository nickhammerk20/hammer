package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Lister.AList2;
import Lister.EList;
import Lister.LList2;

public class EListTest 
{
	
	//EList rr = new AList0();
	//EList rr = new AList1();
	EList rr = new AList2();
//	EList rr = new LList2();
	
	@Before
	public void setUp()
	{
		rr.clear();
	}
	
	//================================
	// init
	//================================

	@Test
	public void test_init_null() 
	{
		int[] ini = null;
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_0() 
	{
		int[] ini = {};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_many() 
		{
			int[] ini = {10,20,77,11,24,82};
			rr.init(ini);
			int[] act = rr.toArray();
			int[] exp = {10,20,77,11,24,82};
			assertArrayEquals(exp, act);
		}
	
	//================================
	// size
	//================================

	@Test
	public void test_Size_null() 
	{
		int[] ini = null;
		rr.init(ini);
		assertEquals(0, rr.size());
	}
	@Test
	public void test_Size_0() 
	{
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.size());
	}
	@Test
	public void test_Size_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(1, rr.size());
	}
	@Test
	public void test_Size_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		assertEquals(2, rr.size());
	}
	@Test
	public void test_Size_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		assertEquals(6, rr.size());
	}
	//================================
	// toArray
	//================================
	@Test
	public void test_toArray_null() 
	{
		int[] ini = null;
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_0() 
	{
		int[] ini = {};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_many() 
	{
		int[] ini = {10,20,77,11,24,82,44};
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24,82,44};
		assertArrayEquals(exp, act);
	}
	//================================
	// clear
	//================================
	@Test
	public void test_Clear_null() 
	{
		int[] ini = null;
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Clear_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Clear_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Clear_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Clear_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	//================================
	// addStart
	//================================
	@Test
	public void test_AddStart_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(1, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddStart_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(2, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddStart_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(3, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99,10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.addStart(99);
		assertEquals(7, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99,10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// addEnd
	//================================
	@Test
	public void test_AddEnd_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(1, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddEnd_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(2, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddEnd_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(3, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,20,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_AddEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(7, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24,82,99};
		assertArrayEquals(exp, act);
	}
	//================================
	// sort
	//================================
	@Test
	public void test_Sort_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_2() 
	{
		int[] ini = {30,20};
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {20,30};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {10,11,20,24,77,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// toString
	//================================
	@Test
	public void test_ToString_0() 
	{
		int[] ini = {};
		rr.init(ini);
		String act = rr.toString();
		String exp = "";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		String act = rr.toString();
		String exp = "10";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		String act = rr.toString();
		String exp = "10,20";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		String act = rr.toString();
		String exp = "10,20,77,11,24,82";
		assertEquals(exp, act);
	}
	//================================
	// min
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Min_0() 
	{
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.min());
	}
	@Test
	public void test_Min_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	@Test
	public void test_Min_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		assertEquals(11, rr.min());
	}
	@Test
	public void test_Min_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	
	//================================
	// max
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Max_0() 
	{
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.max());
	}
	@Test
	public void test_Max_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.max());
	}
	@Test
	public void test_Max_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		assertEquals(77, rr.max());
	}
	@Test
	public void test_Max_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		assertEquals(82, rr.max());
	}
	//================================
	// minPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MinPos_0() 
	{
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.minPos());
	}
	@Test
	public void test_MinPos_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(0, rr.minPos());
	}
	@Test
	public void test_MinPos_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		assertEquals(1, rr.minPos());
	}
	@Test
	public void test_MinPos_many() 
	{
		int[] ini = {12,20,77,11,24,82};
		rr.init(ini);
		assertEquals(3, rr.minPos());
	}
	
	//================================
	// maxPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MaxPos_0() 
	{
		int[] ini = {};
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void test_MaxPos_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void test_MaxPos_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void test_MaxPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		assertEquals(5, rr.maxPos());
	}
	
	//================================
	// revers
	//================================
	@Test
	public void test_Revers_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {11,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {82,24,11,77,20,10};
		assertArrayEquals(exp, act);
	}
	//================================
	// halfRevers
	//================================
	@Test
	public void test_halfRevers_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {20,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {11,24,82,10,20,77};
		assertArrayEquals(exp, act);
	}
	//================================
	// get
	//================================
	@Test (expected=IllegalArgumentException.class)
	public void test_Get_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.get(0);
	}
	@Test
	public void test_Get_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		assertEquals(10, rr.get(0));
	}
	@Test
	public void test_Get_2() 
	{
		int[] ini = {77,11};
		rr.init(ini);
		assertEquals(11, rr.get(1));
	}
	@Test
	public void test_Get_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		assertEquals(77, rr.get(2));
	}
	//================================
	// set
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Set_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.set(0,1);
	}
	@Test
	public void test_Set_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.set(0,5);
		int[] act = rr.toArray();
		int[] exp = {5};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Set_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.set(1,33);
		int[] act = rr.toArray();
		int[] exp = {10,33};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Set_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.set(3,55);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,55,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// addPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_addPos_Except() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.addPos(2,100);
	}
	@Test
	public void test_addPos_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.addPos(0,100);
		int[] act = rr.toArray();
		int[] exp = {100};
		assertEquals(1, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.addPos(0,100);
		int[] act = rr.toArray();
		int[] exp = {100,10};
		assertEquals(2, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.addPos(1,33);
		assertEquals(3, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,33,20};
		assertEquals(3, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.addPos(3,55);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,55,11,24,82};
		assertEquals(7, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.addPos(5,55);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24,55,82};
		assertEquals(7, rr.size());
		assertArrayEquals(exp, act);
	}
	//================================
	// DelPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_Expc() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.delPos(1);
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.delPos(0);
		int[] act = rr.toArray();
		int[] exp = {};
		assertEquals(0, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelPos_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.delPos(0);
		int[] act = rr.toArray();
		int[] exp = {};
		assertEquals(0, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelPos_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.delPos(1);
		int[] act = rr.toArray();
		int[] exp = {10};
		assertEquals(1, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.delPos(3);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,24,82};
		assertEquals(5, rr.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.delPos(5);
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24,};
		assertEquals(5, rr.size());
		assertArrayEquals(exp, act);
	}
	//================================
	// DelStart
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelStart_0() 
	{
		int[] ini = {};
		
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelStart_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelStart_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// DelEnd
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelEnd_0() 
	{
		int[] ini = {};
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelEnd_1() 
	{
		int[] ini = {10};
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelEnd_2() 
	{
		int[] ini = {10,20};
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24};
		assertArrayEquals(exp, act);
	}
	
}


