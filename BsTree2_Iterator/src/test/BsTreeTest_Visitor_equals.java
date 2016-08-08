package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import BsTree.BsTree;
import BsTree.BsTree1_Rotation;
import BsTree.BsTree2_Visitor;
import BsTree.BsTree3_Linked;
import BsTree.EBsTree;

public class BsTreeTest_Visitor_equals 
{
	/**для теста equals() нужно два объекта*/
	BsTree2_Visitor obj = new BsTree2_Visitor();
	BsTree2_Visitor obj2 = new BsTree2_Visitor();

	@Before
	public void start()
	{
		obj.clear();
		obj2.clear();
	}

	//==================================//
	// toString							//
	//==================================//
	@Test
	public void test_toString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10, 11, 20, 24, 77, 82, ";
		assertEquals(exp, act);
	}
	@Test
	public void test_toString_two() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10, 20, ";
		assertEquals(exp, act);
	}
	@Test
	public void test_toString_one() 
	{
		int[] ini = {10};
		obj.init(ini);
		String act = obj.toString();
		String exp = "10, ";
		assertEquals(exp, act);
	}
	@Test
	public void test_toString_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		String act = obj.toString();
		String exp = "";
		assertEquals(exp, act);
	}
	//==================================//
	// toArray							//
	//==================================//
	@Test
	public void test_toArray_many1() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int [] act = obj.toArray();
		int []  exp = {10, 11, 20, 24, 77, 82};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_many2() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		int [] act = obj.toArray();
		int []  exp = {11,20,22,24,25,30,40,43,45,50,60,75,77,100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_two() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int [] act = obj.toArray();
		int []  exp = {10, 20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_one() 
	{
		int[] ini = {10};
		obj.init(ini);
		int [] act = obj.toArray();
		int [] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_toArray_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		int [] act = obj.toArray();
		int [] exp = {};
		assertArrayEquals(exp, act);
	}
	//================================
	// init
	//================================
	@Test
	public void test_init_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(obj.check(), true);
		int[] act = obj.toArray();
		int[] exp = {10,11,20,24,77,82};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_two() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		assertEquals(obj.check(), true);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_one() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(obj.check(), true);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(obj.check(), true);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_null() 
	{
		int[] ini = null;
		obj.init(ini);
		assertEquals(obj.check(), true);
		int[] act = obj.toArray();
		int[] exp = {};
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);
	}
	//================================
	// size
	//================================
	@Test
	public void test_Size_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		assertEquals(6, obj.size());
	}
	@Test
	public void test_Size_two() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		assertEquals(2, obj.size());
	}
	@Test
	public void test_Size_one() 
	{
		int[] ini = {10};
		obj.init(ini);
		assertEquals(1, obj.size());
	}
	@Test
	public void test_Size_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.size());
	}

	//================================
	// leaves
	//================================
	@Test
	public void test_leaves_many_1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45};
		obj.init(ini);
		assertEquals(6, obj.leaves());
	}
	@Test
	public void test_leaves_many_2() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		assertEquals(6, obj.leaves());
	}
	@Test
	public void test_leaves_2() 
	{
		int[] ini = {50,25};
		obj.init(ini);
		assertEquals(1, obj.leaves());
	}
	@Test
	public void test_leaves_1() 
	{
		int[] ini = {50};
		obj.init(ini);
		assertEquals(1, obj.leaves());
	}
	@Test
	public void test_leaves_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.leaves());
	}

	//================================
	// nodes
	//================================
	@Test
	public void test_nodes_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		assertEquals(8, obj.nodes());
	}
	@Test
	public void test_nodes_many2() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,47};
		obj.init(ini);
		assertEquals(6, obj.nodes());
	}
	@Test
	public void test_nodes_2() 
	{
		int[] ini = {50,25};
		obj.init(ini);
		assertEquals(1, obj.nodes());
	}
	@Test
	public void test_nodes_1() 
	{
		int[] ini = {50};
		obj.init(ini);
		assertEquals(0, obj.nodes());
	}
	@Test
	public void test_nodes_0() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.nodes());
	}
	//================================
	// clear
	//================================
	@Test
	public void test_clear_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		obj.clear();
		int[] exp = {};
		int[] act = obj.toArray();
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);	
	}
	@Test
	public void test_clear_two() 
	{
		int[] ini = {50,25};
		obj.init(ini);
		obj.clear();
		int[] exp = {};
		int[] act = obj.toArray();
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);	
	}
	@Test
	public void test_clear_one() 
	{
		int[] ini = {50};
		obj.init(ini);
		obj.clear();
		int[] exp = {};
		int[] act = obj.toArray();
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);	
	}
	@Test
	public void test_clear_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.clear();
		int[] exp = {};
		int[] act = obj.toArray();
		assertEquals(0, obj.size());
		assertArrayEquals(exp, act);	
	}
	//================================
	// height
	//================================
	@Test
	public void test_height_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		assertEquals(5, obj.height());
	}
	@Test
	public void test_height_many2() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45};
		obj.init(ini);
		assertEquals(4, obj.height());
	}
	@Test
	public void test_height_two() 
	{
		int[] ini = {50,25};
		obj.init(ini);
		assertEquals(2, obj.height());
	}
	@Test
	public void test_height_one() 
	{
		int[] ini = {50};
		obj.init(ini);
		assertEquals(1, obj.height());
	}
	@Test
	public void test_height_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.height());
	}
	//================================
	// width
	//================================
	@Test
	public void test_width_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		assertEquals(5, obj.width());
	}
	@Test
	public void test_width_many2() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45};
		obj.init(ini);
		assertEquals(4, obj.width());
	}
	@Test
	public void test_width_two() 
	{
		int[] ini = {50,25};
		obj.init(ini);
		assertEquals(1, obj.width());
	}
	@Test
	public void test_width_one() 
	{
		int[] ini = {50};
		obj.init(ini);
		assertEquals(1, obj.width());
	}
	@Test
	public void test_width_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		assertEquals(0, obj.width());
	}
	//================================
	// add
	//================================
	@Test
	public void test_add_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45,22,43,77};
		obj.init(ini);
		obj.add(66);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {11,20,22,24,25,30,40,43,45,50,60,66,75,77,100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_many2() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.add(100);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {10, 11, 20, 24, 77, 82,100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_two() 
	{
		int[] ini = {20,77};
		obj.init(ini);
		obj.add(50);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20,50,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_one() 
	{
		int[] ini = {20};
		obj.init(ini);
		obj.add(50);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20,50};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_add_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.add(50);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {50};
		assertArrayEquals(exp, act);
	}
	//================================
	// del
	//================================
	@Test
	public void test_del_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		obj.init(ini);
		obj.del(66);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {11,20,22,24,25,30,40,43,45,50,60,75,77,100};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_many2() 
	{
		int[] ini = {10,20,77,11,100,24,82};
		obj.init(ini);
		obj.del(100);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {10, 11, 20, 24, 77, 82};
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_del_three_right_3() 
	{
		int[] ini = {20,77,50};
		obj.init(ini);
		obj.del(20);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {50,77};
		assertArrayEquals(exp, act);
	}	
	@Test
	public void test_del_three_left_3() 
	{
		int[] ini = {20,10,15};
		obj.init(ini);
		obj.del(20);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {10,15};
		assertArrayEquals(exp, act);
	}	

	@Test
	public void test_del_four_left_1() 
	{
		int[] ini = {20,10,77,15};
		obj.init(ini);
		obj.del(10);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {15, 20,77};
		assertArrayEquals(exp, act);
	}	
	@Test
	public void test_del_four_right_1() 
	{
		int[] ini = {20,10,77,50};
		obj.init(ini);
		obj.del(50);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {10,20,77};
		assertArrayEquals(exp, act);
	}	
	@Test
	public void test_del_three_right_1() 
	{
		int[] ini = {20,10,77};
		obj.init(ini);
		obj.del(77);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_three_left_1() 
	{
		int[] ini = {20,10,77};
		obj.init(ini);
		obj.del(10);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20,77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_right_1() 
	{
		int[] ini = {20,77};
		obj.init(ini);
		obj.del(20);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_right_2() 
	{
		int[] ini = {20,77};
		obj.init(ini);
		obj.del(77);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_left_1() 
	{
		int[] ini = {77,20};
		obj.init(ini);
		obj.del(20);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_left_2() 
	{
		int[] ini = {77,20};
		obj.init(ini);
		obj.del(77);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20};
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_del_one() 
	{
		int[] ini = {20};
		obj.init(ini);
		obj.del(20);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_del_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.del(50);
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void testDel_many_v11() 
	{
		int[] ar2 = {55,24,5,98,45,53,12,104,111,15,4,62,84,59,91,77,70,75,71,110};
		obj.init(ar2);

		obj.del(24);
		assertEquals(obj.check(), true);
		obj.del(15);
		assertEquals(obj.check(), true);

		int[] act2 = obj.toArray();
		int[] exp2 = {4,5,12,45,53,55,59,62,70,71,75,77,84,91,98,104,110,111};
		assertArrayEquals(exp2,act2);
	}
	@Test
	public void testDel_many_v12() 
	{
		int[] ar2 = {55,24,5,98,45,53,12,104,111,15,4,62,84,59,91,77,70,75,71,110};
		obj.init(ar2);

		obj.del(91);
		assertEquals(obj.check(), true);
		obj.del(98);
		assertEquals(obj.check(), true);
		obj.del(84);
		assertEquals(obj.check(), true);

		int[] act2 = obj.toArray();
		int[] exp2 = {4,5,12,15,24,45,53,55,59,62,70,71,75,77,104,110,111};
		assertArrayEquals(exp2,act2);
	}
	@Test
	public void testDel_many_v13() 
	{
		int[] ar2 = {55,24,5,98,45,53,12,104,111,18,15,14,17,4,62,84,59,91,77,70,75,71,110};
		obj.init(ar2);

		obj.del(24);
		obj.del(15);

		int[] act2 = obj.toArray();
		int[] exp2 = {4,5,12,14,17,18,45,53,55,59,62,70,71,75,77,84,91,98,104,110,111};
		assertArrayEquals(exp2,act2);
	}
	//================================
	// revers
	//================================
	@Test
	public void test_revers_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		obj.init(ini);
		obj.revers();
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {100,77,75,66,60,50,45,43,40,30,25,24,22,20,11};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_revers_many2() 
	{
		int[] ini = {10,20,77,11,100,24,82};
		obj.init(ini);
		obj.revers();
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {100, 82, 77, 24, 20, 11, 10,};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_revers_two() 
	{
		int[] ini = {20,77};
		obj.init(ini);
		obj.revers();
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {77,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_revers_one() 
	{
		int[] ini = {20};
		obj.init(ini);
		obj.revers();
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_revers_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		obj.revers();
		assertEquals(obj.check(), true);
		int [] act = obj.toArray();
		int [] exp = {};
		assertArrayEquals(exp, act);
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
			assertEquals(i.intValue(), ar[j]);
			j++;
		}
		assertEquals(str, act);
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
			str +=( i + ", ");
			assertEquals(i.intValue(), ar[j++]);
		}
		assertEquals(str, act);
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
			str +=( i + ", ");
			assertEquals(i.intValue(), ar[j++]);
		}
		assertEquals(str, act);
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
			str +=( i + ", ");
			assertEquals(i.intValue(), ar[j++]);
		}
		assertEquals(str, act);
	}
	//================================
	// equals
	//================================
	@Test
	public void test_equals_many1() 
	{
		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
	@Test
	public void test_equals_many2() 
	{
		int[] ini = {50,25,40,20,11,24};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11,24};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
	@Test
	public void test_equals_many3() 
	{
		int[] ini = {50,25,40,20,11};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
	@Test
	public void test_equals_many_bad1() 
	{
		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,78};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), false);
	}
	@Test
	public void test_equals_many_bad2() 
	{
		int[] ini = {50,25,40,20,11,23};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11,24};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), false);
	}
	@Test
	public void test_equals_many_bad3() 
	{
		int[] ini = {50,25,40,20,10};
		obj.init(ini);

		int[] ini2 = {50,25,40,20,11};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), false);
	}
	@Test
	public void test_equals_two1() 
	{
		int[] ini = {50,77};
		obj.init(ini);

		int[] ini2 = {50,77};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
	@Test
	public void test_equals_two_bad1() 
	{
		int[] ini = {50,77};
		obj.init(ini);

		int[] ini2 = {50,78};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), false);
	}
	@Test
	public void test_equals_one1() 
	{
		int[] ini = {77};
		obj.init(ini);

		int[] ini2 = {77};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
	@Test
	public void test_equals_one_bad1() 
	{
		int[] ini = {77};
		obj.init(ini);

		int[] ini2 = {78};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), false);
	}
	@Test
	public void test_equals_empty1() 
	{
		int[] ini = {};
		obj.init(ini);

		int[] ini2 = {};
		obj2.init(ini2);

		assertEquals(obj.equals(obj2), true);
	}
}

