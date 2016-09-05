package calcFull;

import javax.swing.JTextField;

public class XCalc {

	private static int number1;
	private static char operator; 

	public static int calc(int a, int b, char op)
	{
		int res = 123456789;
		switch (op)
		{
		case '+': res = a + b;	break;
		case '-': res = a - b;	break;
		case '*': res = a * b; 	break;
		case '/': res = a / b; 	break;
		}
		number1 = 0;
		operator = ' ';
		return res;
	}

	public static String fOper(String num, String oper) 
	{
		String ret = ""; 
		if (oper == "=")
		{
			int b = Integer.parseInt(num);	
			ret = ("" + calc (number1, b, operator));
		}
		else
		{
			number1 = Integer.parseInt(num);
			operator = oper.charAt(0);;
			ret = "";
		}		
		return ret;
	}

	public static String fPress(String a, String actionCommand) {
		String res = a + actionCommand;
		return res;

	}

}
