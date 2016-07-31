package Lister_Generic;

public interface PList
{
	public void  	clear();
	public void  	init(Person[] ini);
	public Person[] toArray();
	public int   	size();

	public void  	addStart(Person val);
	public void  	addEnd(Person val);
	public void  	addPos(int pos, Person val);
	public Person   delStart();
	public Person   delEnd();
	public Person   delPos(int pos);

	public Person   min();
	public Person   max();
	public int  	minPos();
	public int   	maxPos();

	public void  	sort();
	public void  	revers();
	public void  	halfRevers();

	public Person   get(int pos);
	public void  	set(int pos, Person val);
}

