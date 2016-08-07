package BsTree;

import BsTree.BsTree1_Rotation.Node;

public interface EBsTree extends Iterable<Integer>
{
	public void init(int[] in); 
	public void print();	
	public void add(int val); 
	public void del(int del); 
	public void clear(); 	

	public int size();		
	public int leaves(); 
	public int nodes(); 
	public int height(); 
	public int width(); 

	public void revers();

	public String toString(); 
	public int [] toArray(); 
	
	public boolean check();
//	public boolean equals(Node tree2);
}