package HW2_Zlatopolskii;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_2_Zlatopolskii_4_28Test {

	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbiga001() {
		HW_2_Zlatopolskii_4_28.fwhatbiga (0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbiga002() {
		HW_2_Zlatopolskii_4_28.fwhatbiga (434);
	}
	@Test
	public void testfwhatbiga02() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbiga (123);
		assertEquals(res, "последн¤¤");
	}
	@Test
	public void testfwhatbiga03() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbiga (321);
		assertEquals(res, "перва¤");
	}
	@Test
	public void testfwhatbiga04() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbiga (351);
		assertEquals(res, "перва¤");
	}
	@Test
	public void testfwhatbiga05() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbiga (153);
		assertEquals(res, "последн¤¤");
	}
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbigb001() {
		HW_2_Zlatopolskii_4_28.fwhatbigb (0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbigb002() {
		HW_2_Zlatopolskii_4_28.fwhatbigb (443);
	}
	@Test
	public void testfwhatbigb02() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigb (123);
		assertEquals(res, "втора¤");
	}
	@Test
	public void testfwhatbigb03() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigb (321);
		assertEquals(res, "перва¤");
	}
	@Test
	public void testfwhatbigb04() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigb (315);
		assertEquals(res, "перва¤");
	}
	@Test
	public void testfwhatbigb05() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigb (135);
		assertEquals(res, "втора¤");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbigc001() {
		HW_2_Zlatopolskii_4_28.fwhatbigb (0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfwhatbigc002() {
		HW_2_Zlatopolskii_4_28.fwhatbigc (344);
	}
	@Test
	public void testfwhatbigc02() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigc (132);
		assertEquals(res, "втора¤");
	}
	@Test
	public void testfwhatbigc03() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigc (312);
		assertEquals(res, "последн¤¤");
	}
	@Test
	public void testfwhatbigc04() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigc (531);
		assertEquals(res, "втора¤");
	}
	@Test
	public void testfwhatbigc05() {
		String res = HW_2_Zlatopolskii_4_28.fwhatbigc (513);
		assertEquals(res, "последн¤¤");
	}
}