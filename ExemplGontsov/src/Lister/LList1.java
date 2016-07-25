package Lister;

public class LList1 implements EList
{
	class Node
	{
		int val;
		Node next = null;
		public Node (int val)
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
	public void init(int[] ini) 
	{	
		if (ini == null)
		{
			ini = new int [0];
		}
		for (int i = ini.length-1; i >= 0; i--) 
		{
			addStart(ini[i]);
		}
	}

	@Override
	public int[] toArray()
	{
		int[] ret = new int [size()];
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
		//		вывод напрямую из LList
		//		String str = "";
		//		Node p = root;
		//		do
		//		{
		//			str += p.val;
		//			p = p.next;
		//			if(p.next != null)
		//			{
		//				str += ",";
		//			}
		//			System.out.println(str);
		//		}
		//		while(p.next != null);

		//		вывод через toArray
		String str = "";
		int [] ar = toArray();
		for (int i = 0; i < ar.length; i++) 
		{
			str += ar[i];
			if(i < ar.length-1)
				str += ",";
		}
		return str;
	}


	@Override
	public int get(int pos) 
	{
		if(pos<0||pos>=size()||root == null)
			throw new IllegalArgumentException();
		int ret;
		Node tmp = root;
		for (int i=0; i<pos; i++)
		{
			tmp = tmp.next;
		}
		ret = tmp.val;

		return ret;
	}

	@Override
	public void set(int pos, int val)
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
	public int min() 
	{
		Node p = root;
		for(int i=0; i<minPos(); i++)
		{
			p = p.next;
		}
		return p.val;
	}

	@Override
	public int max()
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
		int val = p.val;
		int ret = 0;
		for(int i=0; i<size(); i++)
		{
			if( val > p.val )
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
		int val = p.val;
		int ret = 0;
		for(int i=0; i<size(); i++)
		{
			if( val < p.val )
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
				if (p.val > p.next.val) 
				{
					int tmp = p.val;
					p.val = p.next.val;
					p.next.val = tmp;
				}
				p = p.next;
			}
			p=root;
		}

		/*
		 * говнокод через массив
		int [] ar = toArray();
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = 0; j < ar.length-1; j++) 
			{
				if(ar[j] > ar[j+1])
				{
					int tmp = ar[j];
					ar[j]   = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
		clear();
		init(ar);
		 */
	}

	@Override
	public void revers() 
	{
		Node p = root;
		while(p.next != null) 
			{
				p.next.next = p.next;
				p = p.next;
			}
	}

	@Override
	public void halfRevers() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public int delStart()
	{
		if( size() == 0){
			throw new IllegalArgumentException();
		} 
		Node p = root;
		int tmp = p.val; 
		root = p.next;
		return tmp;
	}

	@Override
	public int delEnd()
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
			int tmp = p.val;
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
	public int delPos(int pos) 
	{
		if (root == null)
		{
			throw new IllegalArgumentException();
		}
		int ret;
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
	public void addStart(int val) 
	{
		Node p = new Node (val);
		p.next = root;
		root = p;
	}

	@Override
	public void addEnd(int val)
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
	public void addPos(int pos, int val) 
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

}
