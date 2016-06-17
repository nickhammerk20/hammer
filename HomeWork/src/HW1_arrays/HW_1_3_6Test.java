package HW1_arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_3_6Test {

	@Test
	public void testfArrRevers01() {
		int[] arr={10,20,77,99,34,11};
		HW_1_3_6.fArrRevers (arr);
		int[] arrRev={11,34,99,77,20,10};
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrRevers02() {
		int[] arr={77,99,34,11};
		int[] arrRev={11,34,99,77};
		HW_1_3_6.fArrRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrRevers03() {
		int[] arr={77,20,99};
		int[] arrRev={99,20,77};
		HW_1_3_6.fArrRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrRevers04() {
		int[] arr={77,99};
		int[] arrRev={99,77};
		HW_1_3_6.fArrRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test
	public void testfArrRevers05() {
		int[] arr={99};
		int[] arrRev={99};
		HW_1_3_6.fArrRevers (arr);
		assertArrayEquals(arrRev, arr);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrRevers06() {
		int[] arr=null;
		HW_1_3_6.fArrRevers (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrRevers07() {
		int[] arr={};
		HW_1_3_6.fArrRevers (arr);
	}
	
	
	@Test
	public void testfArrKolNechetElement01() {
		int[] arr={10,20,77,99,34,11};
		int mm = HW_1_3_6.fArrKolNechetElement (arr);
		assertEquals(3, mm);
	}
	@Test
	public void testfArrKolNechetElement02() {
		int[] arr={77,99,34,11};
		int mm = HW_1_3_6.fArrKolNechetElement (arr);
		assertEquals(3, mm);
	}
	@Test
	public void testfArrKolNechetElement03() {
		int[] arr={77,20,99};
		int mm = HW_1_3_6.fArrKolNechetElement (arr);
		assertEquals(2, mm);
	}
	@Test
	public void testfArrKolNechetElement04() {
		int[] arr={77,99};
		int mm = HW_1_3_6.fArrKolNechetElement (arr);
		assertEquals(2, mm);
	}
	@Test
	public void testfArrKolNechetElement05() {
		int[] arr={99};
		int mm = HW_1_3_6.fArrKolNechetElement (arr);
		assertEquals(1, mm);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrKolNechetElement06() {
		int[] arr=null;
		HW_1_3_6.fArrKolNechetElement (arr);		
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfArrKolNechetElement07() {
		int[] arr={};
		HW_1_3_6.fArrKolNechetElement (arr);
	}
}
