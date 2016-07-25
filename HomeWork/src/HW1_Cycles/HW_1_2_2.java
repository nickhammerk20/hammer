package HW1_Cycles;
//import javax.swing.*;
//public class HW_1_2_2 {
//
//	public static void main(String[] args) {
//		// Проверить простое ли число? (число называется простым, 
//		// если оно делится только само на себя и на 1)
//		int i, a;
//		double d=0;
//				i=Integer.parseInt(JOptionPane.showInputDialog("Введите число"));
//		String text="Указанное число "+i+" является ";
//		for(a=2;a<=7;a++){
//			d=i%a;
//			if(d!=0){text+=a+"  "+d+"  "+"составным.";}
//			else{text+=a+"  "+d+"  "+"простым.";}
//			
//			//d=i/a;
//			//int c=(int)d;
//			//double c2;
//			//c2=d-c;
//			//if(c2!=0){text+=a+"  "+d+"  "+c+"  "+c2+"составным.";}
//			//else{text+=a+"  "+d+"  "+c+"  "+c2+"простым.";}
//			
//			//if(j%10!=0){
//				//text+=j+"составным.";
//				//break;
//		//	}
//			//else{text+=j+"простым.";}
//			//break;
//		}
//		JOptionPane.showMessageDialog(null, text);
//	}
//
//}

public class HW_1_2_2{
	// Проверить простое ли число? (число называется простым, 
	// если оно делится только само на себя и на 1)
	public static void main (String [] args){
		int r=11;
		String res=fprostoe(r);
		System.out.println(res);
	}
	public static String fprostoe(int a){
		if (a<=1){
			throw new IllegalArgumentException();
		}
		String ret="";
		if (a==2 || a==3 || a==5 || a==7){
			ret = "простое";
		}
		else if (a%2==0 || a%3==0 || a%5==0 || a%7==0){
			ret = "сложное";
		}
		else {
			ret = "простое";
		}
				
		return ret;
	}
}
