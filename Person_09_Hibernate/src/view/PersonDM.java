package view;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import blogic.Person;
import dal.PersonDAO;
import dal.PersonDAO_Mock;
import dal.PersonDAO_MySQL;
import dal.PersonDAO_MySQL_Hibernate;

public class PersonDM extends AbstractTableModel
{
	PersonDAO pd = null;
	ArrayList<Person> pp = null;
	
	public PersonDM()
	{
//		pd = new PersonDAO_MySQL();
		pd = new PersonDAO_MySQL_Hibernate();
//		pd = new PersonDAO_Mock();
		
		pp = pd.read();
	}
	
	@Override
	public int getRowCount() 
	{
		return pp.size();
	}

	@Override
	public int getColumnCount() 
	{
		return 4;
	}
	@Override
	public String getColumnName(int col)
	{
		String[] str = {"ID","FName","LName","Age"};
		return str[col];
	}

	@Override
	public Object getValueAt(int row, int col) 
	{
		Person p = pp.get(row);
		Object ret = null;
		
		switch (col)
		{
			case 0: ret = p.id;    break;
			case 1: ret = p.fname; break;
			case 2: ret = p.lname; break;
			case 3: ret = p.age;   break;
		}
		return ret;
	}
}
