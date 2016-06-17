package Lister;
import static org.junit.Assert.*;

import org.junit.Test;

public class AList1Test 
{
	//================================
	// size
	//================================

	@Test
	public void testSize_null() 
	{
		int[] ini = null;
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.size());
	}
	@Test
	public void testSize_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.size());
	}
	@Test
	public void testSize_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(1, rr.size());
	}
	@Test
	public void testSize_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(2, rr.size());
	}
	@Test
	public void testSize_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(6, rr.size());
	}
	//================================
	// toArray
	//================================
	@Test
	public void testToArray_null() 
	{
		int[] ini = null;
		AList1 rr = new AList1();
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		int[] act = rr.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testToArray_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		int[] act = rr.toArray();
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
		AList1 rr = new AList1();
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.clear();
		assertEquals(0, rr.size());
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testClear_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testAddStart_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addStart(99);
		assertEquals(1, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addStart(99);
		assertEquals(2, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addStart(99);
		assertEquals(3, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99,10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testAddEnd_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(1, rr.size());
		int[] act = rr.toArray();
		int[] exp = {99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(2, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addEnd(99);
		assertEquals(3, rr.size());
		int[] act = rr.toArray();
		int[] exp = {10,20,99};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testAddEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testSort_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_2() 
	{
		int[] ini = {30,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.sort();
		int[] act = rr.toArray();
		int[] exp = {20,30};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSort_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testToString_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		String act = rr.toString();
		String exp = "";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		String act = rr.toString();
		String exp = "10";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		String act = rr.toString();
		String exp = "10,20";
		assertEquals(exp, act);
	}
	@Test
	public void testToString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		String act = rr.toString();
		String exp = "10,20,77,11,24,82";
		assertEquals(exp, act);
	}
	//================================
	// min
	//================================
	@Test
	public void testMin_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.min());
	}
	@Test
	public void testMin_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	@Test
	public void testMin_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(11, rr.min());
	}
	@Test
	public void testMin_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(10, rr.min());
	}
	
	//================================
	// max
	//================================
	@Test
	public void testMax_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.max());
	}
	@Test
	public void testMax_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(10, rr.max());
	}
	@Test
	public void testMax_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(77, rr.max());
	}
	@Test
	public void testMax_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(82, rr.max());
	}
	//================================
	// minPos
	//================================
	@Test
	public void testMinPos_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.minPos());
	}
	@Test
	public void testMinPos_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.minPos());
	}
	@Test
	public void testMinPos_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(1, rr.minPos());
	}
	@Test
	public void testMinPos_many() 
	{
		int[] ini = {12,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(3, rr.minPos());
	}
	
	//================================
	// maxPos
	//================================
	@Test
	public void testMaxPos_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void testMaxPos_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void testMaxPos_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(0, rr.maxPos());
	}
	@Test
	public void testMaxPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(5, rr.maxPos());
	}
	
	//================================
	// revers
	//================================
	@Test
	public void testRevers_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.revers();
		int[] act = rr.toArray();
		int[] exp = {11,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testRevers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testhalfRevers_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.halfRevers();
		int[] act = rr.toArray();
		int[] exp = {20,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testhalfRevers_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testGet_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.get(0);
	}
	@Test
	public void testGet_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(10, rr.get(0));
	}
	@Test
	public void testGet_2() 
	{
		int[] ini = {77,11};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(11, rr.get(1));
	}
	@Test
	public void testGet_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		assertEquals(77, rr.get(2));
	}
	//================================
	// set
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void testSet_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.set(0,1);
	}
	@Test
	public void testSet_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.set(0,5);
		int[] act = rr.toArray();
		int[] exp = {5};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSet_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.set(1,33);
		int[] act = rr.toArray();
		int[] exp = {10,33};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testSet_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.set(3,55);
		int[] act = rr.toArray();
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
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addPos(0,100);
		int[] act = rr.toArray();
		int[] exp = {100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addPos(0,100);
		int[] act = rr.toArray();
		int[] exp = {100,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addPos(1,33);
		int[] act = rr.toArray();
		int[] exp = {10,33,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testaddPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.addPos(3,55);
		int[] act = rr.toArray();
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
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delPos(0);
//		int[] act = rr.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delPos(0);
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delPos(1);
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delPos(3);
		int[] act = rr.toArray();
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
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delStart();
//		int[] act = rr.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delStart();
		int[] act = rr.toArray();
		int[] exp = {20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
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
	public void testDelEnd_0() 
	{
		int[] ini = {};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delEnd();
//		int[] act = rr.toArray();
//		int[] exp = {100};
//		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_1() 
	{
		int[] ini = {10};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_2() 
	{
		int[] ini = {10,20};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDelEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		AList1 rr = new AList1();
		rr.init(ini);
		rr.delEnd();
		int[] act = rr.toArray();
		int[] exp = {10,20,77,11,24};
		assertArrayEquals(exp, act);
	}
	
}
