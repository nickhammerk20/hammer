package BsTree;

import static org.junit.Assert.*;

//import java.util.Arrays;
//import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;

//import BsTree.EBsTree;

//@RunWith(Parameterized.class)
public class BsTreeTest2 
{
	Tree obj = new Tree();

	//	@Parameters
	//	public static Collection<Object[]> EBsTree()
	//	{
	//		return Arrays.asList(new Object[][]
	//		{
	//			{ new BsTree()}
	//		});
	//	}
	//	
	//	public EBsTreeTest(EBsTree Paramet) 
	//	{
	//		obj = Paramet;
	//	}
	//	
	@Before
	public void start()
	{
		obj.Tree();
	}

	//==================================//
	// toString							//
	//==================================//
	@Test
	public void toString_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.insert(ini);
		String act = obj.toString();
		String exp = "10, 11, 20, 24, 77, 82, ";
		assertEquals(exp, act);
	}

	//================================
	// init
	//================================
	@Test
	public void init_many() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		int[] act = obj.toArray();
		int[] exp = {10,11,20,24,77,82};
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

	//================================
	// leaves
	//================================
	@Test
	public void test_leaves_many() 
	{
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45};
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
		int[] ini = {50,25,40,20,11,24,30,75,100,60,45};
		obj.init(ini);
		assertEquals(5, obj.nodes());
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
	// DelPos
	//================================
	@Test
	public void test_DelPos_many_end() 
	{
		int[] ini = {10,20,77,11,24,82};
		obj.init(ini);
		obj.del(10);
		int[] act = obj.toArray();
		int[] exp = {10,20,77,11,24,};
		assertEquals(5, obj.size());
		assertArrayEquals(exp, act);
	}
}

