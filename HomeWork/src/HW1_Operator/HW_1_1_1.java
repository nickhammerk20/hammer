package HW1_Operator;
//import javax.swing.*;
//public class HW_1_1_1 {
//	public static void main(String[] args){
//		// ���������� ����� �������� ����������� ����� � ���������� (�,�)
//	double x, y;
//	String title="����������� ��������";
//	String text="���������� ���������";
//	int type;
//	x=Double.parseDouble(JOptionPane.showInputDialog("���������� � ="));
//	y=Double.parseDouble(JOptionPane.showInputDialog("���������� � ="));
//	if ((x!=0)&(y!=0)){ type=JOptionPane.PLAIN_MESSAGE;// ���������, �������� ������� ������ ��������� ��� ����� ��������� ((x!=0)&(y!=0))
//		if ((x>=0)&(y>=0)){text=text+" � ������ ��������!";}
//		if ((x<=0)&(y>=0)){text=text+" �� ������ ��������!";}
//		if ((x<=0)&(y<=0)){text=text+" � ������� ��������!";}
//		if ((x>=0)&(y<=0)){text=text+" � �������� ��������!";}
//		}		
//	else{type=JOptionPane.ERROR_MESSAGE;
//	text=text+"�� ���! ������� ��������!";}
//	JOptionPane.showMessageDialog(null,text,title,type);
//	}
//}

public class HW_1_1_1 {
	public static void main(String[] args){
	//���������� ����� �������� ����������� ����� � ���������� (�,�) ����� ����� ������
		{
			int x=10;
			int y=20;
			int res=ff(x,y);
			System.out.println(res);
		}
	}
		public static int ff(int xx, int yy)
			{
			if(xx==0 || yy==0)
				throw new IllegalArgumentException();
			int ret = 0;
			if(xx>0){
				ret = (yy>0) ? 1:4;
				}
			else {
				ret = (yy>0) ? 2:3;
				}
			return ret;
			}
		
	}