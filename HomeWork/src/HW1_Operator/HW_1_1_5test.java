package HW1_Operator;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_1_5test {

	@Test (expected=IllegalArgumentException.class)
	public void test01() {
		HW_1_1_5.ff(-1);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test02() {
		HW_1_1_5.ff(101);
	}
	@Test
	public void test03() {
		String res=HW_1_1_5.ff(0);
		assertEquals("F", res);
	}
	@Test
	public void test04() {
		String res=HW_1_1_5.ff(10);
		assertEquals("F", res);
	}
	@Test
	public void test05() {
		String res=HW_1_1_5.ff(19);
		assertEquals("F", res);
	}
	@Test
	public void test06() {
		String res=HW_1_1_5.ff(20);
		assertEquals("E", res);
	}
	@Test
	public void test07() {
		String res=HW_1_1_5.ff(30);
		assertEquals("E", res);
	}
	@Test
	public void test08() {
		String res=HW_1_1_5.ff(39);
		assertEquals("E", res);
	}
	@Test
	public void test09() {
		String res=HW_1_1_5.ff(40);
		assertEquals("D", res);
	}
	@Test
	public void test10() {
		String res=HW_1_1_5.ff(50);
		assertEquals("D", res);
	}
	@Test
	public void test11() {
		String res=HW_1_1_5.ff(59);
		assertEquals("D", res);
	}
	@Test
	public void test12() {
		String res=HW_1_1_5.ff(60);
		assertEquals("C", res);
	}
	@Test
	public void test13() {
		String res=HW_1_1_5.ff(70);
		assertEquals("C", res);
	}
	@Test
	public void test14() {
		String res=HW_1_1_5.ff(74);
		assertEquals("C", res);
	}
	@Test
	public void test15() {
		String res=HW_1_1_5.ff(75);
		assertEquals("B", res);
	}
	@Test
	public void test16() {
		String res=HW_1_1_5.ff(80);
		assertEquals("B", res);
	}
	@Test
	public void test17() {
		String res=HW_1_1_5.ff(89);
		assertEquals("B", res);
	}
	@Test
	public void test18() {
		String res=HW_1_1_5.ff(90);
		assertEquals("A", res);
	}
	@Test
	public void test19() {
		String res=HW_1_1_5.ff(95);
		assertEquals("A", res);
	}
	@Test
	public void test20() {
		String res=HW_1_1_5.ff(100);
		assertEquals("A", res);
	}
}
