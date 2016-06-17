package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_4Test {

	@Test (expected=IllegalArgumentException.class)
	public void test01() {
		HW_1_2_4.ffactorial(0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test02() {
		HW_1_2_4.ffactorial(1);
	}
	@Test
	public void test03() {
		int res=HW_1_2_4.ffactorial(2);
		assertEquals(2, res);
	}
	@Test
	public void test04() {
		int res=HW_1_2_4.ffactorial(3);
		assertEquals(6, res);
	}
	@Test
	public void test05() {
		int res=HW_1_2_4.ffactorial(6);
		assertEquals(720, res);
	}
	@Test
	public void test06() {
		int res=HW_1_2_4.ffactorial(11);
		assertEquals(39916800, res);
	}
}
