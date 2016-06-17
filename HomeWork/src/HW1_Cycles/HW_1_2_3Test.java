package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_3Test {

	@Test (expected=IllegalArgumentException.class)
	public void test01() {
		HW_1_2_3.fkorennatchisla(0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void test02() {
		HW_1_2_3.fkorennatchisla(-1);
	}
	@Test
	public void test03() {
		int res=HW_1_2_3.fkorennatchisla(9);
		assertEquals(3, res);
	}
	@Test
	public void test04() {
		int res=HW_1_2_3.fkorennatchisla(138384);
		assertEquals(372, res);
	}
	@Test
	public void test05() {
		int res=HW_1_2_3.fkorennatchisla(49);
		assertEquals(7, res);
	}
	@Test
	public void test06() {
		int res=HW_1_2_3.fkorennatchisla(81);
		assertEquals(9, res);
	}

}
