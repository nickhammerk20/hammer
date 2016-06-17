package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_8Test {

	@Test
	public void testfArrSortBubble01() {
		int[] arr={10,20,77,99,34,11};
		HW_1_3_8.fArrSortBubble (arr);
		int[] arrRev={10,11,20,34,77,99};
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortBubble02() {
		int[] arr={77,99,34,11};
		int[] arrRev={11,34,77,99};
		HW_1_3_8.fArrSortBubble (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortBubble03() {
		int[] arr={77,20,99};
		int[] arrRev={20,77,99};
		HW_1_3_8.fArrSortBubble (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortBubble04() {
		int[] arr={77,99};
		int[] arrRev={77,99};
		HW_1_3_8.fArrSortBubble (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortBubble041() {
			int[] arr={99,77};
			int[] arrRev={77,99};
			HW_1_3_8.fArrSortBubble (arr);
			assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortBubble05() {
		int[] arr={99};
		int[] arrRev={99};
		HW_1_3_8.fArrSortBubble (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortBubble06() {
		int[] arr=null;
		HW_1_3_8.fArrSortBubble (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortBubble07() {
		int[] arr={};
		HW_1_3_8.fArrSortBubble (arr);
	}

	
	
	public void testfArrSortSelect01() {
		int[] arr={10,20,77,99,34,11};
		HW_1_3_8.fArrSortSelect (arr);
		int[] arrRev={10,11,20,34,77,99};
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortSelect02() {
		int[] arr={77,99,34,11};
		int[] arrRev={11,34,77,99};
		HW_1_3_8.fArrSortSelect (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortSelect03() {
		int[] arr={77,20,99};
		int[] arrRev={20,77,99};
		HW_1_3_8.fArrSortSelect (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortSelect04() {
		int[] arr={77,99};
		int[] arrRev={77,99};
		HW_1_3_8.fArrSortSelect (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortSelect041() {
			int[] arr={99,77};
			int[] arrRev={77,99};
			HW_1_3_8.fArrSortSelect (arr);
			assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortSelect05() {
		int[] arr={99};
		int[] arrRev={99};
		HW_1_3_8.fArrSortSelect (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortSelect06() {
		int[] arr=null;
		HW_1_3_8.fArrSortSelect (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortSelect07() {
		int[] arr={};
		HW_1_3_8.fArrSortSelect (arr);
	}

	
	

	public void testfArrSortInsert01() {
		int[] arr={10,20,77,99,34,11};
		HW_1_3_8.fArrSortInsert (arr);
		int[] arrRev={10,11,20,34,77,99};
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortInsert02() {
		int[] arr={77,99,34,11};
		int[] arrRev={11,34,77,99};
		HW_1_3_8.fArrSortInsert (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortInsert03() {
		int[] arr={77,20,99};
		int[] arrRev={20,77,99};
		HW_1_3_8.fArrSortInsert (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortInsert04() {
		int[] arr={77,99};
		int[] arrRev={77,99};
		HW_1_3_8.fArrSortInsert (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortInsert041() {
			int[] arr={99,77};
			int[] arrRev={77,99};
			HW_1_3_8.fArrSortInsert (arr);
			assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrSortInsert05() {
		int[] arr={99};
		int[] arrRev={99};
		HW_1_3_8.fArrSortInsert (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortInsert06() {
		int[] arr=null;
		HW_1_3_8.fArrSortInsert (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrSortInsert07() {
		int[] arr={};
		HW_1_3_8.fArrSortInsert (arr);
	}

}
