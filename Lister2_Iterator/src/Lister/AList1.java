﻿package Lister;

import java.util.Iterator;

public class AList1 implements EList, Iterable<Integer>
{
	int[] ar = new int[20];
	int index = 0;
	
	@Override
	public String toString() 
	{
		String str = "";
		
		for (int i = 0; i < index; i++) 
		{
			str += ar[i];
			if(i < index-1)
				str += ",";
		}
		return str;
	}
	
	@Override
	public void clear()
	{
		index = 0;
	}
	@Override
	public int size()
	{
		return index;
	}
	
	public int sizeAr()
	{
		return ar.length;
	}
	
	private void reSize()
	{
		int newSize = (int)((double) size() * (double) 1.3) ;
		int[] tmp = new int[newSize];
		for (int i = 0; i < ar.length; i++)
		{
			tmp[i] = ar[i];
		}
		ar = tmp;
	}
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
			ini = new int[0];
		
		if( ini.length >= ar.length)
		{
			reSize();
		}	
			
		for (int i = 0; i < ini.length; i++)
		{
			ar[i] = ini[i];
		}
		index = ini.length;
	}
	@Override
	public int[] toArray()
	{
		int[] tmp = new int[index];
		for (int i = 0; i < index; i++)
		{
			tmp[i] = ar[i];
		}
		return tmp;
	}
	
	@Override
	public void addStart(int val)
	{
		if( ar.length == index)
		{
			reSize();
		}	
		for (int i = index; i >	0; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[0] = val;
		index++;
	}
	@Override
	public void addEnd(int val)
	{
		if( ar.length == index)
		{
			reSize();
		}	
		ar[index++] = val;
//		index++;
	}
	@Override
	public void addPos(int pos, int val)
	{
		if(pos < 0 || pos > index)
		{
			addStart(val);
		}
		if( ar.length == index)
		{
			reSize();
		}	
		for (int i = index++; i>pos; i--)
		{
				ar[i] = ar[i-1];
				}
			ar[pos]=val;
	}
		
	@Override
	public void sort() 
	{
		for (int i = 0; i < index-1; i++) 
		{
			for (int j = 0; j < index-1; j++) 
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
		if (index == 0)
		{
			throw new IllegalArgumentException();
		}
		int ret = 0;
		for(int i=0; i<index; i++)
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
		if (index == 0)
		{
			throw new IllegalArgumentException();
		}
		int ret = 0;
		for(int i=0; i<index; i++)
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
		if (index==0) {
			return;
		}	
		for (int i=0; index/2>i ; i++){
			int temp = ar[i];
			ar[i] = ar[index - i - 1];
			ar[index - i - 1] = temp;
		}
		
	}
	@Override
	public void halfRevers() 
	{
		if (index==0) 
		{
			return;
		}
		int dx = (index % 2==0) ? 0 : 1;
		for (int i=0; index/2>i ; i++){
			int temp = ar[i];
			ar[i] = ar[index/2 + i + dx];
			ar[index/2 + i + dx] = temp;
		}
	}
	@Override
	public int get(int pos)
	{
		if(index == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[pos];
		return ret;		
	}
	@Override
	public void set(int pos, int val)
	{
		if(index == 0){
			throw new IllegalArgumentException();
		}
		ar[pos] = val;		
	}
	@Override
	public int delStart() 
	{
		if( index == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[0];
		//int [] tmp = new int [index-1];
		for (int i = 1; i<index; i++){
			ar[i-1] = ar[i];
			}
		index--;
		return ret;		
	}
	@Override
	public int delEnd() 
	{
		if(ar == null || index == 0){
			throw new IllegalArgumentException();
		}
		int ret = ar[index-1];
		index--;
		return ret;		
	}
	@Override
	public int delPos(int pos)
	{
		if(pos < 0|| pos >= index){
			throw new IllegalArgumentException();
		}
		int ret = ar[pos];
		for (int i = pos; i<index-1; i++){
			ar[i] = ar[i+1];
			}
		index--;
		return ret;			
	}

	/***********************/
	/*****add Iterator******/
	/***********************/
	@Override
	public Iterator<Integer> iterator() 
	{
		return new MyIter(ar, index);
	}
	class MyIter implements Iterator<Integer>
	{
		int[] ar;
		int i;
		int index;
		
		public MyIter(int[] ar, int index)
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
			/**
			 * как вариант тоже рабочее
			 * int ret = ar[i];
			i++; 
			return ret;
			*/
			return ar[i++];
		}
		
	}
}