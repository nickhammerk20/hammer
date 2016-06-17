package HW1_Cycles;
// Вычислить факториал числа n. n! = 1*2*...*n­1*n;!

public class HW_1_2_4{
	public static void main (String [] args){
		int r=10;
		int res=ffactorial(r);
		System.out.println(res);
	}
	public static int ffactorial(int a){
		if (a<=1) { //если цифра меньше "0" то выдает ошибку
			throw new IllegalArgumentException();}
		int ret=1;
		int i=1;
			while (i != (a+1)){
				ret*=i;
				i++;
			}
			System.out.println(ret);
		return ret;
	}
}