package Lister;

import java.util.Iterator;

public class AList0 implements EList, Iterable<Integer>
{
	int[] ar = new int[0];
	
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
		ar = new int[0];
	}
	@Override
	public int size()
	{
		return ar.length;
	}
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
			ini = new int[0];
			
		ar = new int[ini.length];
		for (int i = 0; i < ini.length; i++)
		{
			ar[i] = ini[i];
		}
	}
	@Override
	public int[] toArray()
	{
		int[] tmp = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}
	
	@Override
	public void addStart(int val)
	{
		int[] tmp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i+1] = ar[i];
		}
		tmp[0] = val;
		ar = tmp;
	}
	@Override
	public void addEnd(int val)
	{
		int[] tmp = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = ar[i];
		}
		tmp[ar.length] = val;
		ar = tmp;
	}
	@Override
	public void addPos(int pos, int val)
	{
		if(ar == null || pos < 0 || pos > ar.length){
			addStart(val);
		}
		int [] tmp = new int [ar.length+1];
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
				if(ar[j] > ar[j+1])
				{
					int tmp = ar[j];
					ar[j]   = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
	}
	
	@Override
	public int min() 
	{
		return ar[minPos()];
	}
	
	@Override
	public int max() 
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
				if( ar[ret] > ar[i] )
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
				if( ar[ret] < ar[i] )
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
			int temp = ar[i];
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
			int temp = ar[i];
			ar[i] = ar[arrhalf + i];
			ar[arrhalf + i] = temp;
		}
	}
	@Override
	public int get(int pos)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[pos];
		return ret;		
	}
	@Override
	public void set(int pos, int val)
	{
		if(ar.length == 0){
			throw new IllegalArgumentException();
		}
		ar[pos] = val;		
	}
	
	@Override
	public int delStart() 
	{
		if( ar.length == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[0];
		int [] tmp = new int [ar.length-1];
		for (int i = 1; i<ar.length; i++){
			tmp[i-1] = ar[i];
			}
		ar=tmp;
		return ret;		
	}
	@Override
	public int delEnd() 
	{
		if(ar == null || ar.length == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[ar.length-1];
		int [] tmp = new int [ar.length-1];
		for (int i = 0; i<ar.length-1; i++){
			tmp[i] = ar[i];
			}
		ar=tmp;
		return ret;		
	}
	@Override
	public int delPos(int pos)
	{
		if(ar == null || ar.length == 0 || pos < 0|| pos > ar.length){
			throw new IllegalArgumentException();
		}
		int ret = ar[pos];
		int [] tmp = new int [ar.length-1];
		for (int i = 0; i<pos; i++){
			tmp[i] = ar[i];
			}
		for (int i = pos; i<ar.length-1; i++){
			tmp[i] = ar[i+1];
			}
		ar=tmp;
		return ret;			
	}
	
	/***********************/
	/*****add Iterator******/
	/***********************/
	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(ar);
	}
	class MyIter implements Iterator<Integer>
	{
		int[] ar = null;
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
			int ret = ar[i];
			i++;
			return ret;
		}
	}
}
