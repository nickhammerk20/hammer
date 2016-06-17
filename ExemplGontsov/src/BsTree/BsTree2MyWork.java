package BsTree;

public class BsTree2MyWork implements EBsTree
{
	String str = "";
	int count = 0;
	int size = 0;
	int countNode = 0;
	int leftHeight = 0;
	int rightHeight = 0;
	int [] array;
	int arraySize = 0;

	class Node
	{
		int val;
		Node left = null;
		Node right = null;

		public Node (int val)
		{
			this.val = val;
		}
	}
	Node root = null;

	@Override
	public void print()/*готово*/
	{
		printNode (root);
	}

	private void printNode (Node p)/*готово*/
	{
		if (p ==null)
			return;

		printNode(p.left);
		System.out.print(p.val+", ");
		printNode(p.right);
	}

	@Override
	public void add(int val) /*готово*/
	{
		if (root == null)
		{
			root = new Node(val);
			return;
		}
		addNode(root, val);
	}

	private void addNode(Node p, int val)/*готово*/
	{
		if(val<p.val)
		{
			if(p.left == null)
				p.left=new Node(val);
			else
				addNode(p.left, val);
		}
		else
		{
			if(p.right == null)
				p.right=new Node(val);
			else
				addNode(p.right, val);			
		}
	}

	@Override
	public int size()/*готово*/
	{
		return sizeNode(root);
	}

	private int sizeNode (Node p)/*готово*/
	{
		if (p==null)
			return 0;

		/*первый вариант подсчета
		 * 	return 1 + sizeNode(p.left) + sizeNode(p.right);
		 */
		// второй вариант
		int ret = 0;
		ret += sizeNode(p.left);
		ret +=1;
		ret += sizeNode(p.right);
		return ret;
	}

	@Override
	public void clear()/*готово*/ 
	{
		root = null;
	}

	@Override
	public void init(int[] in) /*готово*/
	{
		//		if (in == null)
		//			in = new int[0];
		//		for (int i = 0; i < in.length; i++) 
		//		{
		//			add(in[i]);
		//		}


		if (in == null)
		{
			in = new int[0];
			return;
		}
		for (int i = 0; i < in.length; i++) 
		{
			add(in[i]);
		}
	}

	@Override
	public String toString() /*готово*/
	{
		String rez = toStringNode(root);
		System.out.println("toString() "+ rez);
		return rez;
	}

	private String toStringNode(Node p) /*готово*/
	{
		if (p == null)
			return "";

		toStringNode(p.left);
		str += p.val+", ";
		System.out.println("toStringNode(Node p)"+str);
		toStringNode(p.right);	

		return str;
	}

	@Override
	public int [] toArray() /*готово*/
	{
		array = new int [size()];
		toArrayNode(root);
		arraySize = 0;
		return array;
	}

	private int [] toArrayNode(Node p) /*готово*/
	{
		if (p == null)
		{
			return array;
		}
		toArrayNode(p.left);
		System.out.println("значение "+p.val+" индекс массива "+ arraySize );
		array[arraySize] = p.val;
		arraySize++;
		toArrayNode(p.right);	

		return array;
	}

	@Override
	// считает кол-во листьев
	public int leaves() /*готово*/
	{
		return leavesNode(root);
	}
	private int leavesNode(Node p) /*готово*/
	{
		if (p==null)
		{
			return 0;
		}
		leavesNode(p.left);
		leavesNode(p.right);
		if(p.left == null && p.right == null)
		{
			count ++;
		}
		return count;
	}
	

	@Override
	// считает кол-во узлов (у кого есть хоть 1 потомок)
	public int nodes() 
	{
		return nodesNode(root);
	}
	private int nodesNode(Node p) /*готово*/
	{
		if (p==null)
		{
			return 0;
		}
		leavesNode(p.left);
		if(p.left != null && p.right != null)
		{
			count ++;
		}
		leavesNode(p.right);
		
		return count;
	}
	@Override
	// считает кол-во уровней самой большой ветки
	public int height() 
	{
		return 0;
	}

	@Override
	// ширина, масксимальное кол-во элементов на любом уровне
	public int width() 
	{
		return 0;
	}

	@Override
	public void revers()
	{

	}

	@Override
	//удалить элемент не ломая дерева
	public void del(int val)
	{
				
	}

//	private void delNode(Node p, int val) 
//	{
//		if(val<p.val)
//		{
//			if(p.left == null)
//				p.left=new Node(val);
//			else
//				addNode(p.left, val);
//		}
//		else
//		{
//			if(p.right == null)
//				p.right=new Node(val);
//			else
//				addNode(p.right, val);			
//		}
//	}

//	private void delNode_dont_work(Node p, int del) 
//	{
		//		Node x = root, y = null;
		//		while ( x != null)
		//		{
		//			int value = x.val;
		//			int cmp = del.compareTo(value);
		//			if (cmp == 0) 
		//			{
		//				break;
		//			} 
		//			else 
		//			{
		//				y = x;
		//				if (cmp < 0) 
		//				{
		//					x = x.left;
		//				} 
		//				else 
		//				{
		//					x = x.right;
		//				}
		//			}
		//		}
		//		if (x == null) 
		//		{
		//			return;
		//		}
		//		if (x.right == null)
		//		{
		//			if (y == null) 
		//			{
		//				root = x.left;
		//			} 
		//			else
		//			{
		//				if (x == y.left) 
		//				{
		//					y.left = x.left;
		//				} 
		//				else
		//				{
		//					y.right = x.left;
		//				}
		//			}
		//		} 
		//		else
		//		{
		//			Node leftMost = x.right;
		//			y = null;
		//			while (leftMost.left != null) 
		//			{
		//				y = leftMost;
		//				leftMost = leftMost.left;
		//			}
		//			if (y != null) 
		//			{
		//				y.left = leftMost.right;
		//			} 
		//			else 
		//			{
		//				x.right = leftMost.right;
		//			}
		//			x.left = leftMost.left;
		//			x.val = leftMost.val;
		//		}
//	}
}