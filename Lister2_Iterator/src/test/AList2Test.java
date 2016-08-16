package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Lister.AList2;

public class AList2Test 
{
	AList2 obj = new AList2();
	
	@Before
	public void start()
	{
		obj.clear();
	}
	
	//================================
	// reSize
	//================================
	public void testReSize_null() 
	{
		int[] ini = null;
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void testReSize_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void testReSize_1() 
	{
		int[] ini = {10,15,16,17,15,55,77,66,88,99,11,22,33,44,55,66,77,18,88};
		obj.init(ini);
		assertEquals(19, obj.size());
		assertEquals(20, obj.sizeAr());
		obj.addPos(7, 88);
		assertEquals(21, obj.size());
		assertEquals(26, obj.sizeAr());
		obj.addPos(15, 99);
		assertEquals(22, obj.size());
		assertEquals(26, obj.sizeAr());
	}
	@Test
	public void testReSize_2() 
	{
		int[] ini = {10,15,16,17,15,55,77,66,88,99,11,22,33,44,55,66,77,18,88};
		obj.init(ini);
		assertEquals(19, obj.size());
		assertEquals(20, obj.sizeAr());
		obj.addStart(88);
		assertEquals(21, obj.size());
		assertEquals(26, obj.sizeAr());
		obj.addStart(99);
		assertEquals(22, obj.size());
		assertEquals(26, obj.sizeAr());
	}
	@Test
	public void testReSize_many() 
	{
		int[] ini = {10,15,16,17,15,55,77,66,88,99,11,22,33,44,55,66,77,18,88};
		obj.init(ini);
		assertEquals(19, obj.size());
		assertEquals(20, obj.sizeAr());
		obj.addEnd(88);
		assertEquals(21, obj.size());
		assertEquals(26, obj.sizeAr());
		obj.addEnd(99);
		assertEquals(22, obj.size());
		assertEquals(26, obj.sizeAr());
	}
	
	
	//================================
	// size
	//================================

	@Test
	public void testSize_null() 
	{
		int[] ini = null;
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void testSize_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void testSize_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(1, obj.size());
	}
	@Test
	public void testSize_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		assertEquals(2, obj.size());
	}
	@Test
	public void testSize_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(6, obj.size());
	}
	//================================
	// toArray
	//================================
	@Test
	public void testToArray_null() 
	{
		int[] ini = null;
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_0() 
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// clear
	//================================
	@Test
	public void testClear_null() 
	{
		int[] ini = null;
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	//================================
	// addStart
	//================================
	@Test
	public void testAddStart_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(1, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(2, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addStart(99);
		assertEquals(7, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99,10,20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// addEnd
	//================================
	@Test
	public void testAddEnd_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(1, obj.size());
		int[] act = obj.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(2, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,20,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addEnd(99);
		assertEquals(7, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,82,99};
		assertArrayEquals(exp, act);
	}
	//================================
	// sort
	//================================
	@Test
	public void testSort_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_2() 
	{
		int[] ini = {30,20};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {20,30};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {10,11,20,24,77,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// toString
	//================================
	@Test
	public void testToString_0() 
	{
		int[] ini = {};
		obj.init(ini);
		String act = obj.toString();
		String exp = "";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10,20";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10,20,77,11,24,82";
		assertEquals(exp, act);
	}
	//================================
	// min
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testMin_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.min());
	}
	@Test
	public void testMin_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.min());
	}
	@Test
	public void testMin_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(11, obj.min());
	}
	@Test
	public void testMin_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(10, obj.min());
	}
	
	//================================
	// max
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testMax_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.max());
	}
	@Test
	public void testMax_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.max());
	}
	@Test
	public void testMax_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(77, obj.max());
	}
	@Test
	public void testMax_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(82, obj.max());
	}
	//================================
	// minPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testMinPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void testMinPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void testMinPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(1, obj.minPos());
	}
	@Test
	public void testMinPos_many() 
	{
		int[] ini = {12,20,77,11,24,82};
		obj.init(ini);
		assertEquals(3, obj.minPos());
	}
	
	//================================
	// maxPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testMaxPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void testMaxPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void testMaxPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void testMaxPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(5, obj.maxPos());
	}
	
	//================================
	// revers
	//================================
	@Test
	public void testRevers_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {11,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {82,24,11,77,20,10};
		assertArrayEquals(exp, act);
	}
	//================================
	// halfRevers
	//================================
	@Test
	public void testhalfRevers_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {20,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {11,24,82,10,20,77};
		assertArrayEquals(exp, act);
	}
	//================================
	// get
	//================================
	@Test (expected=IllegalArgumentException.class)
	public void testGet_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.get(0);
	}
	@Test
	public void testGet_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.get(0));
	}
	@Test
	public void testGet_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(11, obj.get(1));
	}
	@Test
	public void testGet_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(77, obj.get(2));
	}
	//================================
	// set
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testSet_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.set(0,1);
	}
	@Test
	public void testSet_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.set(0,5);
		int[] act = obj.toArray();
		int[] exp = {5};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSet_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.set(1,33);
		int[] act = obj.toArray();
		int[] exp = {10,33};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSet_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.set(3,55);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,55,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// addPos
	//================================
	@Test
	public void testaddPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addPos(0,100);
		int[] act = obj.toArray();
		int[] exp = {100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addPos(0,100);
		int[] act = obj.toArray();
		int[] exp = {100,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addPos(1,33);
		int[] act = obj.toArray();
		int[] exp = {10,33,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addPos(3,55);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,55,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// DelPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testDelPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delPos(0);
//		int[] act = obj.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delPos(0);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.delPos(1);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.delPos(3);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// DelStart
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testDelStart_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delStart();
//		int[] act = obj.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {20,77,11,24,82};
		assertArrayEquals(exp, act);
	}
	//================================
	// DelEnd
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testDelEnd_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delEnd();
//		int[] act = obj.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24};
		assertArrayEquals(exp, act);
	}
	
}
