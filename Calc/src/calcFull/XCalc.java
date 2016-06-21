package calcFull;

import javax.swing.JTextField;

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
		
	public static String fOper(String num) 
	{
		int num1 = 0;
		int oper = 0;
		String input = ""; 
		if (num == "=")
		{
			int a = Integer.parseInt(num);	
			int b = Integer.parseInt(input);	
			input = ("" + calc (a, b, oper));
		}
		else
		{
//			num1 = input;
//			oper = num;
			input = "";
		}		
		return input;
	}

	public static String fPress(String a, String actionCommand) {
		String res = a + actionCommand;
		System.out.println("input " + a + " num " + actionCommand + " res "+ res);
		return res;
	
	}

}
