import java.util.ArrayList;

public class MMR 
{
	String[] strs = null;
	
	public void init(String str)
	{
		strs = str.split(" ");
	}
	public void print()
	{
		f(0, new boolean[strs.length], new ArrayList<Integer>());		
	}
	private void f(int n, boolean[] visit,ArrayList<Integer> lst)
	{
		if(n==strs.length)
		{
			printAll(lst);
			return;
		}
		for(int i =0; i<visit.length; i++)
		{
			if(visit[i] == false)
			{
				visit[i]=true;
				lst.add(i);
				f(n+1, visit, lst);
				lst.remove(lst.size()-1);
				visit[i]=false;
			}
			
		}
	}
	private void printAll(ArrayList<Integer> lst)
	{
		for(Integer i : lst)
		{
			System.out.print(strs[i]+ " ");
		}
		System.out.println();
	}

}
