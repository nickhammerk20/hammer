package HW1_Operator;
//import javax.swing.*;
//public class HW_1_1_5 {
//
//	public static void main(String[] args) {
//		// Написать программу опреленения оценки студента по его рейтингу, на основе следующих правил
//		int r, type;
//		String text="Оценка студена:"; 
//		String title="Студент";
//		r=Integer.parseInt(JOptionPane.showInputDialog("Укажите рейтинг студена"));
//		if(r>100){text="Error";}
//			else if(r>=90){text="А";}
//			else if(r>=75){text="B";}
//			else if(r>=60){text="C";}
//			else if(r>=40){text="D";}
//			else if(r>=20){text="E";}
//			else if(r>=0){text="F";}
//			else {text="Error, wrong data!";}
//		type=JOptionPane.PLAIN_MESSAGE;
//	JOptionPane.showMessageDialog(null,text,title,type);		
//	}
//
//}

public class HW_1_1_5{
	public static void main (String [] args){
		int r=0;
		String res=ff(r);
		System.out.println(res);
	}
	public static String ff(int a){
		if (a<0 || a>100){
			throw new IllegalArgumentException();
		}
		String ret="";
		if(a>=90 && a<=100){ret="A";}
		if(a>=75 && a<=89){ret="B";}
		if(a>=60 && a<=74){ret="C";}
		if(a>=40 && a<=59){ret="D";}
		if(a>=20 && a<=39){ret="E";}
		if(a>=0 && a<=19){ret="F";};
		return ret;
	}
}