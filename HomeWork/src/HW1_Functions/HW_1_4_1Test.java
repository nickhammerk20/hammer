package HW1_Functions;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_4_1Test {

	@Test
	public void testfdayweek01() {
		String res = HW_1_4_1.fdayweek(1);
		assertEquals(res, "Понедельник");
	}
	@Test
	public void testfdayweek02() {
		String res = HW_1_4_1.fdayweek(2);
		assertEquals(res, "Вторник");
	}
	@Test
	public void testfdayweek03() {
		String res = HW_1_4_1.fdayweek(3);
		assertEquals(res, "Среда");
	}
	@Test
	public void testfdayweek04() {
		String res = HW_1_4_1.fdayweek(4);
		assertEquals(res, "Четверг");
	}
	@Test
	public void testfdayweek05() {
		String res = HW_1_4_1.fdayweek(5);
		assertEquals(res, "Пятница");
	}
	@Test
	public void testfdayweek06() {
		String res = HW_1_4_1.fdayweek(6);
		assertEquals(res, "Суббота");
	}
	@Test
	public void testfdayweek07() {
		String res = HW_1_4_1.fdayweek(7);
		assertEquals(res, "Воскресенье");
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdayweek08() {
		HW_1_4_1.fdayweek(0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdayweek09() {
		HW_1_4_1.fdayweek(-1);
	}
	@Test (expected=IllegalArgumentException.class)
	public void testfdayweek10() {
		HW_1_4_1.fdayweek(8);
	}
}
