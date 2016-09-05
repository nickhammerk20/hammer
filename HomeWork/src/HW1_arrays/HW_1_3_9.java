package HW1_arrays;

import java.util.Arrays;

// ќтсортировать массив (Quick, Merge, Shell, Heap)

public class HW_1_3_9{
	private static int[] array = null;

	public static void main (String [] args){
		int [] r={50,10,7,30,9,1,88,44,33,6};
		System.out.println( "Input array ");
		for (int i = 0; i<=r.length-1; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("=====QuickSort=====");
		init(r);
		quickSort();
		print();
		clear();

		System.out.println();
		System.out.println("=====SortMerge=====");
		init(r);
		sortMerge();
		print();
		clear();

		System.out.println();
		System.out.println("=====SortShell=====");
		init(r);
		sortShell();
		print();
		clear();
		
		System.out.println();
		System.out.println("=====SortHeap=====");
		init(r);
		sortHeap();
		print();
		clear();

	}
	public static void clear() 
	{
		array = null;
	}

	public static void init(int[] ar) 
	{
		array = new int[ar.length];
		for (int i=0; i<ar.length; i++) {
			array[i] = ar[i];
		}
	}
	public static void print() {
		for (int i=0; i<array.length-1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length-1]);
	}
	
	// БЫСТРАЯ СОРТИРОВКА
	
	public static void quickSort() 
	{
		int startIndex = 0;
		int endIndex = array.length - 1;
		doSort(startIndex, endIndex);
	}
	public static void doSort(int start, int end) {
		if (start >= end)
			return;
		int i = start, j = end;
		int x = i - (i - j) / 2;
		while (i < j) {
			while (i < x && (array[i] <= array[x])) {
				i++;
			}
			while (j > x && (array[x] <= array[j])) {
				j--;
			}
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				if (i == x)
					x = j;
				else if (j == x)
					x = i;
			}
		}
		doSort(start, x);
		doSort(x+1, end);
	}


	//СОРТИРОВКА СЛИЯНИЕМ
	
	private static void sortMerge() 
	{
		int len = array.length;
		int n = 1; // кратность сравнений (сравнивать по 1-му елем., 2-м ...)
		int shift; // сдвиг в перебираемом массиве
		int two_size; // количество елементов для 2-го массива
		int[] arr2;
		while (n < len) {
			shift = 0;
			while (shift < len) {
				if (shift + n >= len) break;
				two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
				arr2 = merge(Arrays.copyOfRange(array, shift, shift + n),
						Arrays.copyOfRange(array, shift + n, shift + n + two_size));
				for (int i = 0; i < n + two_size; ++i)
					array[shift + i] = arr2[i]; // замена на отсортированное
				shift += n * 2;
			}
			n *= 2;
		}
	}
	private static int[] merge(int[] arr_1, int[] arr_2) 
	{
		int len_1 = arr_1.length, len_2 = arr_2.length;
		int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			if (b < len_2 && a < len_1) {
				if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
				else result[i] = arr_1[a++];
			} else if (b < len_2) {
				result[i] = arr_2[b++];
			} else {
				result[i] = arr_1[a++];
			}
		}
		return result;
	}
	
	
	// СОРТИРОВКА ШЕЛЛА
	
	private static void sortShell()
	{
		int size = array.length;

		// Создаем массив размера size
		// для хранения чисел
		int[] ar = new int[size];

		// Считываем массив
		for (int i = 0; i < size; i++) {
			ar[i] = array[i];
		}
		int step = size / 2;//инициализируем шаг.

		while (step > 0)//пока шаг не 0
		{
			for (int i = 0; i < (size - step); i++)
			{
				int j = i;
				//будем идти начиная с i-го элемента
				while (j >= 0 && ar[j] > ar[j + step])
					//пока не пришли к началу массива
					//и пока рассматриваемый элемент больше
					//чем элемент находящийся на расстоянии шага
				{
					//меняем их местами
					int temp = ar[j];
					ar[j] = ar[j + step];
					ar[j + step] = temp;
					j--; 
				}
			}
			step = step / 2;//уменьшаем шаг
		}    
		array = ar;
	}
	
	// СОРТИРОВКА КУЧЕЙ
	
	 public static void sortHeap()
	 {
		 sort(array);
	 }	
	 public static void heapify(int[] array, int size, int pos) {    
	        while (2 * pos + 1 < size) {                       //Процедура нормализации 
	            int t = 2 * pos + 1;                           //подкучи в куче с  
	                                                           //головой в pos
	            if (2 * pos + 2 < size && array[2 * pos + 1] < array[2 * pos + 2]) {
	                t = 2 * pos + 2;
	            }
	            if (array[pos] < array[t]) {
	                swap(array, pos, t);
	                pos = t;
	            } else {
	                break;
	            }
	        }
	    }
	    public static int[] heapMake(int[] array) {  //Построение кучи из массива при 
	        int n = array.length;                    //помощи функции heapify  
	        for (int i = n - 1; i >= 0; i--) {
	            heapify(array, n, i);
	        }
	        return array;
	    }
	    public static void sort(int[] array) { //Собственно сама сортировка
	        int n = array.length;
	        heapMake(array);
	        while (n > 0) {
	            swap(array, 0, n - 1);
	            n--;
	            heapify(array, n, 0);
	        }

	    }
	    private static void swap(int[] array, int i, int j) { //Меняет местами 
	        int temp = array[i];                                //элементы с   
	        array[i] = array[j];                                //индексами i и j
	        array[j] = temp;                                    //в массиве array
	    }	
}