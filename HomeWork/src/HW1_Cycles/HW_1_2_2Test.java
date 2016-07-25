package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_2Test {

	@Test (expected=IllegalArgumentException.class)
	public void test01() {
		HW_1_2_2.fprostoe(0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test02() {
		HW_1_2_2.fprostoe(1);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test03() {
		HW_1_2_2.fprostoe(-1);
	}
	@Test
	public void test04() {
		String res=HW_1_2_2.fprostoe(2);
		assertEquals("простое", res);
	}
	@Test
	public void test05() {
		String res=HW_1_2_2.fprostoe(3);
		assertEquals("простое", res);
	}
	@Test
	public void test06() {
		String res=HW_1_2_2.fprostoe(4);
		assertEquals("сложное", res);
	}
	@Test
	public void test07() {
		String res=HW_1_2_2.fprostoe(5);
		assertEquals("простое", res);
	}
	@Test
	public void test08() {
		String res=HW_1_2_2.fprostoe(6);
		assertEquals("сложное", res);
	}
	@Test
	public void test09() {
		String res=HW_1_2_2.fprostoe(7);
		assertEquals("простое", res);
	}
	@Test
	public void test10() {
		String res=HW_1_2_2.fprostoe(8);
		assertEquals("сложное", res);
	}
	@Test
	public void test11() {
		String res=HW_1_2_2.fprostoe(9);
		assertEquals("сложное", res);
	}
	@Test
	public void test12() {
		String res=HW_1_2_2.fprostoe(101);
		assertEquals("простое", res);
	}
	@Test
	public void test13() {
		String res=HW_1_2_2.fprostoe(105);
		assertEquals("сложное", res);
	}
	@Test
	public void test14() {
		String res=HW_1_2_2.fprostoe(147);
		assertEquals("сложное", res);
	}
	@Test
	public void test15() {
		String res=HW_1_2_2.fprostoe(149);
		assertEquals("простое", res);
	}
	
}
