package HW2_Zlatopolskii;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_2_Zlatopolskii_4_20Test {

	@Test
	public void testfdelenieMnaN00() {
		String res = HW_2_Zlatopolskii_4_20.fdelenieMnaN(11, 2);
		assertEquals(res, "11 на 2 нацело не делится");
	}
	@Test
	public void testfdelenieMnaN01() {
		String res = HW_2_Zlatopolskii_4_20.fdelenieMnaN(10, 2);
		assertEquals(res, "частное от деления 5");
	}
	@Test
	public void testfdelenieMnaN02() {
		String res = HW_2_Zlatopolskii_4_20.fdelenieMnaN(10, -2);
		assertEquals(res, "частное от деления -5");
	}
	@Test
	public void testfdelenieMnaN03() {
		String res = HW_2_Zlatopolskii_4_20.fdelenieMnaN(11, -2);
		assertEquals(res, "11 на -2 нацело не делится");
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN04() {
		HW_2_Zlatopolskii_4_20.fdelenieMnaN(11, 0);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN05() {
		HW_2_Zlatopolskii_4_20.fdelenieMnaN(0, 0);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdelenieMnaN06() {
		HW_2_Zlatopolskii_4_20.fdelenieMnaN(0, 2);
		
	}

}
