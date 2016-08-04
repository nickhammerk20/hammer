package task;

import BsTree.BsTree2_Visitor;

public class BsTreeMain 
{
	public static void main (String[] args)
	{

		BsTree2_Visitor tree = new BsTree2_Visitor();

		tree.add(10);
		tree.add(15);
		tree.add(20);
		tree.add(14);
		tree.add(77);
		tree.add(22);
		tree.add(50);
		tree.add(25);
		tree.add(16);
		tree.add(21);
		tree.add(7);
		tree.add(40);
		tree.add(75);
		tree.add(60);
		tree.add(80);		

		System.out.println("вход tr.print();");
		tree.print();
		System.out.println("\nвход tr.toString();");
		System.out.println(tree.toString());
		System.out.println("вход tr.toArray();");

		int ar [] = tree.toArray(); 
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]);
			if(i < ar.length-1)
				System.out.print(",");
		}
		System.out.println("\n*****new******");
		System.out.println("SizeVizitor (всего) = "+tree.size());
		System.out.println("NodeVizitor (узлы) = "+tree.nodes());
		System.out.println("LeavesVisitor (листья) = "+tree.leaves());
		System.out.println("ToStringVisitor (строка) = "+tree.toString());
		System.out.print("PrintVizitor (строка) = ");
		tree.print();
		
		System.out.println();
		
		System.out.print("tree = ");
		for(Integer i : tree)
		{
			System.out.print( i + ", ");
		}
	}
}
