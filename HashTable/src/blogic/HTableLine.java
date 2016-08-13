package blogic;

import java.util.Arrays;
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
		return ret ; // ar[xz % size];
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



	public boolean equals(Person[] arnew) 
	{
		for ( int i = 0 ; i < size ; i++ )
		{
			if ( ar[i] == null && arnew[i] == null)
				return true;
			else if ( ar[i] == null || arnew[i] == null)
				return false;
			else if ( ar[i] == arnew[i] )
				return true;
			else
				return false;
		}
		return true;
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
		int i;
		int returned;

		public MyIter(Person[] ar, int count, int size)
		{
			this.ar = ar;
			this.count = count;		
			this.size = size;	
		}
		@Override
		public boolean hasNext() 
		{
			//			return returned < count;
			return i < size;
		}	
		@Override
		public Person next() 
		{
			//			Person ret = ar[i];
			//			if( ret == null)
			//			{
			//				i++;
			//			}
			//			else
			//			{
			//			returned++;
			//			ret = ar[i];
			//			}

			Person ret; 
			if ( ar[i] == null)
			{
				i++;
			}
			else 
			{
				ret = ar[i];
				i++;
			}			

			//			Person ret = ar[i];
			//			i++;
			return ret;
		}		
	}
}