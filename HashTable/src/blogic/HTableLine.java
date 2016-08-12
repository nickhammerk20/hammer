package blogic;


import java.util.Iterator;

import blogic.HTableChane.Node;

public class HTableLine
{
	int size = 97;
	private Person[] ar;
	private int count = 0;

	public HTableLine()
	{
		ar = new Person[size];
	}
	public HTableLine(int size)
	{
		this.size=size;
		ar = new Person[size];
	}

	public void clear()
	{
		ar = new Person[size];
		count = 0;
	}


	public void init(Person[] ini)
	{
		if(ini == null)
		{
			return;
		}
		for (int i = 0; i < ini.length; i++)
		{
			add(ini[i]);
		}
	}

	public void add(Person p)
	{
		int xz = p.hashCode();
		int i = xz % size;
//		System.out.println("Person " + p.getFname() +", xz " + xz + ", i " + i);
		for( ; i < size ; )
		{
			if ( ar[i] == null )
			{
				ar[i] = p;
				count++;
				break;
			}
			i++;
		}
	}

	public int size()
	{
		return count;
	}
	public double pow()
	{
		double z = (int) ( (double) size() / (double) size * 10000);
		double rez = (double) z / 100;
		return rez;
	}
	public Person get(Person p)
	{
		if( count == 0 )
			throw new IllegalArgumentException();

		return get(p.hashCode());
	}
	public Person get(int xz)
	{
		Person ret = null;

		return ret;
	}

	public void del(Person p)
	{
		if(count == 0)
			throw new IllegalArgumentException();

		del(p.hashCode());
	}
	public void del(int xz)
	{

	}

	public Person[] toArray()
	{
		Person[] tmp = new Person[count];
		int j = 0;
		for (int i = 0; i < size; i++)
		{
			if( ar[i] != null)
			{
				tmp[j] = ar[i];
				j++;
			}
		}
		return tmp;
	}


	//	//	@Override
	//	public Iterator<Integer> iterator() 
	//	{
	//		return new MyIter(ar, size);
	//	}
	//	class MyIter implements Iterator<Integer>
	//	{
	//		Person[] ar;
	//		int i;
	//		int index;
	//
	//		public MyIter(Person[] ar, int index)
	//		{
	//			this.ar = ar;
	//			this.index = index;			
	//		}
	//		@Override
	//		public boolean hasNext() 
	//		{
	//			return i < index;
	//		}
	//
	//		@Override
	//		public Integer next() 
	//		{
	//			return i++;
	//		}		
	//	}
}