

import java.util.Iterator;

public class HTableLine implements Iterable<Integer>
{
	int size = 97;
	private Person[] ar;
	
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
		
	}
	
	public int size()
	{
		return size;
	}
//	@Override
	public Person[] toArray()
	{
		Person[] tmp = new Person[size];
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
		Person[] ar;
		int i;
		int index;
		
		public MyIter(Person[] ar, int index)
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
			return 0;//ar[i++];
		}
		
	}
}