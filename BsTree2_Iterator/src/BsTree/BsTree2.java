package BsTree;

public class BsTree2 implements EBsTree
{

	int leftHeight = 0;
	int rightHeight = 0;

	class Node 
	{
		int val;
		Node left;
		Node right;

		public Node(int val) 
		{
			this.val = val;
		}
	}
	protected Node root = null;

	//Печать в консоль 
	@Override
	public void print() 
	{
		printNode(root);
	}
	private void printNode(Node p) 
	{
		if (p == null)
			return;

		printNode(p.left);              //L
		System.out.print(p.val + ",");  //V
		printNode(p.right);             //R
	}

	//Инициализация 
	@Override
	public void init(int[] ini) 
	{
		if (ini == null)
			ini = new int[0];

		for (int i = 0; i < ini.length; i++) 
		{
			add(ini[i]);
		}
	}

	//Добавление узла со значением 
	@Override
	public void add(int val) 
	{
		if (root == null) 
		{
			root = new Node(val);
			return;
		}
		addNode(root, val);
	}
	private void addNode(Node p, int val) 
	{
		if (val < p.val) 
		{
			if (p.left == null)
				p.left = new Node(val);
			else
				addNode(p.left, val);
		} 
		else 
		{
			if (p.right == null)
				p.right = new Node(val);
			else
				addNode(p.right, val);
		}
	}

	//Очистка дерева
	@Override
	public void clear() 
	{
		root = null;
	}

	/****************************/
	/**********//*NEW*//*********/
	/****************************/
	
	private interface Visitor
	{
		void action(Node p);
	}

	private void visit(Node p, Visitor v) 
	{
		if (p == null)
			return;

		visit (p.left, v);
		v.action(p);
		visit (p.right, v);
	}

	//Получить количество всех узлов в дереве (с потомками и без) 
	private class SizeVisitor implements Visitor
	{
		int count = 0;
		@Override
		public void action(Node p) 
		{
			count++;
		}		
	}
	@Override
	public int size() 
	{
		SizeVisitor v = new SizeVisitor();
		visit(root, v);
		return v.count;
	}

	//Получить количество листьев
	@Override
	public int leaves()
	{
		LeavesVisitor v = new LeavesVisitor();
		visit(root, v);
		return v.count;
	}
	private class LeavesVisitor implements Visitor
	{
		int count = 0;
		@Override
		public void action(Node p) 
		{
			if(p.left == null && p.right == null)
			{
				count++;	
			}			
		}		
	}

	//Получить количество узлов (хотя бы 1 потомок)	
	@Override
	public int nodes()
	{
		NodeVisitor v = new NodeVisitor();
		visit(root, v);
		return v.count;
	}
	private class NodeVisitor implements Visitor
	{
		int count = 0;
		@Override
		public void action(Node p) 
		{
			if(p.left != null || p.right != null)
			{
				count++;	
			}			
		}		
	}

	//Получить количество уровней (высота дерева)
	@Override
	public int height() 
	{
		return nodeHeight(root);
	}
	private int nodeHeight(Node p) 
	{
		if (p == null)
			return 0;

		return 1 + Math.max(nodeHeight(p.left), nodeHeight(p.right));
	}

	//Ширина дерева (максимальное количество узлов на любом уровне)	
	@Override
	public int width() 
	{
		if (size() == 0)
			return 0;
		int[] ar = new int[height()];
		nodeWidth(root, ar, 0);
		return max(ar);
	}
	private void nodeWidth(Node p, int[] ar, int level) 
	{
		if (p == null)
			return;

		nodeWidth(p.left,  ar, level+1);
		ar[level]++;
		nodeWidth(p.right, ar, level+1);
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
	@Override
	public String toString() 
	{
		return toString(root);
	}
	private String toString(Node p) 
	{
		if (p == null)
			return "";

		return toString(p.left) + p.val + ", " + toString(p.right);
	}

	//Получить массив через LVR дерева
	private class Counter
	{
		int index = 0;
	}
	@Override
	public int[] toArray() 
	{
		int[] ar = new int[size()];
		nodeToArray(root, ar, new Counter());
		return ar;
	}
	private void nodeToArray(Node p, int[] ar, Counter ii) 
	{
		if (p == null)
			return;

		nodeToArray(p.left,  ar, ii);
		ar[ii.index++] = p.val;
		nodeToArray(p.right, ar, ii);
	}

	//Зеркально пересадить дерево
	@Override
	public void revers()
	{
		reverseNode(root);
	}
	private void reverseNode(Node p) 
	{
		if (root == null)
			return;

		Node tmp = p.left;
		p.left = p.right;
		p.right = tmp;

		reverseNode(p.left);
		reverseNode(p.right);
	}

	//Удаление элемента по ключу
	@Override
	public void del(int key) 
	{
		Node current = root;
		Node parent = root;
		boolean isleft = true;

		while (current.val != key) 
		{
			parent = current;
			if (key < current.val) 
			{
				isleft = true;
				current = current.left;
			} 
			else 
			{
				isleft = false;
				current = current.right;
			}
			if (current == null)
				return;
		}
		if (current.left == null && current.right == null) 
		{
			if (current == root)
				root = null;
			else if (isleft)
				parent.left = null;
			else
				parent.right = null;
		} 
		else if (current.right == null)
			if (current == root)
				root = current.left;
			else if (isleft)
				parent.left = current.left;
			else
				parent.right = current.left;
		else if (current.left == null)
			if (current == root)
				root = current.right;
			else if (isleft)
				parent.left = current.right;
			else
				parent.right = current.right;
		else 
		{
			Node successor = getSuccessor(current);
			if (current == root)
				root = successor;
			else if (isleft)
				parent.left = successor;
			else
				parent.right = successor;
			successor.left = current.left;
		}
	}
	private Node getSuccessor(Node delNode) 
	{
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.right;
		while (current != null) 
		{
			successorParent = successor;
			successor = current;
			current = current.left;
		}
		if (successor != delNode.right) 
		{
			successorParent.left = successor.right;
			successor.right = delNode.right;
		}
		return successor;
	}
}
