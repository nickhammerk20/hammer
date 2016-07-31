package Lister;

public class LstMain2 {

	public static void main(String[] args) 
	{
//		int[] ini = {10,15,20,14,77,22,50,25,15,20,7,40,75,60,80};
		int[] ini = {10,20,77,11,24,82};
			
		AList0 alst0 = new AList0();
		alst0.init(ini);
		System.out.println(alst0 + " = alst0");
		alst0.halfRevers();
		System.out.println(alst0 + " = alst0 (halfRevers)");
		
		AList0 alst1 = new AList0();
		alst1.init(ini);
//		System.out.println(alst1 + " = alst1");
		alst1.halfRevers();
		System.out.println(alst1 + " = alst1 (halfRevers)");
		
		LList1 lst1 = new LList1();
		lst1.init(ini);
//		System.out.println(lst1 + " = lst1");
		lst1.halfRevers();
		System.out.println(lst1 + " = lst1 (halfRevers)");
		
		LList2 lst2 = new LList2();
		lst2.init(ini);
//		System.out.println(lst2 + " = lst2");
		lst2.halfRevers();
		System.out.println(lst2 + " = lst2 (halfRevers)");
		
	}
}
