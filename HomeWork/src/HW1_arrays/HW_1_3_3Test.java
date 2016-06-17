package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_3Test {

	@Test
	public void testArrMin01() {
		int[] arr={10,20,77,99,34,11};
		int mm = HW_1_3_3.fArrIndMin (arr);
		assertEquals(0, mm);
	}
	@Test
	public void testArrMin02() {
		int[] arr={77,99,34,11};
		int mm = HW_1_3_3.fArrIndMin (arr);
		assertEquals(3, mm);
	}
	@Test
	public void testArrMin03() {
		int[] arr={77,20,99};
		int mm = HW_1_3_3.fArrIndMin (arr);
		assertEquals(1, mm);
	}
	@Test
	public void testArrMin04() {
		int[] arr={77,99};
		int mm = HW_1_3_3.fArrIndMin (arr);
		assertEquals(0, mm);
	}
	@Test
	public void testArrMin05() {
		int[] arr={99};
		int mm = HW_1_3_3.fArrIndMin (arr);
		assertEquals(0, mm);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMin06() {
		int[] arr=null;
		HW_1_3_3.fArrIndMin (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMin07() {
		int[] arr={};
		HW_1_3_3.fArrIndMin (arr);
	}
}
