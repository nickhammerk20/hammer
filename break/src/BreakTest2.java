
public class BreakTest2 
{
	public static void main(String[] args) 
	{
		String str = "";
		int i = 0;
		outer: 
			while (i != 20){
				i++;
				System.out.println(str);
				str = "";
				for(int j = 1; j <= 50; j++ )
				{
					str +=j+",";
					if( i >= 0)
					{
						if (j >= i)
							continue outer;
					}
				}
				if (i == 20)
				{
					break;
				}
			}

	}
}