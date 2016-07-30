package Lister_Generic;

public interface GList<T>
{
	public void  	clear();
	public void  	init(Object[] ini);
	public Object[] toArray();
	public int   	size();

	public void  	addStart(Object val);
	public void  	addEnd(Object val);
	public void  	addPos(int pos, Object val);
	public Object   delStart();
	public Object   delEnd();
	public Object   delPos(int pos);

	public Object   min();
	public Object   max();
	public int  	minPos();
	public int   	maxPos();

	public void  	sort();
	public void  	revers();
	public void  	halfRevers();

	public Object   get(int pos);
	public void  	set(int pos, Object val);
}

