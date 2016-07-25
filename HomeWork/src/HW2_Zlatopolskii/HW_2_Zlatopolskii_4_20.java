package HW2_Zlatopolskii;
//4.20. Если целое число m делится нацело на целое число n, то вывести на экран ча-
//стное от деления, в противном случае вывести сообщение "m на n нацело не
//делится".
public class HW_2_Zlatopolskii_4_20{
	public static void main (String [] args){
		int m=10;
		int n=-2; 
		String res=fdelenieMnaN(m, n);
		System.out.println(res);
	}
	public static String fdelenieMnaN(int a, int b){
		if (b == 0 || a == 0) {
			throw new IllegalArgumentException();
		}
		String ret="";
		if (a%b==0){
			ret="частное от деления "+(a/b);
		}
		else{
		 ret=a+" на "+b+" нацело не делится";
		}
		return ret;
	}
}