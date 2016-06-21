package HW1_arrays;
//Найти максимальный элемент массива

public class HW_1_3_2{
	public static void main (String [] args)
	{
		int [] r={100,5,20,30,50,99};
		int res=fArrMax(r);
		System.out.println(res);
	}
	public static int fArrMax(int [] a)
	{
		if (a==null || a.length==0) 
		{
			throw new IllegalArgumentException();
		}

		int ret = a[0];
		for(int i=1; i<a.length; i++)
		{
			if( ret < a[i]){
				ret = a[i];
			}
		}

		return ret;
	}
}