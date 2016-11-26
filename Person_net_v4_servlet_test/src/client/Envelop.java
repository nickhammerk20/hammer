package client;

import java.util.ArrayList;

import blogic.Person;


public class Envelop 
{
	public Envelop(){}
	
	public Envelop(String cmd, Person p) 
	{
		this.cmd = cmd;
		this.p = p;
	}
	
	public Envelop(ArrayList<Person> lst) 
	{
		pp = lst;
	}
	
	public String cmd = "";
	public Person p = null;
	public ArrayList<Person> pp = null;
}
