package BsTree;

public class BsTreeMain 
{
	public static void main (String[] args)
	{
		BsTree tr = new BsTree();

//		tr.add(10);
//		tr.add(15);
//		tr.add(20);
//		tr.add(14);
//		tr.add(77);
//		tr.add(22);
		
		tr.add(50);
		tr.add(25);
		tr.add(15);
		tr.add(20);
		tr.add(7);
		tr.add(40);
		tr.add(75);
		tr.add(60);
		tr.add(80);		

		System.out.println("âõîä tr.print();");
		tr.print();
		System.out.println("\nâõîä tr.toString();");
		tr.toString();
		System.out.println("\nâõîä tr.toArray();");
		tr.toArray();

	}

}
