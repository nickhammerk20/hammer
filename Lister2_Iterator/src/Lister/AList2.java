﻿package Lister;

import java.util.Iterator;

import Lister.AList1.MyIter;

public class AList2 implements EList, Iterable<Integer>
{
	int[] ar = new int[20];
	int start = ar.length/2;
	int end = ar.length/2;



	@Override
	public String toString() 
	{
		String str = "";

		for (int i = start; i < end; i++) 
		{
			str += ar[i];
			if(i < end-1)
				str += ",";
		}
		return str;
	}

	@Override
	public void clear() 
	{
		start = ar.length/2;
		end = ar.length/2;
	}

	@Override
	public int size() 
	{
		int ret = 0;
		if (end!=start)
		{
			ret = end-start;
		}
		return ret;
	}

	public int sizeAr()
	{
		return ar.length;
	}
	private void reSize()
	{
		int newSize = (int)((double) ar.length * (double) 1.3) ;
		int[] tmp = new int[newSize];
		int newStart = tmp.length / 2 - ar.length / 2;
		end = newStart + ar.length;
		for (int i = 0; i < ar.length; i++)
		{
			tmp[newStart + i] = ar[i];
		}
		ar = tmp;
		start = newStart;		
	}

	@Override
	public void init(int[] ini) 
	{
		if(ini == null)
		{
			ini = new int[0];
		}			
		//		int dx = ((ini.length % 2 == 0) ? 0 : 1);
		//		start =start - (ini.length/2) - dx;
		//		end = end + (ini.length/2);
		start = ar.length / 2 - ini.length / 2;
		end = start + ini.length;
		for (int i = 0; i < ini.length; i++)
		{ 
			ar[start + i] = ini[i];
		}
	}

	@Override
	public int[] toArray() 
	{
		int[] tmp = new int[size()];
		for (int i = 0; i < size(); i++)
		{
			tmp[i] = ar[start+i];
		}
		return tmp;
	}

	@Override
	public int get(int pos) 
	{
		if(size() == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[start+pos];
		return ret;		
	}

	@Override
	public void set(int pos, int val) 
	{
		if(size() == 0){
			throw new IllegalArgumentException();
		}
		ar[start+pos] = val;		
	}

	@Override
	public int min() 
	{
		return ar[minPos()+start];
	}

	@Override
	public int max() 
	{

		return ar[maxPos()+start];
	}

	@Override
	public int minPos() 
	{
		if(size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int ret = start;		
		for(int i=start; i<end; i++)
		{
			if( ar[ret] > ar[i] )
			{
				ret = i;
			}
		}
		return ret-start;
	}

	@Override
	public int maxPos() 
	{
		if(size() == 0)
		{
			throw new IllegalArgumentException();
		}
		int ret = start;		
		for(int i=start; i<end; i++)
		{
			if( ar[ret] < ar[i] )
			{
				ret = i;
			}
		}
		return ret-start;
	}

	@Override
	public void sort() 
	{
		for (int i = start; i < end-1; i++) 
		{
			for (int j = start; j < end-1; j++) 
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
	public void revers() 
	{
		if (size()==0) {
			return;
		}	
		for (int i=0; size()/2>i ; i++){
			int temp = ar[i+start];
			ar[i+start] = ar[end - i - 1];
			ar[end - i - 1] = temp;
		}

	}

	@Override
	public void halfRevers() 
	{
		if (size()==0) 
		{
			return;
		}
		int dx = (size() % 2==0) ? 0 : 1;
		for (int i=0; i<size()/2 ; i++)
		{
			int temp = ar[start+i];
			ar[start+i] = ar[start+size()/2 + i + dx];
			ar[start+size()/2 + i + dx] = temp;
		}
	}

	@Override
	public int delStart() 
	{
		if( size() == 0)
		{
			throw new IllegalArgumentException();
		}
		return ar[start++];
	}

	@Override
	public int delEnd() 
	{
		if( size() == 0)
		{
			throw new IllegalArgumentException();
		}
		//		String str = "";
		//		for (int i = 0; i < ar.length; i++) 
		//		{
		//			str += ar[i];
		//			if(i < ar.length-1)
		//				str += ",";
		//		}
		//		System.out.println(str);
		//		System.out.println(toString());
		//		System.out.println(size());
		//		System.out.println(end+" data "+ar[end]);
		int ret = ar[end-1];
		end--;
		//		System.out.println(end+" data "+ar[end]);
		//		System.out.println(toString());
		return ret;
	}

	@Override
	public int delPos(int pos) 
	{
		if (pos < 0 || pos>= size())
		{
			throw new	IllegalArgumentException();
		}
		int ret = ar[start+pos]; 

		for (int i = (start+pos); i<end-1; i++){
			ar[i] = ar[i+1];
		}
		end--;
		return ret;
	}

	@Override
	public void addStart(int val) 
	{
		if( start <= 1 )
		{
			reSize();
		}	
		ar[--start]=val;
	}

	@Override
	public void addEnd(int val) 
	{
		if(end >= ar.length-1)
		{
			reSize();
		}
		ar[end++]=val;

	}

	@Override
	public void addPos(int pos, int val) 
	{
		if (pos < 0 || pos> size())
		{
			addStart(val);
		}
		if( start <= 1 && end >= ar.length-1)
		{
			reSize();
		}
		for (int i = end; i>start+pos; i--)
		{
			ar[i] = ar[i-1];
			//			ar[i+1] = ar[i];
		}
		end++;
		ar[start+pos]=val;

	}

	/***********************/
	/*****add Iterator******/
	/***********************/
	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter( ar , start , end );
	}
	class MyIter implements Iterator<Integer>
	{
		int[] ar = null;
		int start;
		int end;

		public MyIter(int[] ar, int start, int end)
		{
			this.ar = ar;
			this.start = start;
			this.end = end;
		}
		@Override
		public boolean hasNext() 
		{
			return start < end;
		}

		@Override
		public Integer next() 
		{
			return ar[start++];
		}

	}
}
