package Lister_Generic;

public class PList0 implements PList
{
	public Person[] ar = new Person[0];

	@Override
	public String toString() 
	{
		String str = "";

		for (int i = 0; i < ar.length; i++) 
		{
			str += ar[i];
			if(i < ar.length-1)
				str += ",";
		}
		return str;
	}
	@Override
	public void clear()
	{
		ar = new Person[0];
	}
	@Override
	public int size()
	{
		return ar.length;
	}
	@Override
	public void init(Person[] ini)
	{
		if(ini == null)
			ini = new Person[0];

		ar = new Person[ini.length];
		for (int i = 0; i < ini.length; i++)
		{
			ar[i] = ini[i];
		}
	}
	@Override
	public Person[] toArray()
	{
		Person[] tmp = new Person[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}

	@Override
	public void addStart(Person val)
	{
		Person[] tmp = new Person[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i+1] = ar[i];
		}
		tmp[0] = val;
		ar = tmp;
	}
	@Override
	public void addEnd(Person val)
	{
		Person[] tmp = new Person[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = ar[i];
		}
		tmp[ar.length] = val;
		ar = tmp;
	}
	@Override
	public void addPos(int pos, Person val)
	{
		if(ar == null || pos < 0 || pos > ar.length){
			addStart(val);
		}
		Person [] tmp = new Person [ar.length+1];
		for (int i = 0; i<pos; i++){
			tmp[i] = ar[i];
		}
		for (int i = pos; i<ar.length; i++){
			tmp[i+1] = ar[i];
		}
		tmp[pos]=val;
		ar=tmp;
	}

	@Override
	public void sort() 
	{
		for (int i = 0; i < ar.length-1; i++) 
		{
			for (int j = 0; j < ar.length-1; j++) 
			{
//				if(ar[j] > ar[j+1])
//				Comparable a1 = (Comparable) ar[j];
//				Comparable a2 = (Comparable) ar[j+1];
//				if( -1 == a1.compareTo(a2))
				if( -1 == ar[j].compareTo(ar[j+1]))
				{
					Person tmp = ar[j];
					ar[j]   = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public Person min() 
	{
		return ar[minPos()];
	}

	@Override
	public Person max() 
	{
		return ar[maxPos()];
	}
	@Override
	public int minPos() 
	{
		if (size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int ret = 0;
		for(int i=0; i<ar.length; i++)
		{
//			if( ar[ret] > ar[i] )
			{
				ret = i;
			}
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
		int ret = 0;
		for(int i=0; i<ar.length; i++)
		{
//			if( ar[ret] < ar[i] )
			{
				ret = i;
			}
		}
		return ret;
	}
	@Override
	public void revers() 
	{
		if (ar.length==0) {
			return;
		}	
		for (int i=0; ar.length/2>i ; i++){
			Person temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = temp;
		}

	}
	@Override
	public void halfRevers() 
	{
		if (ar.length==0) 
		{
			return;
		}
		int arrlength = ar.length/2;
		int arrhalf = ar.length - arrlength;
		for (int i=0; arrlength>i ; i++){
			Person temp = ar[i];
			ar[i] = ar[arrhalf + i];
			ar[arrhalf + i] = temp;
		}
	}
	@Override
	public Person get(int pos)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		Person ret = ar[pos];
		return ret;		
	}
	@Override
	public void set(int pos, Person val)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		ar[pos] = val;		
	}

	@Override
	public Person delStart() 
	{
		if( ar.length == 0){
			throw new IllegalArgumentException();
		}
		Person ret = ar[0];
		Person [] tmp = new Person [ar.length-1];
		for (int i = 1; i<ar.length; i++){
			tmp[i-1] = ar[i];
		}
		ar=tmp;
		return ret;		
	}
	@Override
	public Person delEnd() 
	{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException();
		}
		Person ret = ar[ar.length-1];
		Person [] tmp = new Person [ar.length-1];
		for (int i = 0; i<ar.length-1; i++){
			tmp[i] = ar[i];
		}
		ar=tmp;
		return ret;		
	}
	@Override
	public Person delPos(int pos)
	{
		if(ar == null || ar.length == 0 || pos < 0|| pos > ar.length){
			throw new IllegalArgumentException();
		}
		Person ret = ar[pos];
		Person [] tmp = new Person [ar.length-1];
		for (int i = 0; i<pos; i++){
			tmp[i] = ar[i];
		}
		for (int i = pos; i<ar.length-1; i++){
			tmp[i] = ar[i+1];
		}
		ar=tmp;
		return ret;			
	}
}
