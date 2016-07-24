package Lister;

public class LstMain {

	public static void main(String[] args) 
	{
		int[] ini = {10,15,20,14,77,22,50,25,15,20,7,40,75,60,80};
		LList1 lst = new LList1();
		lst.init(ini);
		for(Integer i : lst)
		{
			System.out.print( i + ", ");
		}
	}
}
