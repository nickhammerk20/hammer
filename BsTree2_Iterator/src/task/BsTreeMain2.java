package task;

import BsTree.BsTree1_Rotation;

public class BsTreeMain2 {

	public static void main(String[] args) 
	{
		int[] ini = {77,10,80,5,15,2,7,11,17};
//		int[] ini = {80,75,100,50,150,25,70,90,170,15,40,73,85,95,125,
//					190,10,20,30,45,115,140,130,5,12,17,23,27,35,42,47,
//					110,120,127,135,145,142,147,105,112,117,123};
//		int[] ini = {50,25,40,20,11,24,30,66,75,100,60,45,22,43,77};
		BsTree1_Rotation tree = new BsTree1_Rotation();
		tree.init(ini);
		tree.print();
		System.out.println();
		tree.revers();
		tree.print();

		tree.clear();
		
		BsTree1_Rotation tree1 = new BsTree1_Rotation();
		int[] ini1 = {77,10,80,5,15,2,7,11,17};
		tree1.init(ini1);
		
		BsTree1_Rotation tree2 = new BsTree1_Rotation();
		int[] ini2 = {77,10,80,5,15,2,7,11,17};
		tree2.init(ini2);
		System.out.println();
		tree1.print();
		System.out.println();
		tree2.print();
		tree1.equals(tree2);
		System.out.println(tree1.equals(tree2));
	}
}