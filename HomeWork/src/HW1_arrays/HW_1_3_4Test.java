package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_4Test {

	@Test
	public void testArrMax01() {
		int[] arr={10,20,77,99,34,11};
		int mm = HW_1_3_4.fArrIndMax (arr);
		assertEquals(3, mm);
	}
	@Test
	public void testArrMax02() {
		int[] arr={77,99,34,11};
		int mm = HW_1_3_4.fArrIndMax (arr);
		assertEquals(1, mm);
	}
	@Test
	public void testArrMax03() {
		int[] arr={77,20,99};
		int mm = HW_1_3_4.fArrIndMax (arr);
		assertEquals(2, mm);
	}
	@Test
	public void testArrMax04() {
		int[] arr={77,99};
		int mm = HW_1_3_4.fArrIndMax (arr);
		assertEquals(1, mm);
	}
	@Test
	public void testArrMax05() {
		int[] arr={99};
		int mm = HW_1_3_4.fArrIndMax (arr);
		assertEquals(0, mm);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMax06() {
		int[] arr=null;
		HW_1_3_4.fArrIndMax (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMax07() {
		int[] arr={};
		HW_1_3_4.fArrIndMax (arr);
	}
}
