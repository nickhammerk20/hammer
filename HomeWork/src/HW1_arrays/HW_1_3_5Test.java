package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_5Test {

	@Test
	public void testArrSumNechetIndex01() {
		int[] arr={10,20,77,99,34,11};
		int mm = HW_1_3_5.fArrSumNechetIndex (arr);
		assertEquals(130, mm);
	}
	@Test
	public void testArrSumNechetIndex02() {
		int[] arr={77,99,34,11};
		int mm = HW_1_3_5.fArrSumNechetIndex (arr);
		assertEquals(110, mm);
	}
	@Test
	public void testArrSumNechetIndex03() {
		int[] arr={77,20,99};
		int mm = HW_1_3_5.fArrSumNechetIndex (arr);
		assertEquals(20, mm);
	}
	@Test
	public void testArrSumNechetIndex04() {
		int[] arr={77,99};
		int mm = HW_1_3_5.fArrSumNechetIndex (arr);
		assertEquals(99, mm);
	}
	@Test
	public void testArrSumNechetIndex05() {
		int[] arr={99};
		int mm = HW_1_3_5.fArrSumNechetIndex (arr);
		assertEquals(0, mm);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrSumNechetIndex06() {
		int[] arr=null;
		HW_1_3_5.fArrSumNechetIndex (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testArrSumNechetIndex07() {
		int[] arr={};
		HW_1_3_5.fArrSumNechetIndex (arr);
	}
}
