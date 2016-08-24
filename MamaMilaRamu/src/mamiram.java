
public class mamiram 
{
	public static void main(String[] args)
	{
		String strIn = "Mama mila ramu";
		String[] str = strIn.split(" ");
		boolean[] visit = new boolean[str.length];
	}
		
		
		public void f(boolean[] visit, LList1 lst)
		{
			boolean  b = true;
//			if(visit == true)
			{
				
			}
			for(int i = 0; i < visit.length; i++)
			{
				if(visit[i] == false)
				{
					visit[i] = true;
					lst.addEnd(i);
					f(visit, lst);
					lst.delEnd();
					visit[i] = false;
				}
			}
		}
		
	}

