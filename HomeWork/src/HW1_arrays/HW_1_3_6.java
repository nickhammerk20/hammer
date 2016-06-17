package HW1_arrays;
//Сделать реверс массива (массив в обратном направлении) Посчитать количество
//нечетных элементов массива

public class HW_1_3_6{
	public static void main (String [] args){
		int [] r={50,10,15,21,13,7,30};
		for (int i = 0; i<=6; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		fArrRevers(r);
		int reskol=fArrKolNechetElement(r);
		for (int i = 0; i<=6; i++){
			System.out.print(r[i]+", ");
		}
		System.out.println();
		System.out.println("-->"+reskol);
	}
	public static int fArrRevers ( int [] a ) {
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0; //не разобрался как обойтись без этого, без этого ошибка
		for (int i=0; a.length/2>i ; i++){
			System.out.println("new. i = "+i+", a.length/2 = "+(a.length/2)+"\n");
			int temp = a[i]; //временное значение элемента
			//System.out.println(temp);
			a[i] = a[a.length - i - 1]; // перенос значения из конца массива
			//System.out.println(a[i]);
			a[a.length - i - 1] = temp; // присвоение конечному значению массива временного элемента
			//System.out.println(a[a.length - i - 1]);
		}			
		System.out.println();
		return ret; //не разобрался как обойтись без этого, без этого ошибка
	
	}
	
	public static int fArrKolNechetElement(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0;
		for(int i=0; i<a.length; i++){
			if( a[i]%2!=0){
				ret++;
			}
		}
		return ret;
	}
}