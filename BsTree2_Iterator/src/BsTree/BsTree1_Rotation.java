package BsTree;

import java.util.Iterator;
import java.util.Stack;

public class BsTree1_Rotation implements EBsTree
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

	//Печать в консоль ++
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

	//Инициализация ++
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

	//Добавление узла со значением ++
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

	//Очистка дерева ++
	@Override
	public void clear() 
	{
		root = null;
	}

	//Получить количество всех узлов в дереве (с потомками и без) ++
	@Override
	public int size() 
	{
		return sizeNode( root );
	}
	private int sizeNode(Node p) 
	{
		if (p == null)
			return 0;

		return sizeNode(p.left) + 1 + sizeNode(p.right);
	}

	//Получить количество листьев++
	@Override
	public int leaves()
	{
		return nodeLeaves(root);
	}
	private int nodeLeaves(Node p) 
	{
		if (p == null)
			return 0;

		int ret = 0;

		ret += nodeLeaves(p.left);			
		if (p.left == null && p.right == null)
			ret++;
		ret += nodeLeaves(p.right);

		return ret;
	}

	//Получить количество узлов (хотя бы 1 потомок)	++
	@Override
	public int nodes()
	{
		return nodeNodes(root);
	}
	private int nodeNodes(Node p) 
	{
		if (p == null)
			return 0;

		int ret = 0;

		ret += nodeNodes(p.left);			
		if (p.left != null || p.right != null)
			ret++;
		ret += nodeNodes(p.right);

		return ret;
	}

	//Получить количество уровней (высота дерева)++
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
		if (p == null)
			return;

		//		System.out.println(p.val);
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
		if( root == null)
			throw new IllegalArgumentException();

		Node current = root;
		Node parent = root;
		boolean isleft = true;

		while (current.val != key)   /** ищем узел */
		{
			parent = current;
			if (key < current.val)  /** поиск идет влево */
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
		/** узел найден*/
		/**проверяем есть ли потомки у узла*/
		if (current.left == null && current.right == null) //потомков нет, самый простой вариант 
		{
			if (current == root) 			// если в дереве один элемент, обнулили дерево
				root = null;
			else if (isleft) 				// если левый потомок, обнуляем его
				parent.left = null;
			else							// если правцый потомок, обнуляем его
				parent.right = null;
		} 
		/**удаление узла с одним потомком*/
		else if (current.right == null) 	// проверяем наличие правого потомка
			if (current == root)			// перепривязываем левый элемент вместо удаляемого
				root = current.left;
			else if (isleft)				// 
				parent.left = current.left;	// 
			else
				parent.right = current.left;
		else if (current.left == null) 		// нет левого потомка
			if (current == root)			// перепревязываем правый элемент вместо удаляемого
				root = current.right;
			else if (isleft)
				parent.left = current.right;
			else
				parent.right = current.right;

		/** удаление узла с двумя потомками (вращением)*/
		else 
		{	
			Node maxLeft = maxLeft(current);
			maxLeft.right = current.right;
			current = current.left;
			if( isleft )
			{
				parent.left = current;
			}
			else
			{
				parent.right = current;
			}
		}
	}
	private Node maxLeft(Node old) 
	{
		Node pp = old.left;
		while(pp.right != null )
		{
			pp = pp.right;
		}
		return pp;
	}

	/***********************/
	/*****add Iterator******/
	/***********************/
	/*http://www.programcreek.com/2014/04/leetcode-binary-search-tree-iterator-java/*/
	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(root);
	}
	class MyIter implements Iterator<Integer>
	{
		Stack<Node> stack;
		public MyIter(Node root) 
		{
			stack = new Stack<Node>();
			while (root != null) 
			{
				stack.push(root);
				root = root.left;
			}
		}

		@Override
		public boolean hasNext() 
		{
			return !stack.isEmpty();
		}

		@Override
		public Integer next() 
		{
			Node node = stack.pop();
			int result = node.val;
			//			if (node.right != null) 
			//			{
			//				node = node.right;
			//				while (node != null) 
			//				{
			//					stack.push(node);
			//					node = node.left;
			//				}
			//			}
			Node child = node.right;
			while (child != null) {
				stack.push(child);
				child = child.left;
			}			
			return result;
		}		
	}
	@Override
	public boolean check() 
	{
		// реализован в BsTreeLinked, здесь не актуален. всегда true
		return true;
	}

	//	@Override
	public boolean equals(BsTree1_Rotation tree2) 
	{
		return equalsTree(root, tree2.root);
	}
	private boolean equalsTree(Node tree1, Node tree2) 
	{
		if (tree1 == null && tree2 == null)
			return true;

		if (tree1 == null || tree2 == null)
			return false;

		if ( tree1.val == tree2.val )
		{
			return equalsTree(tree1.left, tree2.left) && equalsTree(tree1.right, tree2.right);
		}
		else
		{
			return false;
		}
	}
}