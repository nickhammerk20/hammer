package HW1_Operator;
//import javax.swing.JOptionPane;
//public class HW_1_1_4 {
//
//	public static void main(String[] args) {
//		//��������� ���������   ����(�*�*�, �+�+�)+3 
//		double a,b,c;
//		String title="�����:";
//		String text="���������: ";
//		int type;
//		a=Double.parseDouble(JOptionPane.showInputDialog("������� �:"));
//		b=Double.parseDouble(JOptionPane.showInputDialog("������� �:"));
//		c=Double.parseDouble(JOptionPane.showInputDialog("������� �:"));
//		type=JOptionPane.PLAIN_MESSAGE;   
//		if((a+b+c)<=(a*b*c)){text=text+((a*b*c)+3);}
//		if((a+b+c)>=(a*b*c)){text=text+((a+b+c)+3);}
//		JOptionPane.showMessageDialog(null,text,title,type);
//		
//	}
//
//}
public class HW_1_1_4 {
	public static void main(String[] args){
		double a=5;
		double b=5;
		double c=5;
		double res=ff(a,b,c);
		System.out.println(res);		
	}
	public static double ff(double x, double y, double z){
		double res=0;
			if((x+y+z)<=(x*y*z)){
				res=((x*y*z)+3);}
			if((x+y+z)>=(x*y*z)){
				res=((x+y+z)+3);}
		return res;
	}
}