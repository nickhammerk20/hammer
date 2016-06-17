package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_5Test {

	@Test (expected=IllegalArgumentException.class)
	public void test01() {
		HW_1_2_5.fsumcifr(-5);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test02() {
		HW_1_2_5.fsumcifr(0);
	}
	@Test
	public void test04() {
		int res=HW_1_2_5.fsumcifr(1);
		assertEquals(1, res);
	}
	@Test
	public void test05() {
		int res=HW_1_2_5.fsumcifr(9);
		assertEquals(9, res);
	}@Test
	public void test06() {
		int res=HW_1_2_5.fsumcifr(11);
		assertEquals(2, res);
	}@Test
	public void test07() {
		int res=HW_1_2_5.fsumcifr(19);
		assertEquals(10, res);
	}@Test
	public void test08() {
		int res=HW_1_2_5.fsumcifr(20);
		assertEquals(2, res);
	}@Test
	public void test09() {
		int res=HW_1_2_5.fsumcifr(21);
		assertEquals(3, res);
	}@Test
	public void test10() {
		int res=HW_1_2_5.fsumcifr(99);
		assertEquals(18, res);
	}@Test
	public void test11() {
		int res=HW_1_2_5.fsumcifr(100);
		assertEquals(1, res);
	}@Test
	public void test12() {
		int res=HW_1_2_5.fsumcifr(101);
		assertEquals(2, res);
	}@Test
	public void test13() {
		int res=HW_1_2_5.fsumcifr(111);
		assertEquals(3, res);
	}
	@Test
	public void test14() {
		int res=HW_1_2_5.fsumcifr(199);
		assertEquals(19, res);
	}
	@Test
	public void test15() {
		int res=HW_1_2_5.fsumcifr(2000);
		assertEquals(2, res);
	}
	@Test
	public void test16() {
		int res=HW_1_2_5.fsumcifr(2001);
		assertEquals(3, res);
	}
	@Test
	public void test17() {
		int res=HW_1_2_5.fsumcifr(2011);
		assertEquals(4, res);
	}
	@Test
	public void test18() {
		int res=HW_1_2_5.fsumcifr(2111);
		assertEquals(5, res);
	}
}