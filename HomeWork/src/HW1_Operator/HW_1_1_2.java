package HW1_Operator;
//import javax.swing.*;
public class HW_1_1_2 {

//	public static void main(String[] args) {
//		// ����� ���� � - ������ ��������� �*� ����� �+� (������� ��� ����� ���)
//	double a,b;
//	String title="��������� �������:";
//	String text="������� �������: ";
//	int type;
//	a=Double.parseDouble(JOptionPane.showInputDialog("������� A:"));
//	b=Double.parseDouble(JOptionPane.showInputDialog("������� B:"));
//	if (a!=0){ type=JOptionPane.PLAIN_MESSAGE;
//		if (a%2==0){text=text+a+"*"+b+"="+(a*b);}
//		else {text=text+a+"+"+b+"="+(a+b);}
//		}		
//	else{type=JOptionPane.ERROR_MESSAGE;
//	text=text+"����������� �������";}
//	JOptionPane.showMessageDialog(null,text,title,type);
	
	public static void main(String[] args) {
	// ����� ���� � - ������ ��������� �*� ����� �+� (������� ����� ����� ������ � ��������)
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