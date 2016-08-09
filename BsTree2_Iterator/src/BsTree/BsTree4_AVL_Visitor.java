package BsTree;

import java.util.Iterator;

public class BsTree4_AVL_Visitor implements EBsTree, Iterable<Integer>
{
	class Node 
	{
		int val;
		byte height;
		Node left;
		Node right;

		public Node(int val) 
		{
			this.val = val;
			this.left = null;
			this.right = null;
			this.height = 1;			
		}
	}	
	protected Node root = null;

	private byte height (Node p)
	{
		return p != null ? p.height : 0 ;
	}
	private int bFactor (Node p)
	{
		return height(p.right)-height(p.left);
	}
	private void fixHeight (Node p)
	{
		byte hl = height(p.left);
		byte hr = height(p.right);
		p.height = (byte) ((hl > hr ? hl : hr) + 1);
	}
	private Node rotateRight (Node p) // поворот вокруг элемента ВПРАВО
	{
		Node tmp = p.left;
		p.left = tmp.right;
		tmp.right = p;
		fixHeight(p);
		fixHeight(tmp);	
		return tmp;
	}
	private Node rotateLeft (Node p) // поворот вокруг элемента ВЛЕВО
	{
		Node tmp = p.right;
		p.right = tmp.left;
		tmp.left = p;
		fixHeight(p);
		fixHeight(tmp);	
		return tmp;
	}
	private Node balance (Node p) //балансировка узла
	{
		fixHeight(p);
		if( bFactor(p) == 2)
		{
			if( bFactor(p.right)< 0 )
			{
				p.right = rotateRight(p.right);
			}
			return rotateLeft(p);
		}
		if( bFactor(p) == -2)
		{
			if( bFactor(p.left)> 0 )
			{
				p.left = rotateLeft(p.left);
			}
			return rotateRight(p);
		}
		return p;
	}
	private Node insert(Node p, int val) // вставка элемента
	{
		if( p == null )
		{ 
			return new Node(val);
		}
		if( val < p.val )
		{
			p.left = insert(p.left, val);
		}
		else
		{
			p.right = insert(p.right,val);
		}
		return balance(p);
	}
	private Node findMin(Node p)
	{
		return p.left != null ? findMin(p.left) : p ;
	}
	private Node removeMin (Node p)
	{
		if ( p.left == null)
		{
			return p.right;
		}
		p.left = removeMin(p.left);
		return balance(p);
	}
	private Node remove (Node p, int val)
	{
		if ( p == null )
		{
			return null;
		}
		if (val < p.val)
		{
			p.left = remove (p.left, val);
		}
		else if ( val > p.val)
		{
			p.right = remove (p.right, val);
		}
		else // k == p.val
		{
			Node q = p.left;
			Node r = p.right;
///////////////////////////////////////////////delete p; // подстава!!!!
			if ( r == null)
			{
				return q;
			}
			Node min = findMin(r);
			min.right = removeMin(r);
			min.left = q;
			return balance(min);
		}
		return balance(p);
	}

	@Override
	public void init(int[] ini) //Инициализация 
	{
		if (ini == null)
			ini = new int[0];

		for (int i = 0; i < ini.length; i++) 
		{
			add(ini[i]);
		}
	}

	@Override
	public void add(int val) //Добавление узла со значением 
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

	@Override
	public void clear()  //Очистка дерева
	{
		root = null;
	}

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

	@Override
	public void print() //Печать в консоль 
	{
		PrintVizitor v = new PrintVizitor();
		visit(root, v);
		System.out.print(v.str);
	}
	private class PrintVizitor implements Visitor
	{
		String str = "";
		@Override
		public void action(Node p) 
		{
			str += p.val+", ";
		}		
	}

	private class SizeVisitor implements Visitor  //Получить количество всех узлов в дереве (с потомками и без) 
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

	@Override
	public int leaves()  //Получить количество листьев
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

	@Override
	public int nodes()  //Получить количество узлов (хотя бы 1 потомок)	
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

	@Override
	public String toString()  //Получить String через LVR дерева
	{
		ToStringVisitor v = new ToStringVisitor();
		visit(root, v);
		return v.str;
	}
	private class ToStringVisitor implements Visitor
	{
		String str = "";
		@Override
		public void action(Node p) 
		{
			str += p.val+", ";
		}		
	}

	@Override
	public int[] toArray()  //Получить массив через LVR дерева
	{
		ToArrayVisitor v = new ToArrayVisitor();
		visit( root , v );
		return v.rez;
	}
	private class ToArrayVisitor implements Visitor
	{
		int[] rez = new int [size()];
		int i = 0;
		@Override
		public void action(Node p) 
		{
			rez[i++] = p.val;	
		}			
	}

	@Override
	public int height() //Получить количество уровней (высота дерева)
	{
		return nodeHeight(root);
	}
	private int nodeHeight(Node p) 
	{
		if (p == null)
			return 0;

		return 1 + Math.max(nodeHeight(p.left), nodeHeight(p.right));
	}

	@Override
	public int width() //Ширина дерева (максимальное количество узлов на любом уровне)	
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

	@Override
	public void revers()  //Зеркально пересадить дерево
	{
		reverseNode(root);
	}
	private void reverseNode(Node p) 
	{
		if (p == null)
			return;

		Node tmp = p.left;
		p.left = p.right;
		p.right = tmp;

		reverseNode(p.left);
		reverseNode(p.right);
	}

	@Override
	public void del(int key) //Удаление элемента по ключу
	{
		if( root == null)
			throw new IllegalArgumentException();

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

	//	@Override
	public boolean equals(BsTree4_AVL_Visitor tree2) 
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

	@Override
	public boolean check() // реализован в BsTreeLinked, здесь не актуален. всегда true
	{		
		return true;
	}
}