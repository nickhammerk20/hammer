import static org.junit.Assert.*;

import org.junit.Test;

public class aList0Test {


	/*тест метода clear*/
	@Test
	public void test_clear_01() {
		int [] ini = {1};
		aList0 list = new aList0();
		list.init(ini);
		list.clear();
		assertEquals(0, list.size());
		int[] act = list.toArray();
		int [] exp = {};		
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_clear_02() {
		int [] arrTest = {1,2};
		aList0 list = new aList0();
		list.init(arrTest);
		list.clear();
		int[] act = list.toArray();
		int [] exp = {};	
		assertArrayEquals(exp, act);
	}
	@Test
	public void test_clear_03() {
		int [] arrTest = {0,2,5,7,9};
		int [] arrExp = {};				
		aList0 list = new aList0();
		list.init(arrTest);
		list.clear();
		int[] act = list.toArray();
		int [] exp = {};	
		assertArrayEquals(exp, act);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test_clear_04() {
		int [] arrTest = {};
		aList0 list = new aList0();
		list.init(arrTest);
		list.clear();
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_clear_05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.clear();
	}
	/*тест метода init*/
	@Test
	public void test_init_01() {
		int [] arrTest = {1};
		int [] arrExempl = arrTest;				
		aList0 list = new aList0();
		list.init(arrTest);
		assertArrayEquals(arrTest, arrExempl);
	}
	@Test
	public void test_init_02() {
		int [] arrTest = {1,2};
		int [] arrExempl = {1,2};				
		aList0 list = new aList0();
		list.init(arrTest);
		assertArrayEquals(arrTest, arrExempl);
	}
	@Test
	public void test_init_03() {
		int [] arrTest = {0,2,5,7,9};
		int [] arrExempl = {0,2,5,7,9};				
		aList0 list = new aList0();
		list.init(arrTest);
		assertArrayEquals(arrTest, arrExempl);
	}
	@Test 
	public void test_init_04() {
		int [] arrTest = {};
		int [] arrExempl = {};	
		aList0 list = new aList0();
		list.init(arrTest);
		assertArrayEquals(arrTest, arrExempl);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_init_05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
	}
	/*тест метода print*/
	@Test
	public void test_print_01() {
		int [] arrTest = {1};
		String arrExp = "1,";				
		aList0 list = new aList0();
		list.init(arrTest);
		assertEquals(arrExp, list.print());
	}
	@Test
	public void test_print_02() {
		int [] arrTest = {1,2};
		String arrExp = "1,2,";					
		aList0 list = new aList0();
		list.init(arrTest);
		assertEquals(arrExp, list.print());
	}
	@Test
	public void test_print_03() {
		int [] arrTest = {0,2,5,7,9};
		String arrExp = "0,2,5,7,9,";					
		aList0 list = new aList0();
		list.init(arrTest);
		assertEquals(arrExp, list.print());
	}
	@Test (expected=IllegalArgumentException.class)
	public void test_print_04() {
		int [] arrTest = {};
		aList0 list = new aList0();
		list.init(arrTest);
		list.print();
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_print_05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.print();
	}
	/*тест метода size*/
	@Test
	public void test_size_01() {
		int [] arrTest = {1};
		int arrExp = 1;				
		aList0 list = new aList0();
		list.init(arrTest);
		list.size();
		assertEquals(arrExp, list.size());
	}
	@Test
	public void test_size_02() {
		int [] arrTest = {1,2};
		int arrExp = 2;					
		aList0 list = new aList0();
		list.init(arrTest);
		list.size();
		assertEquals(arrExp, list.size());
	}
	@Test
	public void test_size_03() {
		int [] arrTest = {0,2,5,7,9};
		int arrExp = 5;					
		aList0 list = new aList0();
		list.init(arrTest);
		list.size();
		assertEquals(arrExp, list.size());
	}
	@Test (expected=IllegalArgumentException.class)
	public void test_size_04() {
		int [] arrTest = {};
		aList0 list = new aList0();
		list.init(arrTest);
		list.size();
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_size_05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.size();
	}
	/*тест метода addStart*/
	@Test
	public void test_addStart01() {
		int [] arrTest = {1};
		int [] arrExp = {9,1};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addStart(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addStart02() {
		int [] arrTest = {1,2};
		int [] arrExp = {9,1,2};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addStart(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addStart03() {
		int [] arrTest = {1,2,3,4,5};
		int [] arrExp = {9,1,2,3,4,5};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addStart(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addStart04() {
		int [] arrTest = {};
		int [] arrExp = {9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addStart(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_addStart05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.addStart(9);
	}
	/*тест метода addEnd*/
	@Test
	public void test_addEnd01() {
		int [] arrTest = {1};
		int [] arrExp = {1,9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addEnd(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addEnd02() {
		int [] arrTest = {1,2};
		int [] arrExp = {1,2,9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addEnd(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addEnd03() {
		int [] arrTest = {1,2,3,4,5};
		int [] arrExp = {1,2,3,4,5,9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addEnd(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addEnd04() {
		int [] arrTest = {};
		int [] arrExp = {9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addEnd(9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_addEnd05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.addEnd(9);
	}
	/*тест метода addPos*/
	@Test
	public void test_addPos01() {
		int [] arrTest = {1};
		int [] arrExp = {1,9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addPos(1, 9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addPos02() {
		int [] arrTest = {1,2};
		int [] arrExp = {1,9,2};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addPos(1,9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addPos03() {
		int [] arrTest = {1,2,3,4,5};
		int [] arrExp = {1,2,9,3,4,5};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addPos(2,9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test
	public void test_addPos04() {
		int [] arrTest = {};
		int [] arrExp = {9};
		aList0 list = new aList0();
		list.init(arrTest);
		list.addPos(0,9);
		assertArrayEquals(arrExp, list.toArray());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_addPos05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.addPos(0,9);
	}
	/*тест метода delPos*/
	@Test
	public void test_delPos01() {
		int [] arrTest = {1,9};
		int [] arrExp = {1};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delPos(1);
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delPos02() {
		int [] arrTest = {1,9,2};
		int [] arrExp = {1,2};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delPos(1);
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delPos03() {
		int [] arrTest = {1,2,9,3,4,5};
		int [] arrExp = {1,2,3,4,5};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delPos(2);
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delPos04() {
		int [] arrTest = {9};
		int [] arrExp = {};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delPos(0);
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_delPos05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.delPos(0);
		
	}
	/*тест метода delPos*/
	@Test
	public void test_delStart01() {
		int [] arrTest = {1,9};
		int [] arrExp = {9};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delStart();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(1, ret);
	}
	@Test
	public void test_delStart02() {
		int [] arrTest = {9,1,2};
		int [] arrExp = {1,2};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delStart();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delStart03() {
		int [] arrTest = {9,1,2,3,4,5};
		int [] arrExp = {1,2,3,4,5};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delStart();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delStart04() {
		int [] arrTest = {9};
		int [] arrExp = {};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delStart();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_delStart05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.delStart();
	}
	/*тест метода delPos*/
	@Test
	public void test_delEnd01() {
		int [] arrTest = {1,9};
		int [] arrExp = {1};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delEnd();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delEnd02() {
		int [] arrTest = {1,2,9};
		int [] arrExp = {1,2};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delEnd();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delEnd03() {
		int [] arrTest = {1,2,3,4,5,9};
		int [] arrExp = {1,2,3,4,5};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delEnd();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test
	public void test_delEnd04() {
		int [] arrTest = {9};
		int [] arrExp = {};
		aList0 list = new aList0();
		list.init(arrTest);
		int ret = list.delEnd();
		assertArrayEquals(arrExp, list.toArray());
		assertEquals(9, ret);
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_delEnd05() {
		int [] arrTest = null;
		aList0 list = new aList0();
		list.init(arrTest);
		list.delEnd();
	}
	/*тест метода toArray*/
	@Test(expected=IllegalArgumentException.class)
	public void test_toArray01() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.toArray();
	}
	@Test
	public void test_toArray02() {
		int [] arrIn = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		assertArrayEquals(list.toArray(), arrIn);
	}
	@Test
	public void test_toArray03() {
		int [] arrIn = {1,2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertArrayEquals(list.toArray(), arrIn);
	}
	@Test
	public void test_toArray04() {
		int [] arrIn = {1,2,3,4,5,6};
		aList0 list = new aList0();
		list.init(arrIn);
		assertArrayEquals(list.toArray(), arrIn);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_toArray05() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
	}
	/*тест метода get*/
	@Test(expected=IllegalArgumentException.class)
	public void test_get01() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.get(0);
	}
	@Test
	public void test_get02() {
		int [] arrIn = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.get(0);
		assertEquals(list.get(0), 1);
	}
	@Test
	public void test_get03() {
		int [] arrIn = {1,2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(list.get(1), 2);
	}
	@Test
	public void test_get04() {
		int [] arrIn = {1,2,3,4,5,6};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(list.get(2), 3);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_get05() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		
	}
	/*тест метода set*/
	@Test(expected=IllegalArgumentException.class)
	public void test_set01() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.set(0,8);
	}
	@Test
	public void test_set02() {
		int [] arrIn = {1};
		int [] arrOut = {88};
		aList0 list = new aList0();
		list.init(arrIn);
		list.set(0,88);
		assertArrayEquals(arrIn, arrOut);
	}
	@Test
	public void test_set03() {
		int [] arrIn = {1,2};
		int [] arrOut = {1,88};
		aList0 list = new aList0();
		list.init(arrIn);
		list.set(1,88);
		assertArrayEquals(arrIn, arrOut);
	}
	@Test
	public void test_set04() {
		int [] arrIn = {1,2,3,4,5,6};
		int [] arrOut = {1,2,88,4,5,6};
		aList0 list = new aList0();
		list.init(arrIn);
		list.set(2,88);
		assertArrayEquals(arrIn, arrOut);
	}
	@Test(expected = IllegalArgumentException.class)
	public void test_set05() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.set(1, 1);
		
	}
	/*тест метода min*/
	@Test(expected=IllegalArgumentException.class)
	public void test_min01() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.min();
	}
	@Test
	public void test_min02() {
		int [] arrIn = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(1, list.min());
	}
	@Test
	public void test_min03() {
		int [] arrIn = {1,2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(1, list.min());
	}
	@Test
	public void test_min04() {
		int [] arrIn = {2,4,7,1,3};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(1, list.min());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_min05() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.min();
	}
	/*тест метода max*/
	@Test(expected=IllegalArgumentException.class)
	public void test_max01() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.max();
	}
	@Test
	public void test_max02() {
		int [] arrIn = {2,4,7,1,3};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(7, list.max());
	}
	@Test
	public void test_max03() {
		int [] arrIn = {2,4};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(4, list.max());
	}
	@Test
	public void test_max04() {
		int [] arrIn = {2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(2, list.max());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_max05() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.max();
	}
	/*тест метода minPos*/
	@Test(expected=IllegalArgumentException.class)
	public void test_minPos01() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.minPos();
	}
	@Test
	public void test_minPos02() {
		int [] arrIn = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(0, list.minPos());
	}
	@Test
	public void test_minPos03() {
		int [] arrIn = {1,2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(0, list.minPos());
	}
	@Test
	public void test_minPos04() {
		int [] arrIn = {2,4,7,1,3};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(3, list.minPos());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_minPos05() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.minPos();
	}
	/*тест метода maxPos*/
	@Test(expected=IllegalArgumentException.class)
	public void test_maxPos01() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.maxPos();
	}
	@Test
	public void test_maxPos02() {
		int [] arrIn = {2,4,7,1,3};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(2, list.maxPos());
	}
	@Test
	public void test_maxPos03() {
		int [] arrIn = {2,4};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(1, list.maxPos());
	}
	@Test
	public void test_maxPos04() {
		int [] arrIn = {2};
		aList0 list = new aList0();
		list.init(arrIn);
		assertEquals(0, list.maxPos());
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_maxPos05() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.maxPos();
	}
	/*тест метода revers*/
	@Test(expected=IllegalArgumentException.class)
	public void test_revers01() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.revers();
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_revers02() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.revers();	
	}
	@Test
	public void test_revers03() {
		int [] arrIn = {1};
		int [] arrExp = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.revers();	
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_revers04() {
		int [] arrIn = {1,4};
		int [] arrExp = {4,1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.revers();	
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_revers05() {
		int [] arrIn = {1,4,6,8};
		int [] arrExp = {8,6,4,1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.revers();	
		assertArrayEquals(arrExp, arrIn);
	}
	/*тест метода halfRevers*/
	@Test(expected=IllegalArgumentException.class)
	public void test_halfRevers01() {
		int [] arrIn = null;
		aList0 list = new aList0();
		list.init(arrIn);
		list.halfRevers();
	}
	@Test(expected=IllegalArgumentException.class)
	public void test_halfRevers02() {
		int [] arrIn = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.halfRevers();	
	}
	@Test
	public void test_halfRevers03() {
		int [] arrIn = {1};
		int [] arrExp = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.halfRevers();	
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_halfRevers04() {
		int [] arrIn = {1,4};
		int [] arrExp = {4,1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.halfRevers();	
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_halfRevers05() {
		int [] arrIn = {1,4,6,8,9};
		int [] arrExp = {8,9,6,1,4};
		aList0 list = new aList0();
		list.init(arrIn);
		list.halfRevers();	
		assertArrayEquals(arrExp, arrIn);
	}
	/*тест метода halfRevers*/
	@Test
	public void test_sort01() {
		int [] arrIn = {1};
		int [] arrExp = {1};
		aList0 list = new aList0();
		list.init(arrIn);
		list.sort();
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_sort02() {
		int [] arrIn = {4,1};
		int [] arrExp = {1,4};
		aList0 list = new aList0();
		list.init(arrIn);
		list.sort();
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_sort03() {
		int [] arrIn = {8,9,6,1,4};
		int [] arrExp = {1,4,6,8,9};
		aList0 list = new aList0();
		list.init(arrIn);
		list.sort();
		assertArrayEquals(arrExp, arrIn);
	}
	@Test
	public void test_sort04() {
		int [] arrIn = {0};
		aList0 list = new aList0();
		list.init(arrIn);
		list.sort();
	}
		
	@Test
	public void test_CLEAR_05() {
		int [] arrIn = {1,4,6,8,9};
		int [] arrExp = {};
		aList0 list = new aList0();
		list.init(arrIn);
		list.clear();
		assertArrayEquals(arrExp, list.toArray());
	}
}
