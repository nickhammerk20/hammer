package HW1_arrays;
// ќтсортировать массив (Quick, Merge, Shell, Heap)

public class HW_1_3_9_old{
	private static int[] array = new int[0];
	
	public static void main (String [] args){
		int [] r={50,10,7,30,9,1,88,44,33,6};
		System.out.println( "Input array ");
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		init(r);		
		System.out.println();

		System.out.println("ArrShellSort");
		fArrShellSort(r);
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();

		System.out.println("ArrQuickSort");
		quickSort();
		print();
	}
	public static void init(int[] ar) 
	{
        for (int i=0; i<ar.length-1; i++) {
            array[i] = ar[i];
        }
    }
	 public static void print() {
	        for (int i=0; i<array.length-1; i++) {
	            System.out.print(array[i] + ", ");
	        }
	        System.out.println(array[array.length-1]);
	    }
	
	public int fArrSortShell(int[] ar){
		if (ar==null || ar.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0;


		return ret;
	}

	public static void quickSort() 
	{
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex);
    }
	private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }
	public static int fArrQuickSort(int[] ar)
	{
		if (ar==null || ar.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int ret=0;
		int i = 0; 
		int j = ar.length -1; 
		int x = ar[(i + j) / 2];
		do {
			while (ar[i] < x)
			{ 
				i++;
			}
			while (ar[j] > x)
			{
				j--;
			}
			if(i <= j) 
			{
				if (i < j)
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					if (i == x)
						x = j;
		            else if (j == x)
		                x = i;
					
//					i++;
//					j--;
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