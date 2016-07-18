
public class BreakTest3 
{
	public static void main(String[] args) 
	{
		String str = "a";
						
		source:
		switch(str) 
		{
	    case "a": 
		    System.out.println("a+++++");
			break source;
		case "b": 
			System.out.println("b++++++");
			break;
		case "c": 
			System.out.println("c+++++++");
			break;
		default: 
			System.out.println("def");
		    break;
	}
	}
}