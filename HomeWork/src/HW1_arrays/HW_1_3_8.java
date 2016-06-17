package HW1_arrays;
//Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками (Insert))

public class HW_1_3_8{
	public static void main (String [] args){
		int [] r={50,10,7,30,9,1};
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		fArrSortInsert(r);
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
	}
	public static int fArrSortBubble(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret=0;
		int n = a.length;
		for(int i=n-1; i>=0; i--){
			for(int j=0; j<i ; j++){
				if (a[j] > a[j+1]){
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		
		return ret;
	}
	public static int fArrSortSelect(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret=0;
		for (int i = 0; i < a.length - 1; i++) {
		        int min_i = i;
			    for (int j = i + 1; j < a.length; j++) { 
			       	if (a[j] < a[min_i]) {
			       		min_i = j;
			       	}
			    }
		        int tmp = a[i]; 
			    a[i] = a[min_i];
			    a[min_i] = tmp;
		    }
		return ret;
	}
	public static int fArrSortInsert(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int j, ret=0;
		for(int i = 1; i < a.length; i++)
	    {
	        int tmp = a[i];
	        for ( j = i - 1; j >= 0 && a[j] > tmp; j--)
	        {
	            a[j + 1] = a[j];
	        }
	        a[j + 1] = tmp;
	    }
		return ret;
	}
}