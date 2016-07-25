package HW1_Cycles;
// Вывести число, которое является зеркальным отображением последовательности
// цифр заданного числа, например, задано число 123, вывести 321.

public class HW_1_2_6{
	public static void main (String [] args){
		int r=123456789;
		int res=fzerkalo(r);
		System.out.println(res);
	}
	public static int fzerkalo(int a){
		if (a<=0) { //если цифра меньше "0" то выдает ошибку
			throw new IllegalArgumentException();
		}
		while ((a%10)==0){ //убираем последний ноль, что бы не получилась восмиричная система
			a=a/10;
		}
		int ret=0;
		int count = (int)Math.log10(a)+1;
		if ( count == 1 ){ // если в указанной цифре 1 знак то = цифра
			ret=a;
		}
		else { // както много переменных у меня вышло
			int c = 1;
			for(int i =1; i <=count; i++){
				c*=10;
			}
			int b = 1;
			int ret1 = 0;
			int ret2 = 0;
			for(int i = 1; i <= count; i++){
				ret1 = a/b;
				b*=10;
				c/=10;
				ret2 = ret1%10;
				ret+=(ret2*c);
				//System.out.println(ret+" bubu "+b+" bubu "+c);
			}			
		}
		
		return ret;
	}
}