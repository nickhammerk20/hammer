package HW1_arrays;
//Найти индекс максимального элемента массива

public class HW_1_3_4{
	public static void main (String [] args){
		int [] r={50,10,15,20,13,7,30};
		int res=fArrIndMax(r);
		System.out.println("-->"+res);
	}
	public static int fArrIndMax(int [] a){
		if (a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		int ret = 0;
		int min = a[0];
		for(int i=1; i<a.length; i++){
//			System.out.println("i="+i);
			if( min < a[i]){
				min = a[i];
//				System.out.println("min="+min);
//				System.out.println("a[i]="+a[i]);
				ret = i;
//				System.out.println("ret="+ret);
			}
		}
		return ret;
	}
}