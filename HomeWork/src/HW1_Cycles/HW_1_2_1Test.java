package HW1_Cycles;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_2_1Test {

	@Test
	public void test01() {
		int res=HW_1_2_1.kol(1,99);
		assertEquals(49, res);
	}
	@Test
	public void test02() {
		int res=HW_1_2_1.sum(1,99);
		assertEquals(2450, res);
	}

}
