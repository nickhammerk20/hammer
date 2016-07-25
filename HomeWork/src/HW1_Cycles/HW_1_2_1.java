package HW1_Cycles;
//import javax.swing.*;
//public class HW_1_2_1 {
//
//	public static void main(String[] args) {
//		// Найти сумму чётных чисел и их кол-во в диапазоне от 1 до 99
//		int countmin, countmax, i, s=0, k=0;
//		countmin=Integer.parseInt(JOptionPane.showInputDialog("ввести нижнюю границу диапазона"));
//		countmax=Integer.parseInt(JOptionPane.showInputDialog("ввести верхнюю границу диапазона"));
//		String text="Сумма и кол-во четных чисел от "+countmin+" до "+countmax+".\n";
//		String strsum="Сумма: ";
//		String strkol="Кол-во: ";
//		i=countmin;
//		do{
//			if(i%2==0){
//				k++;
//				s+=i;
//				i++;}
//			else{i++;}
//		}while(i<=countmax);
//		strsum+=s+"\n";
//		strkol+=k+".";
//		text+=strsum+strkol;
//		JOptionPane.showMessageDialog(null, text);
//	}
//
//}
public class HW_1_2_1{
	// Найти сумму чётных чисел и их кол-во в диапазоне от 1 до 99
	public static void main (String [] args){
		int dmin=1;
		int dmax=99;
		int resk=kol(dmin,dmax);
		int ress=sum(dmin,dmax);
		System.out.println("кол-во "+resk+", сумма "+ress);
	}
	public static int kol(int a, int b){
		int ret=0;
		do{
		if(a%2==0){
				ret++;
				a++;}
			else{a++;}
		}while(a<=b);
		
		return ret;
	}
	public static int sum(int a, int b){
		int ret=0;
		do{
		if(a%2==0){
				ret+=a;
				a++;}
			else{a++;}
		}while(a<=b);
		
		return ret;
}
}