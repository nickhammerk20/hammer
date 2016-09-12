import java.util.ArrayList;

public class Field
{
	int[][] ar = null;

	public String toString() 
	{
		String str = "";

		for (int j = 0 ; j < ar.length; j++)
		{
			for (int i = 0; i < ar[0].length; i++) 
			{
				str += ar[j][i];
				if(i != ar[0].length-1)
					str += ",";
			}
			str +="\n";
		}
		return str;
	}

	public void init(int[][] ini)
	{
		if (ini == null)
			return;

		ar = new int[ini.length][ini[0].length];
		for (int j = 0 ; j < ini.length; j++)
		{
			for (int i = 0; i < ini[0].length; i++) 
			{
				ar[j][i] = ini[j][i];
			}
		}
	}
	public void clear()
	{
		ar = new int[0][0];
	}
	public int size()
	{
		return ar.length;
	}

	public int simple()
	{
		int count = 0;
		for (int j = 0 ; j < ar.length; j++)
		{
			for (int i = 0; i < ar[0].length; i++) 
			{
				if(ar[j][i] == 1)
				{
					if( j == 0 && i == 0 )
					{
						count++;
						continue;
					}
					else if ( j == 0 )
					{
						if( ar[j][i-1] == 0 )
							count++;
						continue;
					}
					else if ( i == 0 && ar[j-1][i] == 0)
					{
						if (ar[j-1][i] == 0 )
							count++;
						continue;
					}
					else if ( ar[j-1][i] == 0 && ar[j][i-1] == 0 && ar[j-1][i-1] == 0)
					{
						count++;
						continue;
					}
				}					
			}
		}		
		return count;		
	}

	public int arrayOfCheck()
	{
		boolean[][] arCheck = new boolean [ar.length][ar[0].length];
		return arrayOfCheckR(arCheck,0, 0);
	}
	private int arrayOfCheckR(boolean[][] arCheck, int j, int i)
	{
		System.out.println("новая рекурсия j="+j+" i="+i);

		if( j == ar.length )
			return 0;

		int count = 0;
		if(arCheck[j][i] != true && ar[j][i] == 0)
		{
			arCheck[j][i] = true;
			i++;
		}
		else if ( ar[j][i] == 1 )
		{
			arCheck[j][i] = true;
			count++;
			kill(arCheck,j, i);
			i++;			
		}

		if(i == ar[0].length)
		{
			i = 0;
			j++;
		}
		System.out.println(" j="+j + " i="+i);

		count += arrayOfCheckR(arCheck, j, i);

		return count;
	}	
	private void kill(boolean[][] arCheck,int j, int i)
	{
		killR(arCheck,j, i);
	}
	private void killR (boolean[][] arCheck,int j, int i)
	{
		System.out.println("=kill=");
	}
}
