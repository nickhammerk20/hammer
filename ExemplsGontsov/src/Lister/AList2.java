package Lister;

public class AList2 implements EList
{
	int[] ar = new int[30];
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
		ar[--start]=val;
	}

	@Override
	public void addEnd(int val) 
	{
		ar[end++]=val;
		
	}

	@Override
	public void addPos(int pos, int val) 
	{
		if (pos < 0 || pos> size())
		{
			addStart(val);
		}
		for (int i = end; i>start+pos; i--)
		{
			ar[i] = ar[i-1];
//			ar[i+1] = ar[i];
			}
		end++;
		ar[start+pos]=val;
		
	}



}
