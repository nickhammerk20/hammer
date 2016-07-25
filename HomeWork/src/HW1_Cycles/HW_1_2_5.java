package HW1_Cycles;
// Посчитать сумму цифр заданного числа

public class HW_1_2_5{
	public static void main (String [] args){
		int r=3456789;
		int res=fsumcifr(r);
		System.out.println("на выходе  "+res);
	}
	public static int fsumcifr(int a){
		if (a<=0) { //если цифра меньше "0" то выдает ошибку
			throw new IllegalArgumentException();
		}
		int ret=0;
		int count = (int)Math.log10(a)+1;
		if ( count == 1 ){ // если в указанной цифре 1 знак то = цифре
			ret=a;
		}
		else { // както много переменных у меня вышло
			int b = 1;
			int ret1=0;
			int ret2=0;
			for( int i = count; i >= 1; i--){
				ret1 = a/b;
				b*=10;
				ret2 = ret1%10;
				ret+=ret2;
				System.out.println(ret+" bubu "+b);
			}			
		}
		
		return ret;
	}
}