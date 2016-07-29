package test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Lister.EList;
import Lister.LList1;



public class LListTestNG 
{
	EList obj = new LList1();
	
	
	
	@BeforeMethod
	public void start() throws Exception 
	{
		obj.clear();
	}
	

	//================================
	// init
	//================================

	@Test(groups={"init"})
	public void test_init_null() 
	{
		int[] ini = null;
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(groups={"init"})
	public void test_init_0() 
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(groups={"init"})
	public void test_init_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test(groups={"init"})
	public void test_init_2() 
	{
		obj.clear();
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		System.out.println(obj.toString());
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test(groups={"init"})
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
		Assert.assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_0() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.size());
	}
	@Test
	public void test_Size_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		Assert.assertEquals(1, obj.size());
	}
	@Test
	public void test_Size_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		Assert.assertEquals(2, obj.size());
	}
	@Test
	public void test_Size_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		Assert.assertEquals(6, obj.size());
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
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(1, obj.size());
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
		Assert.assertEquals(2, obj.size());
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
		Assert.assertEquals(3, obj.size());
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
		Assert.assertEquals(7, obj.size());
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
		Assert.assertEquals(1, obj.size());
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
		Assert.assertEquals(2, obj.size());
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
		Assert.assertEquals(3, obj.size());
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
		Assert.assertEquals(7, obj.size());
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
		Assert.assertEquals(exp, act);
	}
	@Test
	public void test_ToString_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10";
		Assert.assertEquals(exp, act);
	}
	@Test
	public void test_ToString_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10,20";
		Assert.assertEquals(exp, act);
	}
	@Test
	public void test_ToString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10,20,77,11,24,82";
		Assert.assertEquals(exp, act);
	}
	//================================
	// min
	//================================
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void test_Min_Ex() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.min());
	}
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void test_Min_0() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.min());
	}
	@Test
	public void test_Min_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		Assert.assertEquals(10, obj.min());
	}
	@Test
	public void test_Min_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		Assert.assertEquals(11, obj.min());
	}
	@Test
	public void test_Min_many() 
	{
		int[] ini = {11,20,77,10,24,82};
		obj.init(ini);
		Assert.assertEquals(10, obj.min());
	}

	//================================
	// max
	//================================
	@Test (expectedExceptions=IllegalArgumentException.class)
	public void test_Max_0() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.max());
	}
	@Test
	public void test_Max_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		Assert.assertEquals(10, obj.max());
	}
	@Test
	public void test_Max_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		Assert.assertEquals(77, obj.max());
	}
	@Test
	public void test_Max_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		Assert.assertEquals(82, obj.max());
	}
	//================================
	// minPos
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_MinPos_Ex() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.minPos());
	}
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_MinPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		Assert.assertEquals(0, obj.minPos());
	}
	@Test
	public void test_MinPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		Assert.assertEquals(1, obj.minPos());
	}
	@Test
	public void test_MinPos_many() 
	{
		int[] ini = {12,20,77,11,24,82};
		obj.init(ini);
		Assert.assertEquals(3, obj.minPos());
	}

	//================================
	// maxPos
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_MaxPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		Assert.assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		Assert.assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		Assert.assertEquals(0, obj.maxPos());
	}
	@Test
	public void test_MaxPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		Assert.assertEquals(5, obj.maxPos());
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
	public void test_halfRevers_many() 
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
	@Test (expectedExceptions=IllegalArgumentException.class)
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
		Assert.assertEquals(10, obj.get(0));
	}
	@Test
	public void test_Get_2() 
	{
		int[] ini = {77,11};
		obj.init(ini);
		Assert.assertEquals(11, obj.get(1));
	}
	@Test
	public void test_Get_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		Assert.assertEquals(77, obj.get(2));
	}
	//================================
	// set
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
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
		Assert.assertEquals(1, obj.size());
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
		Assert.assertEquals(2, obj.size());
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_addPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		obj.addPos(1,33);
		Assert.assertEquals(3, obj.size());
		int[] act = obj.toArray();
		int[] exp = {10,33,20};
		Assert.assertEquals(3, obj.size());
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
		Assert.assertEquals(7, obj.size());
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
		Assert.assertEquals(7, obj.size());
		assertArrayEquals(exp, act);
	}
	//================================
	// DelPos
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_DelPos_Expc() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delPos(1);

	}
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void test_DelPos_0() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.delPos(0);
		int[] act = obj.toArray();
		int[] exp = {};
		Assert.assertEquals(0, obj.size());
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
		Assert.assertEquals(0, obj.size());
		assertArrayEquals(exp, act);
		Assert.assertEquals(10, del);
	}
	@Test
	public void test_DelPos_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int del = obj.delPos(1);
		int[] act = obj.toArray();
		int[] exp = {10};
		Assert.assertEquals(1, obj.size());
		assertArrayEquals(exp, act);
		Assert.assertEquals(20, del);
	}
	@Test
	public void test_DelPos_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delPos(3);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,24,82};
		Assert.assertEquals(5, obj.size());
		assertArrayEquals(exp, act);
		Assert.assertEquals(11, del);
	}
	@Test
	public void test_DelPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int del = obj.delPos(5);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,};
		Assert.assertEquals(5, obj.size());
		assertArrayEquals(exp, act);
		Assert.assertEquals(82, del);
	}
	//================================
	// DelStart
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
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
		Assert.assertEquals(10, del);
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
		Assert.assertEquals(10, del);
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
		Assert.assertEquals(10, del);
	}
	//================================
	// DelEnd
	//================================
	@Test(expectedExceptions=IllegalArgumentException.class)
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
		Assert.assertEquals(10, del);
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
		Assert.assertEquals(20, del);
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
		Assert.assertEquals(82, del);
	}

	//================================
	// Iterator
	//================================

	@Test
	public void test_Iterator_0() 
	{
		int[] ini = {};
		obj.init(ini);
		String act = obj.toString();
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			Assert.assertEquals(i.intValue(), ar[j]);
			j++;
		}
		Assert.assertEquals(str, act);
	}
	@Test
	public void test_Iterator_1() 
	{
		int[] ini = {10};
		obj.init(ini);
		String act = obj.toString();
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			Assert.assertEquals(i.intValue(), ar[j]);
			j++;
		}
		Assert.assertEquals(str, act);
	}
	@Test
	public void test_Iterator_2() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		String act = obj.toString();
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			Assert.assertEquals(i.intValue(), ar[j]);
			j++;
		}
		Assert.assertEquals(str, act);
	}
	@Test
	public void test_Iterator_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		String act = obj.toString();
		int [] ar = obj.toArray();
		String str = "";
		int j = 0;
		for(Integer i : obj)
		{
			str +=( i );
			if(j < ar.length-1)
				str += ",";
			Assert.assertEquals(i.intValue(), ar[j]);
			j++;
		}
		Assert.assertEquals(str, act);
	}
	
}
