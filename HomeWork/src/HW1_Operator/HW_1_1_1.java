package HW1_Operator;
//import javax.swing.*;
//public class HW_1_1_1 {
//	public static void main(String[] args){
//		// ќпределить какой четверти принадлежит точка с коринатами (х,у)
//	double x, y;
//	String title="ќпределение четверти";
//	String text=" оордината находитс€";
//	int type;
//	x=Double.parseDouble(JOptionPane.showInputDialog(" оордината х ="));
//	y=Double.parseDouble(JOptionPane.showInputDialog(" оордината у ="));
//	if ((x!=0)&(y!=0)){ type=JOptionPane.PLAIN_MESSAGE;// проверить, возможно условие должно сработать при таком написании ((x!=0)&(y!=0))
//		if ((x>=0)&(y>=0)){text=text+" в первой четверти!";}
//		if ((x<=0)&(y>=0)){text=text+" во второй четверти!";}
//		if ((x<=0)&(y<=0)){text=text+" в третьей четверти!";}
//		if ((x>=0)&(y<=0)){text=text+" в четвЄртой четверти!";}
//		}		
//	else{type=JOptionPane.ERROR_MESSAGE;
//	text=text+"на оси! —межные четверти!";}
//	JOptionPane.showMessageDialog(null,text,title,type);
//	}
//}

public class HW_1_1_1 {
	public static void main(String[] args){
	//ќпределить какой четверти принадлежит точка с коринатами (х,у) после урока ¬адима
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