import static org.junit.Assert.*;

import org.junit.Test;

public class QQTest
{
	@Test
	public void testQuater_1() 
	{
		int ret = QQ.quater(1, 3);
		assertEquals(1, ret);
	}
	@Test
	public void testQuater_2() 
	{
		int ret = QQ.quater(-1, 3);
		assertEquals(2, ret);
	}
	@Test
	public void testQuater_3() 
	{
		int ret = QQ.quater(-3, -3);
		assertEquals(3, ret);
	}
	@Test
	public void testQuater_4() 
	{
		int ret = QQ.quater(2, -4);
		assertEquals(4, ret);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testQuater_10_Ex() 
	{
		QQ.quater(1, 0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testQuater_08_Ex() 
	{
		QQ.quater(0, 8);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testQuater_00_Ex() 
	{
		QQ.quater(0, 0);
	}
}
