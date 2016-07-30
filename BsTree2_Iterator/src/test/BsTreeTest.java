package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import BsTree.BsTree;
import BsTree.BsTree2;
import BsTree.BsTree3_Linked;
import BsTree.EBsTree;

public class BsTreeTest 
{
	BsTree obj = new BsTree();
//	BsTree2 obj = new BsTree2();
//	BsTree3_Linked obj = new BsTree3_Linked();

	@Before
	public void start()
	{
		obj.clear();
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
		int[] act = obj.toArray();
		int[] exp = {10,11,20,24,77,82};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_two() 
	{
		int[] ini = {10,20};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,20};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_one() 
	{
		int[] ini = {10};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_empty() 
	{
		int[] ini = {};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_init_null() 
	{
		int[] ini = null;
		obj.init(ini);
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
		int [] act = obj.toArray();
		int [] exp = {11,20,22,24,25,30,40,43,45,50,60,75,77,100, };
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_many2() 
	{
		int[] ini = {10,20,77,11,100,24,82};
		obj.init(ini);
		obj.del(100);
		int [] act = obj.toArray();
		int [] exp = {10, 11, 20, 24, 77, 82};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_max_min() 
	{
		int[] ini = {77,20};
		obj.init(ini);
		obj.del(20);
		int [] act = obj.toArray();
		int [] exp = {77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_two_min_max() 
	{
		int[] ini = {20,77};
		obj.init(ini);
		System.out.println("1 - "+obj.toString());
		obj.del(20);
		System.out.println("2 - "+obj.toString());
		int [] act = obj.toArray();
		System.out.println("3 - "+obj.toString());
		int [] exp = {77};
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_del_one() 
	{
		int[] ini = {20};
		obj.init(ini);
		obj.del(20);
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
		int [] act = obj.toArray();
		int [] exp = {50};
		assertArrayEquals(exp, act);
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
		int [] act = obj.toArray();
		int [] exp = {};
		assertArrayEquals(exp, act);
	}
}

