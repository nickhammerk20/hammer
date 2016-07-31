package Lister_Generic;

import java.util.Iterator;

public class GList0<T> implements GList<T>
{
	public Object[] ar = new Comparable[0];

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
		ar = new Comparable[0];
	}
	@Override
	public int size()
	{
		return ar.length;
	}
	@Override
	public void  init (T[] ini)
	{
		if(ini == null)
			return;
//			ini = new Comparable[0];

		ar = new Comparable[ini.length];
		for (int i = 0; i < ini.length; i++)
		{
			ar[i] = (Comparable) ini[i];
		}
	}
	@Override
	public T[] toArray()
	{
		Comparable[] tmp = new Comparable[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = (Comparable) ar[i];
		}
		return (T[]) tmp;
	}

	@Override
	public void addStart(T val)
	{
		Comparable[] tmp = new Comparable[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i+1] = (Comparable) ar[i];
		}
		tmp[0] = (Comparable) val;
		ar = tmp;
	}
	@Override
	public void addEnd(T val)
	{
		Comparable[] tmp = new Comparable[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = (Comparable) ar[i];
		}
		tmp[ar.length] = (Comparable) val;
		ar = tmp;
	}
	@Override
	public void addPos(int pos, T val)
	{
		if(ar == null || pos < 0 || pos > ar.length){
			addStart(val);
		}
		Comparable [] tmp = new Comparable [ar.length+1];
		for (int i = 0; i<pos; i++){
			tmp[i] = (Comparable) ar[i];
		}
		for (int i = pos; i<ar.length; i++){
			tmp[i+1] = (Comparable) ar[i];
		}
		tmp[pos]=(Comparable) val;
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

				if( -1 == ((Comparable) ar[j]).compareTo(ar[j+1]))
				{
					T tmp = (T) ar[j];
					ar[j]   = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
	}

	@Override
	public T min() 
	{
		return (T) ar[minPos()];
	}
	@Override
	public T max() 
	{
		return (T) ar[maxPos()];
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
			T temp = (T) ar[i];
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
			T temp = (T) ar[i];
			ar[i] = ar[arrhalf + i];
			ar[arrhalf + i] = temp;
		}
	}
	@Override
	public T get(int pos)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		T ret = (T) ar[pos];
		return ret;		
	}
	@Override
	public void set(int pos, T val)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		ar[pos] = val;		
	}

	@Override
	public T delStart() 
	{
		if( ar.length == 0){
			throw new IllegalArgumentException();
		}
		T ret = (T) ar[0];
		Comparable [] tmp = new Comparable [ar.length-1];
		for (int i = 1; i<ar.length; i++){
			tmp[i-1] = (Comparable) ar[i];
		}
		ar=tmp;
		return ret;		
	}
	@Override
	public T delEnd() 
	{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException();
		}
		T ret = (T) ar[ar.length-1];
		Comparable [] tmp = new Comparable [ar.length-1];
		for (int i = 0; i<ar.length-1; i++){
			tmp[i] = (Comparable) ar[i];
		}
		ar=tmp;
		return ret;		
	}
	@Override
	public T delPos(int pos)
	{
		if(ar == null || ar.length == 0 || pos < 0|| pos > ar.length){
			throw new IllegalArgumentException();
		}
		T ret = (T) ar[pos];
		Comparable [] tmp = new Comparable[ar.length-1];
		for (int i = 0; i<pos; i++){
			tmp[i] = (Comparable) ar[i];
		}
		for (int i = pos; i<ar.length-1; i++){
			tmp[i] = (Comparable) ar[i+1];
		}
		ar=tmp;
		return ret;			
	}
}
