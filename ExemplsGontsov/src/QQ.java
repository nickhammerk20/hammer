//sdfsdfsdfsdfdsf
public class QQ 
{
	public static void main(String[] args)
	{
		int ret = quater(1, 0);
		System.out.println(ret);
	}
	
	public static int quater_1(int x, int y)
	{
		if(x==0 || y==0)
			throw new IllegalArgumentException();
		
		int res = 0;
		
		if(x > 0 && y > 0)
		{
			res = 1;
		}
		else if(x < 0 && y > 0)
		{
			res = 2;
		}
		if(x < 0 && y < 0)
		{
			res = 3;
		}
		if(x > 0 && y < 0)
		{
			res = 4;
		}
		
		return res;
	}
	
	public static int quater_2(int x, int y)
	{
		if(x==0 || y==0)
			throw new IllegalArgumentException();
		
		int res = 0;
		
		if(x > 0)
		{
			res = (y > 0) ? 1 : 4;
		}
		else
		{
			res = (y > 0) ? 2 : 3;
		}
		
		return res;
	}
	
	public static int quater(int x, int y)
	{
		if(x==0 || y==0)
			throw new IllegalArgumentException();
		
		return (x > 0) ? ((y > 0) ? 1 : 4) : ((y > 0) ? 2 : 3);
	}
}
