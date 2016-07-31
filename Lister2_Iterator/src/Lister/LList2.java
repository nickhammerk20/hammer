package Lister;

import java.util.Iterator;

import Lister.LList1.Node;

public class LList2 implements EList, Iterable<Integer>
{
	class Node
	{
		int val;
		Node next = null;
		Node prev = null;
		public Node (int val)
		{
			this.val = val;
		}
	}

	Node start = null;
	Node end = null;

	/**
	 * 
	 * обнулили начало и конец списка++
	 * 
	 */
	@Override
	public void clear() 
	{
		start = null;
		end = null;
	}

	/**
	 * 
	 * посчитали кол-во Node перебором от начала до конца списка
	 * не работало при обратном порядке
	 * 
	 */
	@Override
	public int size() 
	{
		int count = 0;

		Node p = end;
		while (p!= null)
		{
			count++;
			p = p.prev;
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
		Node p = start;
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
		if(pos<0||pos>=size()||start == null)
			throw new IllegalArgumentException();
		int ret;
		Node tmp = start;
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
		if(pos<0||pos>=size()||start == null)
			throw new IllegalArgumentException();

		Node tmp = start;
		for (int i=0; i<pos; i++)
		{
			tmp = tmp.next;
		}
		tmp.val = val;
	}

	@Override
	public int min() 
	{
		Node p = start;
		for(int i=0; i<minPos(); i++)
		{
			p = p.next;
		}
		return p.val;
	}

	@Override
	public int max()
	{
		Node p = start;
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
		Node p = start;
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
		Node p = start;
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
		Node p = start;
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
			p=start;
		}
	}

	@Override
	public void revers() 
	{
		if(start == null || start.next == null)
			return;

		LList2 obj = new LList2();
		Node tmp = end;
		int size = size();

		for (int i=0; i < size; i++)
		{
			obj.addEnd(tmp.val);
			tmp = tmp.prev;
		}

		start = obj.start;
		end = obj.end; 

	}

	@Override
	public void halfRevers() 
	{
		if (start == null || start.next == null)
			return;

		Node p = start;
		LList2 lstNew = new LList2();
		int j = 0;
		if ( size() % 2==0)
		{
			for ( int i = 0 ; i < size() ; i++ )
			{
				if ( i < size() / 2)
				{
					lstNew.addEnd(p.val);
				}
				else
				{
					lstNew.addPos(j++, p.val);
				}
				p = p.next;
			}
		}
		else
		{
			for ( int i = 0 ; i < size() ; i++ )
			{
				if ( i < size() / 2)
				{
					lstNew.addEnd(p.val);
				}
				else if ( size() % 2!=0  && i == size() / 2 )
				{
					lstNew.addStart(p.val);
				}
				else if ( i > size() / 2)
				{
					lstNew.addPos(j++, p.val);
				}
				p = p.next;
			}
		}
		start = lstNew.start;
	}


	@Override
	public int delStart()
	{
		if( size() == 0){
			throw new IllegalArgumentException();
		} 
		int tmp = 0;
		if( size() == 1){
			tmp = start.val;
			clear();
			return tmp;
		}

		//		Node p = start;
		tmp = start.val; 

		start = start.next; 
		start.prev = null;

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
			Node p = start;
			for (int i = 1; i < size()-1; i++)
			{
				p = p.next;
			}
			int tmp = p.next.val;
			p.next = null;
			end = p;
			return tmp;
		}
	}

	@Override
	public int delPos(int pos) 
	{
		if (start == null)
		{
			throw new IllegalArgumentException();
		}
		int ret;
		if (pos == 0) 
		{
			return delStart();
		}
		if (pos == size()-1) 
		{
			return delEnd();
		}
		else
		{
			Node previous = start;
			int count = 1;
			while( count < pos )
			{
				previous = previous.next;
				count++;
			}
			ret = previous.next.val;
			previous.next = previous.next.next;
			previous.next.prev = previous;
		}
		return ret;
	}


	@Override /**++++*/
	public void addStart(int val) 
	{
		Node tmp = new Node(val);

		if (start == null)
		{
			start = tmp;
			end = tmp;
		}
		else
		{
			tmp.next = start;
			start.prev = tmp;
			start = tmp;
		}
	}

	@Override
	public void addEnd(int val)
	{
		Node tmp = new Node(val);

		if (end == null)
		{
			end = tmp;
			start = tmp;
		}
		else
		{
			end.next = tmp;
			tmp.prev = end;
			end = tmp;
		}
	}

	@Override /**+++*/
	public void addPos(int pos, int val) 
	{
		if (pos == 0) 
		{
			addStart(val);
		}
		else
		{
			Node newNode = new Node (val);

			Node previus = start;
			int count = 1;
			while( count < pos )
			{
				previus = previus.next;
				count++;
			}

			Node curent = previus.next;
			newNode.next = curent;
			previus.next = newNode;
			curent.prev = newNode; 
			newNode.prev = previus;
		}
	}



	/** 	
	 * изначальный Итератор ни чем не отличается от LList1, 
	 * но в этом примере используется итератор через массив как пример из AList0
	 * */

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
