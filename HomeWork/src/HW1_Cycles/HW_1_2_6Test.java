package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_6Test {

	@Test
	public void test01() {
		int res=HW_1_2_6.fzerkalo(1);
		assertEquals(1, res);
	}
	@Test
	public void test02() {
		int res=HW_1_2_6.fzerkalo(12);
		assertEquals(21, res);
	}
	@Test
	public void test03() {
		int res=HW_1_2_6.fzerkalo(123);
		assertEquals(321, res);
	}
	@Test
	public void test04() {
		int res=HW_1_2_6.fzerkalo(1234);
		assertEquals(4321, res);
	}
	@Test
	public void test05() {
		int res=HW_1_2_6.fzerkalo(12345);
		assertEquals(54321, res);
	}
	@Test
	public void test06() {
		int res=HW_1_2_6.fzerkalo(123456);
		assertEquals(654321, res);
	}
	@Test
	public void test07() {
		int res=HW_1_2_6.fzerkalo(1234567);
		assertEquals(7654321, res);
	}
	@Test
	public void test08() {
		int res=HW_1_2_6.fzerkalo(12345678);
		assertEquals(87654321, res);
	}
	@Test
	public void test09() {
		int res=HW_1_2_6.fzerkalo(123456789);
		assertEquals(987654321, res);
	}
	@Test
	public void test10() {
		int res=HW_1_2_6.fzerkalo(1234567890);
		assertEquals(987654321, res);
	}
	@Test
	public void test11() {
		int res=HW_1_2_6.fzerkalo(1234567800);
		assertEquals(87654321, res);
	}
	@Test
	public void test12() {
		int res=HW_1_2_6.fzerkalo(1234567000);
		assertEquals(7654321, res);
	}
	@Test
	public void test13() {
		int res=HW_1_2_6.fzerkalo(1234560000);
		assertEquals(654321, res);
	}
	@Test
	public void test14() {
		int res=HW_1_2_6.fzerkalo(1234500000);
		assertEquals(54321, res);
	}
	@Test
	public void test15() {
		int res=HW_1_2_6.fzerkalo(1234000000);
		assertEquals(4321, res);
	}
	@Test
	public void test16() {
		int res=HW_1_2_6.fzerkalo(1230000000);
		assertEquals(321, res);
	}
	@Test
	public void test17() {
		int res=HW_1_2_6.fzerkalo(1200000000);
		assertEquals(21, res);
	}
	@Test
	public void test18() {
		int res=HW_1_2_6.fzerkalo(1000000000);
		assertEquals(1, res);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test19() {
		HW_1_2_6.fzerkalo(0000000000);
		
	}
}