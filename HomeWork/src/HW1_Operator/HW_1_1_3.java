package HW1_Operator;
//import javax.swing.*;
//public class HW_1_1_3 {
//
//	public static void main(String[] args) {
//		//����� ������ ������������� �� ���� �����
//		double a,b,c;
//		String title="�����:";
//		String text="����� ������ ������������� �����: ";
//		int type;
//		a=Double.parseDouble(JOptionPane.showInputDialog("������� ������ �����:"));
//		b=Double.parseDouble(JOptionPane.showInputDialog("������� ������ �����:"));
//		c=Double.parseDouble(JOptionPane.showInputDialog("������� ������ �����:"));
//		type=JOptionPane.PLAIN_MESSAGE;
//		if(a<=0){a=0;}
//		if(b<=0){b=0;}
//		if(c<=0){c=0;}
//		text=text+(a+b+c);
//		JOptionPane.showMessageDialog(null,text,title,type);
//		
//	}
//
//}
public class HW_1_1_3 {
	public static void main(String[] args){
		double a = 10, b= -10, c = 10;
		double res=ff(a,b,c);
		System.out.println(res);
	}
	public static double ff(double x, double y, double z)
	{
		double res;
		if(x<=0){x=0;}
		if(y<=0){y=0;}
		if(z<=0){z=0;}
		res=(x+y+z);
		return res;
	}
}