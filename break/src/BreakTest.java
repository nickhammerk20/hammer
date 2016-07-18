
public class BreakTest 
{
	public static void main(String[] args) 
	{
		String str = "";

		outer: for(int i = 1; i <= 50; i++ )
		{

			System.out.println(str);
			str = "";
			for(int j = 1; j <= 50; j++ )
			{
				str +=j+",";
				if( i >= 5)
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
