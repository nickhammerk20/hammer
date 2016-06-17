package HW1_Functions;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_4_4Test {

	@Test
	public void testfDlinaAB01() {
		double res = HW_1_4_4.fDlinaAB(5.0,5.0,0.0,0.0);
		assertEquals(7.071, res, 0.001);
	}
	@Test
	public void testfDlinaAB02() {
		double res = HW_1_4_4.fDlinaAB(5.0,5.0,0.0,-5.0);
		assertEquals(11.180, res, 0.001);
	}
	@Test
	public void testfDlinaAB03() {
		double res = HW_1_4_4.fDlinaAB(5.0,5.0,-5.0,-5.0);
		assertEquals(14.142, res, 0.001);
	}
	@Test
	public void testfDlinaAB04() {
		double res = HW_1_4_4.fDlinaAB(5.0,0.0,5.0,5.0);
		assertEquals(5.000, res, 0.001);
	}
	@Test
	public void testfDlinaAB05() {
		double res = HW_1_4_4.fDlinaAB(0.0,0.0,5.0,5.0);
		assertEquals(7.071, res, 0.001);
	}
	@Test
	public void testfDlinaAB06() {
		double res = HW_1_4_4.fDlinaAB(-5.0,5.0,5.0,5.0);
		assertEquals(10.000, res, 0.001);
	}
	@Test
	public void testfDlinaAB07() {
		double res = HW_1_4_4.fDlinaAB(-5.0,-5.0,5.0,5.0);
		assertEquals(14.142, res, 0.001);
	}
	@Test
	public void testfDlinaAB08() {
		double res = HW_1_4_4.fDlinaAB(0.0,0.0,0.0,0.0);
		assertEquals(0.000, res, 0.001);
	}
	@Test
	public void testfDlinaAB09() {
		double res = HW_1_4_4.fDlinaAB(-5.0,-5.0,-3.0,-3.0);
		assertEquals(2.828, res, 0.001);
	}

}
