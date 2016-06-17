package HW1_Operator;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_1_3test {

	@Test
	public void test1() {
		double res = HW_1_1_3.ff(5,5,5);
		assertEquals(15, res, 0.01);
	}
	@Test
	public void test2() {
		double res = HW_1_1_3.ff(-5,5,5);
		assertEquals(10, res, 0.01);
	}
	@Test
	public void test3() {
		double res = HW_1_1_3.ff(-5,-5,5);
		assertEquals(5, res, 0.01);
	}
	@Test
	public void test4() {
		double res = HW_1_1_3.ff(-5,-5,-5);
		assertEquals(0, res, 0.01);
	}
	@Test
	public void test5() {
		double res = HW_1_1_3.ff(5,-5,-5);
		assertEquals(5, res, 0.01);
	}
	@Test
	public void test6() {
		double res = HW_1_1_3.ff(5,5,-5);
		assertEquals(10, res, 0.01);
	}
	@Test
	public void test7() {
		double res = HW_1_1_3.ff(5,5,0);
		assertEquals(10, res, 0.01);
	}
}
