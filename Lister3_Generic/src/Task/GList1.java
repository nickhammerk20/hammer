package Task;

import java.util.Iterator;

public class GList1<T> implements GList<T>
{
	class Node
	{
		T val;
		Node next = null;
		public Node (T val)
		{
			this.val = val;
		}
	}

	Node root = null;

	@Override
	public void clear() 
	{
		root = null;
	}

	@Override
	public int size() 
	{
		int count = 0;

		Node p = root;
		while (p!= null)
		{
			count++;
			p = p.next;
		}
		return count;
	}

	@Override
	public void init(T[] ini) 
	{	
		if (ini == null)
		{
			ini = (T[]) new Comparable [0];
		}
		for (int i = ini.length-1; i >= 0; i--) 
		{
			addStart(ini[i]);
		}
	}

	@Override
	public T[] toArray()
	{
		T[] ret = (T[]) new Comparable [size()];
		Node p = root;
		for (int i = 0; i < ret.length; i++) 
		{
			ret [i] = p.val;
			p = p.next;
		}
		return ret;
	}

	@Override
	public String toString() 
	{
		String str = "";
		T[] ar = toArray();
		for (int i = 0; i < ar.length; i++) 
		{
			str += ar[i];
			if(i < ar.length-1)
				str += ",";
		}
		return str;
	}


	@Override
	public T get(int pos) 
	{
		if(pos<0||pos>=size()||root == null)
			throw new IllegalArgumentException();
		T ret;
		Node tmp = root;
		for (int i=0; i<pos; i++)
		{
			tmp = tmp.next;
		}
		ret = tmp.val;

		return ret;
	}

	@Override
	public void set(int pos, T val)
	{
		if(pos<0||pos>=size()||root == null)
			throw new IllegalArgumentException();

		Node tmp = root;
		for (int i=0; i<pos; i++)
		{
			tmp = tmp.next;
		}
		tmp.val = val;
	}

	@Override
	public T min() 
	{
		Node p = root;
		for(int i=0; i<minPos(); i++)
		{
			p = p.next;
		}
		return p.val;
	}

	@Override
	public T max()
	{
		Node p = root;
		for(int i=0; i<maxPos(); i++)
		{
			p = p.next;
		}
		return p.val;
	}

	@Override
	public int minPos() 
	{
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		Node p = root;
		T val = p.val;
		int ret = 0;
		for(int i=0; i<size(); i++)
		{
			/**через копарабле**/
			if( 1 == ((Comparable) val).compareTo(p.val))
//			if( val > p.val )
			{
				val = p.val;
				ret = i;
			}
			p = p.next;
		}
		return ret;
	}

	@Override
	public int maxPos() 
	{
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		Node p = root;
		T val = p.val;
		int ret = 0;
		for(int i=0; i<size(); i++)
		{
			/**через копарабле**/
			if( -1 == ((Comparable) val).compareTo(p.val))
//			if( val < p.val )
			{
				val = p.val;
				ret = i;
			}
			p = p.next;
		}
		return ret;
	}

	@Override
	public void sort() 
	{
		Node p = root;
		for (int i = 0; i < size()-1; i++) 
		{
			while(p.next != null) 
			{
				/**через копарабле**/
				if( 1 == ((Comparable) p.val).compareTo(p.next.val))
//				if (p.val > p.next.val) 
				{
					T tmp = p.val;
					p.val = p.next.val;
					p.next.val = tmp;
				}
				p = p.next;
			}
			p=root;
		}
	}

	@Override
	public void revers() 
	{
		if (root == null || root.next == null)
			return;

		Node curent = null;
		Node next = null;
		while(root != null)
		{
			next = root.next; 
			root.next = curent;
			curent = root;
			root = next;
		}
		root = curent;	
	}

	@Override
	public void halfRevers() 
	{
		if (root == null || root.next == null)
			return;

		Node p = root;
		GList1 lstNew = new GList1();
		int j = 0;
		for ( int i = 0 ; i < size() ; i++ )
		{
			if ( i < size() / 2 )
			{
				lstNew.addEnd(p.val);
			}
			else
			{
				if ( size() % 2 != 0  && i == size() / 2 )
				{
					lstNew.addStart(p.val);
				}
				else
				{
					lstNew.addPos(j++, p.val);
				}
			}
			p = p.next;
		}
		root = lstNew.root;
	}

	@Override
	public T delStart()
	{
		if( size() == 0){
			throw new IllegalArgumentException();
		} 
		Node p = root;
		T tmp = p.val; 
		root = p.next;
		return tmp;
	}

	@Override
	public T delEnd()
	{
		if( size() == 0)
		{
			throw new IllegalArgumentException();
		} 
		if( size() == 1)
		{
			return delStart();
		} 
		else
		{
			Node p = root;
			while (p.next != null)
			{
				p = p.next;
			}
			T tmp = p.val;
			p = root;
			for (int i = 1; i < size()-1; i++)
			{
				p = p.next;
			}
			p.next = null;
			return tmp;
		}
	}

	@Override
	public T delPos(int pos) 
	{
		if (root == null)
		{
			throw new IllegalArgumentException();
		}
		T ret;
		if (pos == 0) 
		{
			return delStart();
		}
		else
		{
			Node prev = root;
			int count = 1;
			while( count < pos )
			{
				prev = prev.next;
				count++;
			}
			Node curent = prev.next;
			prev.next = curent.next;
			ret = curent.val;
		}
		return ret;
	}


	@Override
	public void addStart(T val) 
	{
		Node p = new Node (val);
		p.next = root;
		root = p;
	}

	@Override
	public void addEnd(T val)
	{
		Node p = root;
		if ( p == null)
		{
			root = new Node(val);
		}
		else
		{
			Node tmp = new Node (val);
			while (p.next != null)
			{
				p = p.next;
			}		
			p.next = tmp;
		}
	}

	@Override
	public void addPos(int pos, T val) 
	{
		if (pos == 0) 
		{
			addStart(val);
		}
		else
		{
			Node newNode = new Node (val);
			Node prev = root;
			int count = 1;
			while( count < pos )
			{
				prev = prev.next;
				count++;
			}
			Node curent = prev.next;
			newNode.next = curent;
			prev.next = newNode;
		}
	}

	@Override
	public Iterator<T> iterator() 
	{
		return (Iterator<T>) new MyIter(root);
	}
	class MyIter implements Iterator<T>
	{
		Node p = null;
		public MyIter(Node p) 
		{
			this.p = p;
		}
		@Override
		public boolean hasNext() 
		{
			return p != null;
		}

		@Override
		public T next() 
		{
			T ret = p.val;
			p = p.next;
			return ret;
		}		
	}
}
