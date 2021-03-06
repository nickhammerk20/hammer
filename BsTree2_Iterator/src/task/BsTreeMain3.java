package task;

import static org.junit.Assert.assertEquals;

import BsTree.BsTree3_Linked;

public class BsTreeMain3 {

	public static void main(String[] args) 
	{
		int[] ini = {77,10,80,5,15,2,7,11,17};
//		int[] ini = {80,75,100,50,150,25,70,90,170,15,40,73,85,95,125,
//					190,10,20,30,45,115,140,130,5,12,17,23,27,35,42,47,
//					110,120,127,135,145,142,147,105,112,117,123};
//		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		BsTree3_Linked tree = new BsTree3_Linked();
		tree.init(ini);
		tree.print();
		System.out.println();
		System.out.println(tree.check());
		tree.print();
		System.out.println();
		tree.clear();
		int[] ar2 = {55,24,5,98,45,53,12,104,111,15,4,62,84,59,91,77,70,75,71,110};
		tree.init(ar2);
		System.out.println();
		tree.print();
		System.out.println();
		tree.del(91);
		tree.print();
		System.out.println(tree.check());
		tree.del(98);
		System.out.println();
		tree.print();
		System.out.println(tree.check());
		tree.del(84);
		System.out.println();
		tree.print();
		System.out.println(tree.check());
	}
}
