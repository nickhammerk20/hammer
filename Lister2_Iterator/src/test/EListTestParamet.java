package test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Lister.AList0;
import Lister.AList1;
import Lister.AList2;
import Lister.AList3_MonoIterator;
import Lister.EList;
import Lister.LList1;
import Lister.LList2;

@RunWith(Parameterized.class)
public class EListTestParamet 
{
	EList obj = null;

	@Parameters
	public static Collection<Object[]> Elist()
	{
		return Arrays.asList(new Object[][]
				{
			{ new AList0()},
			{ new AList1()}, 
			{ new AList2()},
			{ new AList3_MonoIterator()},
			{ new LList1()},
			{ new LList2()}
				});
	}

	public EListTestParamet(EList Paramet) 
	{
		obj = Paramet;
	}

	@Before
	public void start()
	{
		obj.clear();
	}

	//================================
	// init
	//================================

	@Test
	public void test_init_null() 
	{
		int[] ini = null;
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_0() 
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int[] act = obj.toArray();
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
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(1, obj.size());
	}
	@Test
	public void test_Size_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		assertEquals(2, obj.size());
	}
	@Test
	public void test_Size_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(6, obj.size());
	}
	//================================
	// toArray
	//================================
	@Test
	public void test_toArray_null() 
	{
		int[] ini = null;
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_0() 
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_many() 
	{
		int[] ini = {10,20,77,11,24,82,44};
		obj.init(ini);
		int[] act = obj.toArray();
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
		obj.init(ini);
		obj.clear();
		assertEquals(0, obj.size());
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Clear_0() 
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
	public void test_Clear_1() 
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
	public void test_Clear_2() 
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
	public void test_Clear_many() 
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
	public void test_AddStart_0() 
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
	public void test_AddStart_1() 
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
	public void test_AddStart_2() 
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
	public void test_AddStart_many() 
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
	public void test_AddEnd_0() 
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
	public void test_AddEnd_1() 
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
	public void test_AddEnd_2() 
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
	public void test_AddEnd_many() 
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
	public void test_Sort_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_2() 
	{
		int[] ini = {30,20};
		obj.init(ini);
		obj.sort();
		int[] act = obj.toArray();
		int[] exp = {20,30};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Sort_many() 
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
	public void test_ToString_0() 
	{
		int[] ini = {};
		obj.init(ini);
		String act = obj.toString();
		String exp = "";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10,20";
		assertEquals(exp, act);
	}
	@Test
	public void test_ToString_many() 
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
	public void test_Min_Ex() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.min());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_Min_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.min());
	}
	@Test
	public void test_Min_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.min());
	}
	@Test
	public void test_Min_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(11, obj.min());
	}
	@Test
	public void test_Min_many() 
	{
		int[] ini = {11,20,77,10,24,82};
		obj.init(ini);
		assertEquals(10, obj.min());
	}

	//================================
	// max
	//================================
	@Test (expected=IllegalArgumentException.class)
	public void test_Max_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.max());
	}
	@Test
	public void test_Max_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.max());
	}
	@Test
	public void test_Max_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(77, obj.max());
	}
	@Test
	public void test_Max_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(82, obj.max());
	}
	//================================
	// minPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MinPos_Ex() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_MinPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(1, obj.minPos());
	}
	@Test
	public void test_MinPos_many() 
	{
		int[] ini = {12,20,77,11,24,82};
		obj.init(ini);
		assertEquals(3, obj.minPos());
	}

	//================================
	// maxPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_MaxPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(5, obj.maxPos());
	}

	//================================
	// revers
	//================================
	@Test
	public void test_Revers_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		obj.revers();
		int[] act = obj.toArray();
		int[] exp = {11,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Revers_many() 
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
	public void test_halfRevers_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {20,10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_many1() 
	{
		int[] ini = {10,20,77,11,24,82,33};
		obj.init(ini);
		obj.halfRevers();
		int[] act = obj.toArray();
		int[] exp = {24,82,33,11,10,20,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_halfRevers_many2() 
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
	public void test_Get_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.get(0);
	}
	@Test
	public void test_Get_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(10, obj.get(0));
	}
	@Test
	public void test_Get_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		assertEquals(11, obj.get(1));
	}
	@Test
	public void test_Get_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(77, obj.get(2));
	}
	//================================
	// set
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_Set_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.set(0,1);
	}
	@Test
	public void test_Set_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.set(0,5);
		int[] act = obj.toArray();
		int[] exp = {5};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Set_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.set(1,33);
		int[] act = obj.toArray();
		int[] exp = {10,33};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_Set_many() 
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
	/**	@Test(expected=IllegalArgumentException.class)
		public void test_addPos_Except() 
		{
			int[] ini = {};
			obj.init(ini);
			obj.addPos(2,100);
		}**/
	@Test
	public void test_addPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.addPos(0,100);
		int[] act = obj.toArray();
		int[] exp = {100};
		assertEquals(1, obj.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		obj.addPos(0,100);
		int[] act = obj.toArray();
		int[] exp = {100,10};
		assertEquals(2, obj.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addPos(1,33);
		assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,33,20};
		assertEquals(3, obj.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addPos(3,55);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,55,11,24,82};
		assertEquals(7, obj.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.addPos(5,55);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,55,82};
		assertEquals(7, obj.size());
		assertArrayEquals(exp, act);
	}
	//================================
	// DelPos
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_Expc() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delPos(1);

	}
	@Test(expected=IllegalArgumentException.class)
	public void test_DelPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delPos(0);
		int[] act = obj.toArray();
		int[] exp = {};
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);

	}
	@Test
	public void test_DelPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int del = obj.delPos(0);
		int[] act = obj.toArray();
		int[] exp = {};
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);
		assertEquals(10, del);
	}
	@Test
	public void test_DelPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int del = obj.delPos(1);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertEquals(1, obj.size());
		assertArrayEquals(exp, act);
		assertEquals(20, del);
	}
	@Test
	public void test_DelPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delPos(3);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,24,82};
		assertEquals(5, obj.size());
		assertArrayEquals(exp, act);
		assertEquals(11, del);
	}
	@Test
	public void test_DelPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delPos(5);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,};
		assertEquals(5, obj.size());
		assertArrayEquals(exp, act);
		assertEquals(82, del);
	}
	//================================
	// DelStart
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelStart_0() 
	{
		int[] ini = {};

		obj.init(ini);
		obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelStart_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int del = obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
		assertEquals(10, del);
	}
	@Test
	public void test_DelStart_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int del = obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {20};
		assertArrayEquals(exp, act);
		assertEquals(10, del);
	}
	@Test
	public void test_DelStart_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delStart();
		int[] act = obj.toArray();
		int[] exp = {20,77,11,24,82};
		assertArrayEquals(exp, act);
		assertEquals(10, del);
	}
	//================================
	// DelEnd
	//================================
	@Test(expected=IllegalArgumentException.class)
	public void test_DelEnd_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_DelEnd_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int del = obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
		assertEquals(10, del);
	}
	@Test
	public void test_DelEnd_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int del = obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
		assertEquals(20, del);
	}
	@Test
	public void test_DelEnd_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delEnd();
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24};
		assertArrayEquals(exp, act);
		assertEquals(82, del);
	}

	//================================
	// Iterator
	//================================
	/** принцип тестов итератора для ХЛистов:
			- инициализируешь объект хЛиста
			- пройтись по объекту с помощью for each
		варианты проверки:
			- сравнивать поэлементно внутри for each
			- загнать все элементы из хЛиста во временный массив, сравнить массивы **/

	@Test
	public void test_Iterator_0() 
	{
		int[] ini = {};
//		String exp = "";
		obj.init(ini);
		String act = obj.toString();
//		assertEquals(exp, act);
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_1() 
	{
		int[] ini = {10};
//		String exp = "10";
		obj.init(ini);
		String act = obj.toString();
//		assertEquals(exp, act);
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_2() 
	{
		int[] ini = {10,20};
//		String exp = "10,20";
		obj.init(ini);
		String act = obj.toString();
//		assertEquals(exp, act);
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
	
	@Test
	public void test_Iterator_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int [] ar = obj.toArray();
		String act = obj.toString();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
	}
}


