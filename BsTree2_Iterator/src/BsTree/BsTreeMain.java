package BsTree;

public class BsTreeMain 
{
	public static void main (String[] args)
	{

		BsTree tr = new BsTree();

		tr.add(10);
		tr.add(15);
		tr.add(20);
		tr.add(14);
		tr.add(77);
		tr.add(22);
		tr.add(50);
		tr.add(25);
		tr.add(15);
		tr.add(20);
		tr.add(7);
		tr.add(40);
		tr.add(75);
		tr.add(60);
		tr.add(80);		

		System.out.println("вход tr.print();");
		tr.print();
		System.out.println("\nвход tr.toString();");
		System.out.println(tr.toString());
		System.out.println("вход tr.toArray();");

		int ar [] = tr.toArray(); 
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]);
			if(i < ar.length-1)
				System.out.print(",");
		}
		System.out.println("\nSizeVizitor "+tr.size());
		System.out.println("\nNodeVizitor "+tr.nodes());
	}
}
