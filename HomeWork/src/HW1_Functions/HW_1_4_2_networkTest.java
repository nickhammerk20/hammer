package HW1_Functions;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_4_2_networkTest {

	@Test
	public void testChisloToPropis00() {
		String res = HW_1_4_2_network.digits2Text(0.0);
		assertEquals(res, "ноль");
	}
	@Test
	public void testfChisloToPropis01() {
		String res = HW_1_4_2_network.digits2Text(1.0);
		assertEquals(res, "один");
	}
	@Test
	public void testChisloToPropis02() {
		String res = HW_1_4_2_network.digits2Text(2.0);
		assertEquals(res, "два");
	}
	@Test
	public void testChisloToPropis03() {
		String res = HW_1_4_2_network.digits2Text(9.0);
		assertEquals(res, "девять");
	}
	@Test
	public void testChisloToPropis04() {
		String res = HW_1_4_2_network.digits2Text(10.0);
		assertEquals(res, "десять ");
	}
	@Test
	public void testChisloToPropis05() {
		String res = HW_1_4_2_network.digits2Text(11.0);
		assertEquals(res, "одиннадцать ");
	}
	@Test
	public void testChisloToPropis06() {
		String res = HW_1_4_2_network.digits2Text(15.0);
		assertEquals(res, "пятьнадцать");
	}
	@Test
	public void testChisloToPropis07() {
		String res = HW_1_4_2_network.digits2Text(19.0);
		assertEquals(res, "девятьнадцать");
	}
	@Test
	public void testChisloToPropis08() {
		String res = HW_1_4_2_network.digits2Text(20.0);
		assertEquals(res, "двадцать ");
	}
	@Test
	public void testChisloToPropis10() {
		String res = HW_1_4_2_network.digits2Text(29.0);
		assertEquals(res, "двадцать девять");
	}
	@Test
	public void testChisloToPropis11() {
		String res = HW_1_4_2_network.digits2Text(30.0);
		assertEquals(res, "тридцать ");
	}@Test
	public void testChisloToPropis12() {
		String res = HW_1_4_2_network.digits2Text(31.0);
		assertEquals(res, "тридцать один");
	}@Test
	public void testChisloToPropis13() {
		String res = HW_1_4_2_network.digits2Text(50.0);
		assertEquals(res, "пятьдесят ");
	}@Test
	public void testChisloToPropis14() {
		String res = HW_1_4_2_network.digits2Text(91.0);
		assertEquals(res, "девяносто один");
	}@Test
	public void testChisloToPropis15() {
		String res = HW_1_4_2_network.digits2Text(99.0);
		assertEquals(res, "девяносто девять");
	}
	@Test
	public void testChisloToPropis16() {
		String res = HW_1_4_2_network.digits2Text(100.0);
		assertEquals(res, "сто ");
	}@Test
	public void testChisloToPropis17() {
		String res = HW_1_4_2_network.digits2Text(101.0);
		assertEquals(res, "сто один");
	}@Test
	public void testChisloToPropis18() {
		String res = HW_1_4_2_network.digits2Text(105.0);
		assertEquals(res, "сто пять");
	}@Test
	public void testChisloToPropis19() {
		String res = HW_1_4_2_network.digits2Text(110.0);
		assertEquals(res, "сто десять ");
	}@Test
	public void testChisloToPropis20() {
		String res = HW_1_4_2_network.digits2Text(111.0);
		assertEquals(res, "сто одинадцать ");
	}@Test
	public void testChisloToPropis21() {
		String res = HW_1_4_2_network.digits2Text(115.0);
		assertEquals(res, "сто пятнадцать ");
	}
	@Test
	public void testChisloToPropis22() {
		String res = HW_1_4_2_network.digits2Text(120.0);
		assertEquals(res, "сто двадцать ");
	}
	@Test
	public void testChisloToPropis23() {
		String res = HW_1_4_2_network.digits2Text(125.0);
		assertEquals(res, "сто двадцать пять");
	}
	@Test
	public void testChisloToPropis24() {
		String res = HW_1_4_2_network.digits2Text(173.0);
		assertEquals(res, "сто семьдесят три");
	}
	@Test
	public void testChisloToPropis25() {
		String res = HW_1_4_2_network.digits2Text(199.0);
		assertEquals(res, "сто девяносто девять");
	}
	@Test
	public void testChisloToPropis26() {
		String res = HW_1_4_2_network.digits2Text(500.0);
		assertEquals(res, "пятьсот ");
	}
	@Test
	public void testChisloToPropis27() {
		String res = HW_1_4_2_network.digits2Text(555.0);
		assertEquals(res, "пятьсот пятьдесят пять");
	}
	@Test
	public void testChisloToPropis28() {
		String res = HW_1_4_2_network.digits2Text(579.0);
		assertEquals(res, "пятьсот семьдесят девять");
	}
	@Test
	public void testChisloToPropis29() {
		String res = HW_1_4_2_network.digits2Text(590.0);
		assertEquals(res, "пятьсот девяносто ");
	}
	@Test
	public void testChisloToPropis30() {
		String res = HW_1_4_2_network.digits2Text(601.0);
		assertEquals(res, "шестьсот один");
	}
	@Test
	public void testChisloToPropis31() {
		String res = HW_1_4_2_network.digits2Text(900.0);
		assertEquals(res, "девятьсот ");
	}
	@Test
	public void testChisloToPropis32() {
		String res = HW_1_4_2_network.digits2Text(950.0);
		assertEquals(res, "девятьсот пятьдесят ");
	}
	@Test
	public void testChisloToPropis33() {
		String res = HW_1_4_2_network.digits2Text(971.0);
		assertEquals(res, "девятьсот семьдесят один");
	}
	@Test
	public void testChisloToPropis34() {
		String res = HW_1_4_2_network.digits2Text(989.0);
		assertEquals(res, "девятьсот восемьдесят девять");
	}
	@Test
	public void testChisloToPropis35() {
		String res = HW_1_4_2_network.digits2Text(999.0);
		assertEquals(res, "девятьсот девяносто девять");
	}
	@Test
	public void testChisloToPropis36() {
		String res = HW_1_4_2_network.digits2Text(998.0);
		assertEquals(res, "девятьсот девяносто восемь");
	}
	@Test
	public void testChisloToPropis37() {
		String res = HW_1_4_2_network.digits2Text(918.0);
		assertEquals(res, "девятьсот восемьнадцать ");
	}
}
