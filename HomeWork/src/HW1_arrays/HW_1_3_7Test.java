package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_7Test {

	@Test
	public void testfArrHalfRevers01() {
		int[] arr={10,20,77,99,34,11};
		HW_1_3_7.fArrHalfRevers (arr);
		int[] arrRev={99,34,11,10,20,77};
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrHalfRevers02() {
		int[] arr={77,99,34,11};
		int[] arrRev={34,11,77,99};
		HW_1_3_7.fArrHalfRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testfArrHalfRevers03() {
		int[] arr={77,20,99};
		HW_1_3_7.fArrHalfRevers (arr);
	}
	@Test
	public void testfArrHalfRevers04() {
		int[] arr={77,99};
		int[] arrRev={99,77};
		HW_1_3_7.fArrHalfRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testfArrHalfRevers05() {
		int[] arr={99};
		HW_1_3_7.fArrHalfRevers (arr);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrHalfRevers06() {
		int[] arr=null;
		HW_1_3_7.fArrHalfRevers (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrRevers07() {
		int[] arr={};
		HW_1_3_7.fArrHalfRevers (arr);
	}
}
