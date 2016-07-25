package HW1_Operator;
//import javax.swing.*;
public class HW_1_1_2 {

//	public static void main(String[] args) {
//		// Найти Если а - чётное посчитать а*б иначе а+б (сделано как понял сам)
//	double a,b;
//	String title="Результат расчета:";
//	String text="Формула расчета: ";
//	int type;
//	a=Double.parseDouble(JOptionPane.showInputDialog("Укажите A:"));
//	b=Double.parseDouble(JOptionPane.showInputDialog("Укажите B:"));
//	if (a!=0){ type=JOptionPane.PLAIN_MESSAGE;
//		if (a%2==0){text=text+a+"*"+b+"="+(a*b);}
//		else {text=text+a+"+"+b+"="+(a+b);}
//		}		
//	else{type=JOptionPane.ERROR_MESSAGE;
//	text=text+"некоректные вводные";}
//	JOptionPane.showMessageDialog(null,text,title,type);
	
	public static void main(String[] args) {
	// Найти Если а - чётное посчитать а*б иначе а+б (сделано после урока Вадима с классами)
		int a = 5;
		int b = 5;
		int res = ff(a,b);
		System.out.println(res);
	}
	public static int ff (int x, int y)
	{
			int ret;
			if (x%2==0)
				{ret=(x*y);}
			else 
				{ret=(x+y);}
			return ret;
		}		
	
		
	}