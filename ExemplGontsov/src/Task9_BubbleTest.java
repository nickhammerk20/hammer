import static org.junit.Assert.*;

import org.junit.Test;

public class Task9_BubbleTest 
{
	@Test
	public void testBubble_many() 
	{
		int[] ar = {10,20,34,11,99,77};
		Task9_Bubble.Bubble(ar);
		int[] exp = {10,11,20,34,77,99};
		assertArrayEquals(exp, ar);
	}
	@Test
	public void testBubble_2() 
	{
		int[] ar = {20,10};
		Task9_Bubble.Bubble(ar);
		int[] exp = {10,20};
		assertArrayEquals(exp, ar);
	}

	@Test
	public void testBubble_1() 
	{
		int[] ar = {10};
		Task9_Bubble.Bubble(ar);
		int[] exp = {10};
		assertArrayEquals(exp, ar);
	}

	@Test
	public void testBubble_0() 
	{
		int[] ar = {};
		Task9_Bubble.Bubble(ar);
		int[] exp = {};
		assertArrayEquals(exp, ar);
	}

	@Test
	public void testBubble_null() 
	{
		int[] ar = null;
		Task9_Bubble.Bubble(ar);
		int[] exp = null;
		assertArrayEquals(exp, ar);
	}


}
