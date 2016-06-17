package HW1_Functions;
import static org.junit.Assert.*;

import org.junit.Test;

public class HW_1_4_2Test {

	@Test
	public void testChisloToPropis00() {
		String res = HW_1_4_2.fChisloToPropis(0);
		assertEquals(res, "����");
	}
	@Test
	public void testfChisloToPropis01() {
		String res = HW_1_4_2.fChisloToPropis(1);
		assertEquals(res, "����");
	}
	@Test
	public void testChisloToPropis02() {
		String res = HW_1_4_2.fChisloToPropis(2);
		assertEquals(res, "���");
	}
	@Test
	public void testChisloToPropis03() {
		String res = HW_1_4_2.fChisloToPropis(9);
		assertEquals(res, "������");
	}
	@Test
	public void testChisloToPropis04() {
		String res = HW_1_4_2.fChisloToPropis(10);
		assertEquals(res, "������");
	}
	@Test
	public void testChisloToPropis05() {
		String res = HW_1_4_2.fChisloToPropis(11);
		assertEquals(res, "�����������");
	}
	@Test
	public void testChisloToPropis06() {
		String res = HW_1_4_2.fChisloToPropis(15);
		assertEquals(res, "�����������");
	}
	@Test
	public void testChisloToPropis07() {
		String res = HW_1_4_2.fChisloToPropis(19);
		assertEquals(res, "�������������");
	}
	@Test
	public void testChisloToPropis08() {
		String res = HW_1_4_2.fChisloToPropis(20);
		assertEquals(res, "��������");
	}
	@Test
	public void testChisloToPropis10() {
		String res = HW_1_4_2.fChisloToPropis(29);
		assertEquals(res, "�������� ������");
	}
	@Test
	public void testChisloToPropis11() {
		String res = HW_1_4_2.fChisloToPropis(30);
		assertEquals(res, "��������");
	}@Test
	public void testChisloToPropis12() {
		String res = HW_1_4_2.fChisloToPropis(31);
		assertEquals(res, "�������� ����");
	}@Test
	public void testChisloToPropis13() {
		String res = HW_1_4_2.fChisloToPropis(50);
		assertEquals(res, "���������");
	}@Test
	public void testChisloToPropis14() {
		String res = HW_1_4_2.fChisloToPropis(91);
		assertEquals(res, "��������� ����");
	}@Test
	public void testChisloToPropis15() {
		String res = HW_1_4_2.fChisloToPropis(99);
		assertEquals(res, "��������� ������");
	}
	@Test
	public void testChisloToPropis16() {
		String res = HW_1_4_2.fChisloToPropis(100);
		assertEquals(res, "���");
	}@Test
	public void testChisloToPropis17() {
		String res = HW_1_4_2.fChisloToPropis(101);
		assertEquals(res, "��� ����");
	}@Test
	public void testChisloToPropis18() {
		String res = HW_1_4_2.fChisloToPropis(105);
		assertEquals(res, "��� ����");
	}@Test
	public void testChisloToPropis19() {
		String res = HW_1_4_2.fChisloToPropis(110);
		assertEquals(res, "��� ������");
	}@Test
	public void testChisloToPropis20() {
		String res = HW_1_4_2.fChisloToPropis(111);
		assertEquals(res, "��� �����������");
	}@Test
	public void testChisloToPropis21() {
		String res = HW_1_4_2.fChisloToPropis(115);
		assertEquals(res, "��� �����������");
	}
	@Test
	public void testChisloToPropis22() {
		String res = HW_1_4_2.fChisloToPropis(120);
		assertEquals(res, "��� ��������");
	}
	@Test
	public void testChisloToPropis23() {
		String res = HW_1_4_2.fChisloToPropis(125);
		assertEquals(res, "��� �������� ����");
	}
	@Test
	public void testChisloToPropis24() {
		String res = HW_1_4_2.fChisloToPropis(173);
		assertEquals(res, "��� ��������� ���");
	}
	@Test
	public void testChisloToPropis25() {
		String res = HW_1_4_2.fChisloToPropis(199);
		assertEquals(res, "��� ��������� ������");
	}
	@Test
	public void testChisloToPropis26() {
		String res = HW_1_4_2.fChisloToPropis(500);
		assertEquals(res, "�������");
	}
	@Test
	public void testChisloToPropis27() {
		String res = HW_1_4_2.fChisloToPropis(555);
		assertEquals(res, "������� ��������� ����");
	}
	@Test
	public void testChisloToPropis28() {
		String res = HW_1_4_2.fChisloToPropis(579);
		assertEquals(res, "������� ��������� ������");
	}
	@Test
	public void testChisloToPropis29() {
		String res = HW_1_4_2.fChisloToPropis(590);
		assertEquals(res, "������� ���������");
	}
	@Test
	public void testChisloToPropis30() {
		String res = HW_1_4_2.fChisloToPropis(601);
		assertEquals(res, "�������� ����");
	}
	@Test
	public void testChisloToPropis31() {
		String res = HW_1_4_2.fChisloToPropis(900);
		assertEquals(res, "���������");
	}
	@Test
	public void testChisloToPropis32() {
		String res = HW_1_4_2.fChisloToPropis(950);
		assertEquals(res, "��������� ���������");
	}
	@Test
	public void testChisloToPropis33() {
		String res = HW_1_4_2.fChisloToPropis(971);
		assertEquals(res, "��������� ��������� ����");
	}
	@Test
	public void testChisloToPropis34() {
		String res = HW_1_4_2.fChisloToPropis(989);
		assertEquals(res, "��������� ����������� ������");
	}
	@Test
	public void testChisloToPropis35() {
		String res = HW_1_4_2.fChisloToPropis(999);
		assertEquals(res, "��������� ��������� ������");
	}
	@Test
	public void testChisloToPropis36() {
		String res = HW_1_4_2.fChisloToPropis(998);
		assertEquals(res, "��������� ��������� ������");
	}
	@Test
	public void testChisloToPropis37() {
		String res = HW_1_4_2.fChisloToPropis(918);
		assertEquals(res, "��������� �������������");
	}
}
