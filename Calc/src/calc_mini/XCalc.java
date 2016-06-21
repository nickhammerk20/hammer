package calc_mini;

public class XCalc {

	public static int calc(int a, int b, int op)
	{
		int res = 555;
		switch (op)
		{
			case '+': res = a + b;	break;
			case '-': res = a - b;	break;
			case '*': res = a * b; 	break;
			case '/': res = a / b; 	break;
		}
		return res;
	}

}
