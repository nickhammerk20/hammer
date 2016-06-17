package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_1Test {

	@Test
	public void testArrMin01() {
		int[] arr={10,20,77,99,34,11};
		int mm = HW_1_3_1.fArrMin (arr);
		assertEquals(10, mm);
	}
	@Test
	public void testArrMin02() {
		int[] arr={77,99,34,11};
		int mm = HW_1_3_1.fArrMin (arr);
		assertEquals(11, mm);
	}
	@Test
	public void testArrMin03() {
		int[] arr={20,77,99};
		int mm = HW_1_3_1.fArrMin (arr);
		assertEquals(20, mm);
	}
	@Test
	public void testArrMin04() {
		int[] arr={77,99};
		int mm = HW_1_3_1.fArrMin (arr);
		assertEquals(77, mm);
	}
	@Test
	public void testArrMin05() {
		int[] arr={99};
		int mm = HW_1_3_1.fArrMin (arr);
		assertEquals(99, mm);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMin06() {
		int[] arr=null;
		HW_1_3_1.fArrMin (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrMin07() {
		int[] arr={};
		HW_1_3_1.fArrMin (arr);
	}
}
