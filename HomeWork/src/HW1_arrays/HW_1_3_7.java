package HW1_arrays;
//ѕомен€ть местами первую и вторую половину массива, например, дл€ массива 1 2 3 4,
//результат 3 4 1 2

public class HW_1_3_7{
	public static void main (String [] args){
		int [] r={50,10,7,30};
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		fArrHalfRevers(r);
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
	}
	public static int fArrHalfRevers ( int [] a ) {
		if (a==null || a.length==0 || a.length%2!=0) {
			throw new IllegalArgumentException();
		}
		int ret = a.length/2; //не разобралс€ как обойтись без этого, без этого ошибка
		for (int i=0; ret>i ; i++){
			int temp = a[i]; 
			a[i] = a[ret + i];
			a[ret + i] = temp; 
		}			
		System.out.println();
		return ret; //не разобралс€ как обойтись без этого, без этого ошибка
	
	}
}