import java.util.ArrayList;

public class Unlocker 
{
	int limit =4;
	ArrayList<ArrayList<Integer>> ways = new ArrayList<ArrayList<Integer>>();
	
	@Override
	public String toString() 
	{
		String str = "";
		for (ArrayList<Integer> ar : ways) 
		{
			for (Integer i : ar )
			{
				str += i+ ", ";				
			}
			str += "\n";
		}
		return str;
	}
	
	public void calc(Fridge fr)
	{
		try 
		{
			f( fr, 0);
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
	}	
	private void f(Fridge fr, int n) throws CloneNotSupportedException
	{
		if(n == limit)
		{
			return;
		}
		if(fr.check())
		{
			ways.add(fr.lst);
			return;
		}
		for (int i = 1; i < 16; i++) 
		{
			Fridge ff = (Fridge) fr.clone();
			ff.turn(i);
			f( ff, n+1);
		}
	}
}
