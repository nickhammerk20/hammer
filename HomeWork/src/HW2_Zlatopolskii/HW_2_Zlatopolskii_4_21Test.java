package HW2_Zlatopolskii;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_2_Zlatopolskii_4_21Test {

	@Test
	public void testfdelenieMnaN00() {
		boolean res = HW_2_Zlatopolskii_4_21.fAdelitelB(11, 2);
		assertEquals(res, false);
	}
	@Test
	public void testfdelenieMnaN01() {
		boolean res = HW_2_Zlatopolskii_4_21.fAdelitelB(10, 2);
		assertEquals(res, true);
	}
	@Test
	public void testfdelenieMnaN02() {
		boolean res = HW_2_Zlatopolskii_4_21.fAdelitelB(10, -2);
		assertEquals(res, true);
	}
	@Test
	public void testfdelenieMnaN03() {
		boolean res = HW_2_Zlatopolskii_4_21.fAdelitelB(11, -2);
		assertEquals(res, false);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN04() {
		HW_2_Zlatopolskii_4_21.fAdelitelB(11, 0);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN05() {
		HW_2_Zlatopolskii_4_21.fAdelitelB(0, 0);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN06() {
		HW_2_Zlatopolskii_4_21.fAdelitelB(0, 2);
		
	}

}
