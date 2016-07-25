package HW1_arrays;
//Посчитать сумму элементов массива с нечетными индексами

public class HW_1_3_5{
	public static void main (String [] args){
		int [] r={50,10,15,20,13,7,30};
		int res=fArrSumNechetIndex(r);
		System.out.println("-->"+res);
	}
	public static int fArrSumNechetIndex(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0;
		for(int i=1; i<a.length; i++){
			if( i%2!=0){
				ret+=a[i];
			}
		}
		return ret;
	}
}