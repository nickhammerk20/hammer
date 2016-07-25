package HW1_Cycles;
// Найти корень натурального числа с точностью до целого (рассмотреть вариант
// последовательного подбора и метод бинарного поиска)

public class HW_1_2_3{
	public static void main (String [] args){
		int r=138384;
		int res=fkorennatchisla(r);
		System.out.println(res);
	}
	public static int fkorennatchisla(int a){ // метод подбора
		if (a<=0) { //если цифра меньше "0" то выдает ошибку
			throw new IllegalArgumentException();}
		int ret = 0;
		for( int i = 1 ; ret==0; i++){
			if ( (i * i) >= a){
				ret = i--;
			}
		}
			
		return ret;
	}
	
	
	public static int fkorennatchisla000(int a){ // не доделал
		if (a<=0) { //если цифра меньше "0" то выдает ошибку
			throw new IllegalArgumentException();}
		double ret=1;
		if(a>=100){
			int count = (int)Math.log10(a)-1;
			ret=a/Math.pow(10, count);
			for(int b=9; b == 1; b--){
				// мысль как сделать ушла...
			}
		}
		else{
			ret=a;	
		}
		int rez = (int) ret;
		return rez;
	}
}