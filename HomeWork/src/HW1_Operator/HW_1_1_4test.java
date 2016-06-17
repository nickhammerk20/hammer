package HW1_Operator;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_1_4test {

	@Test
	public void test1() {
		double res=HW_1_1_4.ff(5,5,5);
		assertEquals(128, res, 0.01);
	}
	@Test
	public void test2() {
		double res=HW_1_1_4.ff(5,1,5);
		assertEquals(28, res, 0.01);
	}
	@Test
	public void test3() {
		double res=HW_1_1_4.ff(0,5,5);
		assertEquals(13, res, 0.01);
	}
	@Test
	public void test4() {
		double res=HW_1_1_4.ff(1,1,10);
		assertEquals(15, res, 0.01);
	}

}
