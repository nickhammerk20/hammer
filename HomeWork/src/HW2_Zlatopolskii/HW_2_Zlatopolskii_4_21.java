package HW2_Zlatopolskii;
//ќпределить, €вл€етс€ ли число a делителем числа b?
public class HW_2_Zlatopolskii_4_21{
	public static void main (String [] args){
		int a=2;
		int b=10;
		boolean res=fAdelitelB(b, a);
		System.out.println(res);
	}
	public static boolean fAdelitelB(int a, int b){
		if (a==0 || b == 0) {
			throw new IllegalArgumentException();
		}
		boolean ret;
			ret=(a%b==0);
		return ret;
	}
}