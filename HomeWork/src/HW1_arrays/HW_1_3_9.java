package HW1_arrays;
// Отсортировать массив (Quick, Merge, Shell, Heap)

public class HW_1_3_9{
	public static void main (String [] args){
		int [] r={50,10,7,30,9,1,88,44,33,6};
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		fArrShellSort(r);
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
	}
	public int fArrSortShell(int[] ar){
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0;
		
		
		return ret;
	}
	
	public static int fArrQuickSort(int[] ar){
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException();
		}
		int ret=0;
		int i = 0; 
		int j = ar.length -1; 
		int x = ar[(i + j) / 2];
		    do {
		        while (ar[i] < x){ 
		        	i++;
		        }
		        while (ar[j] > x){
		        	j--;
		        }
		        if(i <= j) {
		            if (i < j){
		        	int temp = ar[i];
		        	ar[i] = ar[j];
		        	ar[j] = temp;
		            i++;
		            j--;
		            }
		        }
		    } while (i <= j);
//		    if (i < j)
//		    	fArrQuickSort(ar, i, j);
//		    if (first < j)
//		    	fArrQuickSort(ar, i,j);
//		}
		return ret;
	}
	public static int fArrShellSort (int[] ar){
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0 ;  
		int i = 0 ;
		int j = 0 ;
		for(int arlen = ar.length/2 ; arlen > 0 ; arlen /= 2){
			for (j= i - arlen; j >=0 && ar[j] >ar[j+arlen]; j-= arlen ){
				int temp = ar[j];
				ar[j]= ar[j+arlen];
				ar[j+arlen] = temp;
			}
		}
		
		
		return ret;
	}
}