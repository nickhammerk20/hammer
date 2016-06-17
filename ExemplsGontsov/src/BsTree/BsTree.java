package BsTree;

public class BsTree //implements EBsTree
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

	//@Override
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

	//@Override
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

	//@Override
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

	//@Override
	public void clear()/*готово*/ 
	{
		root = null;
	}

	//@Override
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

	//@Override
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

	//@Override
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

	//@Override
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

	//@Override
	// считает кол-во узлов (у кого есть хоть 1 потомок)
	public int nodes() /*готово*/
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

	//@Override
	// считает кол-во уровней самой большой ветки
	public int height() 
	{
		return 0;
	}

	//@Override
	// ширина, масксимальное кол-во элементов на любом уровне
	public int width() 
	{
		return 0;
	}

	//@Override
	public void revers()
	{

	}

	//@Override
	//удалить элемент не ломая дерева
//	public boolean del(int key) // Удаление узла с заданным ключом
//	{ // (предполагается, что дерево не пусто)
//		Node current = root;
//		Node parent = root;
//		boolean isLeft = true;
//		while(current.val != key) // Поиск узла
//		{
//			parent = current;
//			if(key < current.val) // Двигаться налево?
//			{
//				isLeft = true;
//				current = current.left;
//			}
//			else // Или направо?
//			{
//				isLeft = false;
//				current = current.right;
//			}
//			if(current == null) // Конец цепочки
//				return false; // Узел не найден
//		}
//		// Удаляемый узел найден
//		// Продолжение...
//		//	}
//		// Продолжение delete()...
//		// Если узел не имеет потомков, он просто удаляется.
//		if(current.left==null &&
//				current.right==null)
//		{
//			if(current == root) // Если узел является корневым,
//				root = null; // дерево очищается
//			else if(isLeft)
//				parent.left = null; // Узел отсоединяется
//			else // от родителя
//				parent.right = null;
//		}
//		// Продолжение...
//		//	}
//		// Продолжение delete()...
//		// Если нет правого потомка, узел заменяется левым поддеревом
//		else if(current.right==null)
//			if(current == root)
//				root = current.left;
//			else if(isLeft) // Левый потомок родителя
//				parent.left = current.left;
//			else // Правый потомок родителя
//				parent.right = current.left;
//		// Если нет левого потомка, узел заменяется правым поддеревом
//		else if(current.left==null)
//			if(current == root)
//				root = current.right;
//			else if(isLeft) // Левый потомок родителя
//				parent.left = current.right;
//			else // Правый потомок родителя
//				parent.right = current.right;
//		// Продолжение...
//	}
//
//	private Node getSuccessor(Node delNode)
//	{
//		Node successorParent = delNode;
//		Node successor = delNode;
//		Node current = delNode.right; // Переход к правому потомку
//		while(current != null) // Пока остаются левые потомки
//		{
//			successorParent = successor;
//			successor = current;
//			current = current.left; // Переход к левому потомку
//		}
//		// Если преемник не является
//		if(successor != delNode.right) // правым потомком,
//		{ // создать связи между узлами
//			successorParent.left = successor.right;
//			successor.right = delNode.right;
//		}
//		return successor;
//	}
	
	 public boolean del(int key) // delete node with given key
     {                           // (assumes non-empty list)
     Node current = root;
     Node parent = root;
     boolean isLeft = true;

     while(current.val != key)        // search for node
        {
        parent = current;
        if(key < current.val)         // go left?
           {
           isLeft = true;
           current = current.left;
           }
        else                            // or go right?
           {
           isLeft = false;
           current = current.right;
           }
        if(current == null)             // end of the line,
           return false;                // didn't find it
        }  // end while
     // found node to delete

     // if no ren, simply delete it
     if(current.left==null &&
                                  current.right==null)
        {
        if(current == root)             // if root,
           root = null;                 // tree is empty
        else if(isLeft)
           parent.left = null;     // disconnect
        else                            // from parent
           parent.right = null;
        }

     // if no right , replace with left subtree
     else if(current.right==null)
        if(current == root)
           root = current.left;
        else if(isLeft)
           parent.left = current.left;
        else
           parent.right = current.left;

     // if no left , replace with right subtree
     else if(current.left==null)
        if(current == root)
           root = current.right;
        else if(isLeft)
           parent.left = current.right;
        else
           parent.right = current.right;

     else  // two ren, so replace with inorder successor
        {
        // get successor of node to delete (current)
        Node successor = getSuccessor(current);

        // connect parent of current to successor instead
        if(current == root)
           root = successor;
        else if(isLeft)
           parent.left = successor;
        else
           parent.right = successor;

        // connect successor to current's left 
        successor.left = current.left;
        }  // end else two ren
     // (successor cannot have a left )
     return true;                                // success
     }  // end delete()
//-------------------------------------------------------------
  // returns node with next-highest value after delNode
  // goes to right , then right 's left descendents
  private Node getSuccessor(Node delNode)
     {
     Node successorParent = delNode;
     Node successor = delNode;
     Node current = delNode.right;   // go to right 
     while(current != null)               // until no more
        {                                 // left ren,
        successorParent = successor;
        successor = current;
        current = current.left;      // go to left 
        }
                                          // if successor not
     if(successor != delNode.right)  // right ,
        {                                 // make connections
        successorParent.left = successor.right;
        successor.right = delNode.right;
        }
     return successor;
     }

}