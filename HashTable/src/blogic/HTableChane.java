package blogic;


import java.util.Iterator;

public class HTableChane implements Iterable<Integer>
{
	class Node
	{
		Person val;
		Node next;
		public Node(Person p) 
		{
			val = p;
		}
	}
	int size = 97;
	private Node[] ar;
	private int count = 0;

	public HTableChane()
	{
		ar = new Node[size];
	}
	public HTableChane(int size)
	{
		this.size = size;
		ar = new Node[size];
	}

	public void clear()
	{
		ar = new Node[size];
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
		Node np = new Node(p);
		np.next = ar[i];
		ar[i] = np;
		count++;
	}

	public Person get(int xz)
	{
		Person ret = null;
		Node np = ar[xz%size];
		while(np != null)
		{
			if (np.val.hashCode() == xz)
			{
				ret = np.val;
				break;
			}
			np = np.next;			
		}		
		return ret;
	}
	public Person get(Person p)
	{
		if (count == 0 )
			throw new IllegalArgumentException();
		
		return get(p.hashCode());
	}
	
	public double pow()
	{
		double z = (int) ( (double) size() / (double) size * 10000);
		double rez = (double) z / 100;
		return rez;		
	}

	public int size()
	{
		return count;
	}

	public boolean equals()
	{
		boolean ret = true;

		return ret;
	}

	//	@Override
	public Node[] toArray()
	{
		Node[] tmp = new Node[count];
		for (int i = 0; i < size; i++)
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}

	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(ar, size);
	}
	class MyIter implements Iterator<Integer>
	{
		Node[] ar;
		int i = 0;
		int index;

		public MyIter(Node[] ar, int index)
		{
			this.ar = ar;
			this.index = index;			
		}
		@Override
		public boolean hasNext() 
		{
			return i < index;
		}

		@Override
		public Integer next() 
		{

			return i++;
		}		
	}
}