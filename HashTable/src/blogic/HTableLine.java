package blogic;

import java.util.Iterator;

public class HTableLine implements Iterable<Person> 
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

	public void clear() // очистка таблицы
	{
		ar = new Person[size];
		count = 0;
	}


	public void init(Person[] ini) // инициализация ХэшТаблицы
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

	public void add(Person p) // добавить элемент
	{
		int xz = p.hashCode();
		int i = xz % size;
		System.out.println("Person " + p.getFname() +", xz " + xz + ", i " + i);
		int j = size;
		for( ; i < size ; i++ )
		{			
			if ( ar[i] == null )
			{
				ar[i] = p;
				count++;
				break;
			}
			if (i == size-1)
				i = 0;

			if (j == 0 )
				break;
			j--;
		}
	}

	public Person get(Person p)
	{
		if( count == 0 )
			throw new IllegalArgumentException();

		return get(p.hashCode());
	}
	public Person get(int xz) // получить элемент по ХэшКоду
	{
		int j = size;
		int i = xz % size;
		Person ret = null;
		for( ; i < size ; i++ )
		{
			if ( xz == ar[i].hashCode())
			{
				ret = ar[i];
				return ret;
			}
			else
			{ 
				i++;
				j--;
			}
			if (j == 0 )
			{
				break;
			}
		}
		return ret ; 
	}

	public void del(Person p)
	{
		if(count == 0)
			throw new IllegalArgumentException();

		del(p.hashCode());
	}
	public void del(int xz) // удаление п ХэшКоду
	{
		ar[xz % size] = null;
		count--;
	}
	public int size()  //размер таблицы
	{
		return count;
	}
	public double pow()  // коэфициент заполненности таблицы
	{
		double z = (int) ( (double) size() / (double) size * 10000);
		double rez = (double) z / 100;
		return rez;
	}
	public Person[] toArray()  // элементы из таблицы в массив
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


	@Override
	public boolean equals(Object obj) 
	{
		HTableLine arnew = (HTableLine) obj; 
		return equalsHashTable(arnew);
	}
	private boolean equalsHashTable (HTableLine arnew)
	{
		if ( ar.length != arnew.ar.length)
		{
			return false;
		}
		boolean ret = true;
		for ( int i = 0 ; i < size ; i ++)
		{
			if ( ar[i] == null && arnew.ar[i] != null)
				continue;
//				ret = false;
			else if ( ar[i] != null && arnew.ar[i] == null)
				ret = false;
//			else if ( ar[i] == null || arnew.ar[i] == null)
//				ret = false;
			else if ( ar[i] != arnew.ar[i] )
				ret = false;
//			else
//				ret = false;
		}
		return ret;
	}


	@Override
	public Iterator<Person> iterator() 
	{
		return (Iterator<Person>) new MyIter(ar, count, size);
	}
	class MyIter implements Iterator<Person>
	{
		Person ar[];
		int count;
		int size;
		int i = 0;
		int returned = 0;

		public MyIter(Person[] ar, int count, int size)
		{
			this.ar = ar;
			this.count = count;		
			this.size = size;	
		}
		@Override
		public boolean hasNext() 
		{
			return returned < count;
		}	
		@Override
		public Person next() 
		{
			Person ret = null;
			for ( ; i < size ; i++)
			{
				if ( ar[i] == null)
				{
					continue;
				}
				else 
				{
					ret = ar[i];
					i++;
					returned++;
					break;
				}
			}
			return ret;
		}		
	}
}