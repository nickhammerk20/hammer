package HW1_arrays;
// Найти минимальный элемент массива0

public class HW_1_3_1{
	public static void main (String [] args){
		int [] r={100,5,20,30,50,99};
		int res=fArrMin(r);
		System.out.println(res);
	}
	public static int fArrMin(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		
		int ret = a[0];
		for(int i=1; i<a.length; i++){
			if( ret > a[i] ){
				ret = a[i];
			}
		}
			
		return ret;
	}
}