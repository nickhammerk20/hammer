package BsTree;

import java.util.Iterator;

import BsTree.BsTree2_Visitor.MyIter;

//import java.util.Iterator;

public class BsTree3_Linked implements EBsTree
{
	class Link
	{
		Node node;
	}
		
	class Node 
	{
		int val;
		Link link;
		Link left = new Link();
		Link right = new Link();

		public Node(int val) 
		{
			this.val = val;
		}
	}
	protected Link root = new Link();

	//Печать в консоль ++
	//@Override
	public void print() 
	{
		printNode(root);
	}
	private void printNode(Link p) 
	{
		if (p.node == null)
			return;

		printNode(p.node.left);              //L
		System.out.print(p.node.val + ",");  //V
		printNode(p.node.right);             //R
	}

	//Инициализация ++
	//@Override
	public void init(int[] ini) 
	{
		clear();
		if ( ini == null || ini.length == 0)
			return;

		for (int i = 0; i < ini.length; i++) 
		{
			add(ini[i]);
		}
	}

	//Добавление узла со значением ++
	//@Override
	public void add(int val) 
	{
		addNode(root, val);
	}
	private void addNode(Link p, int val) 
	{
		if( p.node == null)
		{
			Node tmp = new Node(val);
			p.node = tmp;
			tmp.link = p;
			return;
		}
		if (val < p.node.val)
		{
			addNode (p.node.left, val);
		}
		else
		{
			addNode (p.node.right, val);
		}
	}

	//Очистка дерева ++
	//@Override
	public void clear() 
	{
		root = new Link();
	}

	//Получить количество всех узлов в дереве (с потомками и без) ++
	//@Override
	public int size() 
	{
		return sizeNode( root );
	}
	private int sizeNode(Link p) 
	{
		if (p.node == null)
			return 0;

		return sizeNode(p.node.left) + 1 + sizeNode(p.node.right);
	}

	//Получить количество листьев++
	//@Override
	public int leaves()
	{
		return nodeLeaves(root);
	}
	private int nodeLeaves(Link p) 
	{
		if (p.node == null)
			return 0;

		int ret = 0;

		ret += nodeLeaves(p.node.left);			
		if (p.node.left.node == null && p.node.right.node == null)
			ret++;
		ret += nodeLeaves(p.node.right);

		return ret;
	}

	//Получить количество узлов (хотя бы 1 потомок)	++
	//@Override
	public int nodes()
	{
		return nodeNodes(root);
	}
	private int nodeNodes(Link p) 
	{
		if (p.node == null)
			return 0;

		int ret = 0;

		ret += nodeNodes(p.node.left);			
		if (p.node.left.node != null || p.node.right.node != null)
			ret++;
		ret += nodeNodes(p.node.right);

		return ret;
	}
	
	//Получить количество уровней (высота дерева)++
	//@Override
	public int height() 
	{
		return nodeHeight(root);
	}
	private int nodeHeight(Link p) 
	{
		if (p.node == null)
			return 0;

		return 1 + Math.max(nodeHeight(p.node.left), nodeHeight(p.node.right));
	}

	//Ширина дерева (максимальное количество узлов на любом уровне)	
	//@Override
	public int width() 
	{
		if (size() == 0)
			return 0;
		int[] ar = new int[height()];
		nodeWidth(root, ar, 0);
		return max(ar);
	}
	private void nodeWidth(Link p, int[] ar, int level) 
	{
		if (p.node == null)
			return;

		nodeWidth(p.node.left,  ar, level+1);
		ar[level]++;
		nodeWidth(p.node.right, ar, level+1);
	}
	private int max(int[] array)
	{
		int max=0;
		max = array[0];

		for (int i : array) 
		{
			if (i>max)
				max=i;
		}

		return max;
	}


	//Получить String через LVR дерева
		//@Override
	public String toString() 
	{
		return toStringNode(root);
	}
	private String toStringNode(Link p) 
	{
		if (p.node == null)
			return "";

//		String str = "";
//		str += toStringNode(p.node.left);
//		str += p.node.val + ", ";
//		str += toStringNode(p.node.right);
//		return str;
		return toStringNode(p.node.left) + p.node.val + ", " + toStringNode(p.node.right);
	}

	//Получить массив через LVR дерева
		private class Counter
	{
		int index = 0;
	}
	//@Override
	public int[] toArray() 
	{
		int[] ar = new int[size()];
		nodeToArray(root, ar, new Counter());
		return ar;
	}
	private void nodeToArray(Link p, int[] ar, Counter ii) 
	{
		if (p.node == null)
			return;

		nodeToArray(p.node.left,  ar, ii);
		ar[ii.index++] = p.node.val;
		nodeToArray(p.node.right, ar, ii);
	}

	//Зеркально пересадить дерево
	//@Override
	public void revers()
	{
		reverseNode(root);
	}
	private void reverseNode(Link p) 
	{
		if (p.node == null)
			return;

		Node tmp = p.node.left.node;
		p.node.left.node = p.node.right.node;
		p.node.right.node = tmp;
		
		reverseNode(p.node.left);
		reverseNode(p.node.right);
	}
	
	//Удаление элемента по ключу
		//@Override
	public void del(int val) 
	{
		Node p = findNode(root, val);
		if(p == null)
			throw new IllegalArgumentException();
		delNode(p);
	}
	private Node findNode(Link p, int val) 
	{
		if(p.node == null)
			return null;
		
		if(p.node.val == val)
			return p.node;
		
		if (val < p.node.val)
			return findNode(p.node.left, val);
		else  
			return findNode(p.node.right, val);
	}	
	private void delNode(Node old) 
	{
		if(old.left.node == null && old.right.node == null) 	// если нет ни одного потомка
		{
			old.link.node = null;
			return;
		}
		
		Node tmp = null;										// создаем наследника
		if( old.left.node != null)								// если есть левый наследник
		{
			tmp = maxLeft(old);									// поиска максимального левого элемента
			tmp.link.node = tmp.left.node;						
			if (tmp.link.node != null)
				tmp.link.node.link = tmp.link;
		}
		else if( old.right != null)
		{
			tmp = minRight(old);
			tmp.link.node = tmp.right.node;
			if (tmp.link.node != null)
				tmp.link.node.link = tmp.link;
		}
//		tmp.left.node = old.left.node;
//		tmp.right.node = old.right.node;
		tmp.left = old.left;
		tmp.right = old.right;
		
		old.link.node = tmp;
		tmp.link = old.link;
	}
	private Node maxLeft(Node old) 
	{
		Node pp = old.left.node;
		while(pp.right.node != null )
		{
			pp = pp.right.node;
		}
		return pp;
	}
	private Node minRight(Node old) 
	{
		Node pp = old.right.node;
		while(pp.left.node != null )
		{
			pp = pp.left.node;
		}
		return pp;
	}
	
	/**********************/
	/******check***********/
	/**проверить все связи*/
	/**********************/
	public boolean check()
	{
		//проверяет соответсвие ссылок в обе стороны
		boolean chk = false;
		return checkNode(root, chk);
	}
	private boolean checkNode(Link p, boolean chk) 
	{
		if (p.node == null)
			return false;

		checkNode(p.node.left, chk);						//L
//		if 
		System.out.println("p.node.val " + p.node.val + " - " + chk + " / p.node.left " + p.node.left +" / p.node.right "+ p.node.right +" / p.node.link "+ p.node.link);  		//V
		checkNode(p.node.right, chk);             			//R
		return chk;
	}
	

	/***********************/
	/*******Iterator********/
	/***********************/	
	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(toArray());
	}
	class MyIter implements Iterator<Integer>
	{
		int[] ar;
		int i = 0;

		public MyIter(int[] ar) 
		{
			this.ar = ar;
		}
		@Override
		public boolean hasNext() 
		{
			return i < ar.length;
		}

		@Override
		public Integer next() 
		{
			return ar[i++];
		}		
	}	
}
