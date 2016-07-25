package HW1_Operator;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_1_2test {

	@Test
	public void test1() {
		int res=HW_1_1_2.ff(5,5);
		assertEquals(10, res);
	}

	@Test
	public void test4() {
		int res=HW_1_1_2.ff(6,6);
		assertEquals(36, res);
	}

}
//четное-четное
//четное-нечетное
//нечетное-нечетное
//нечетное-четное
//ноль-четное
//ноль-нечетное
//четное-ноль
//нечетное-ноль
//ноль-ноль
// + эксепшн