package HW1_Operator;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_1_1test {

	@Test
	public void test1() {
		int res=HW_1_1_1.ff(1,1);
		assertEquals(1, res);
	}

	@Test
	public void test4() {
		int res=HW_1_1_1.ff(1,-1);
		assertEquals(4, res);
	}
	@Test
	public void test3() {
		int res=HW_1_1_1.ff(-1,-1);
		assertEquals(3, res);
	}
	@Test
	public void test2() {
		int res=HW_1_1_1.ff(-1,1);
		assertEquals(2, res);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test01() {
		HW_1_1_1.ff(0,1);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test10() {
		HW_1_1_1.ff(1,0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void test00() {
		HW_1_1_1.ff(0,0);
	}
}
