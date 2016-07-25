package Lister;

public class LstMain {

	public static void main(String[] args) 
	{
		int[] ini = {10,15,20,14,77,22,50,25,15,20,7,40,75,60,80};
		
		LList1 lst1 = new LList1();
		lst1.init(ini);
		System.out.print("lst1 = ");
		for(Integer i : lst1)
		{
			System.out.print( i + ", ");
		}
		
		System.out.println();
		
		LList2 lst2 = new LList2();
		lst2.init(ini);
		System.out.print("lst2 = ");
		for(Integer i : lst2)
		{
			System.out.print( i + ", ");
		}
	}
}
