package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import dal.PersonDAO;
import dal.PersonDAO_Mock;
import view.PDialog;

public class PersonDM extends AbstractTableModel
{
	PersonDAO pd = null;
	ArrayList<Person> pp = null;
	public String titleName = null;
		
	public ActionCreate aCreate = new ActionCreate();
	public ActionRead aRead = new ActionRead();
	public ActionUpdate aUpdate = new ActionUpdate();
	public ActionDelete aDelete = new ActionDelete();

	class ActionCreate implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog dd = new PDialog();	
			titleName = "Create";
			dd.setModal(true);
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
				pd.create(dd.getPerson());
			}
		}		
	}
	class ActionRead implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			pp = pd.read();
			fireTableDataChanged();			
		}		
	}
	class ActionUpdate implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog dd = new PDialog();	
			titleName = "Update";
			dd.setModal(true);
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
				
			}
		}		
	}
	class ActionDelete implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog dd = new PDialog();		
			titleName = "Delete";
			dd.setModal(true);
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
			
			}
		}		
	}
	
	public PersonDM() 
	{
		pd = new PersonDAO_Mock();
		pp = pd.read();
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
	public int getRowCount() 
	{
		return pp.size();
	}

	@Override
	public Object getValueAt(int row, int col) 
	{
		Person p = pp.get(row);
		Object ret = null;

		switch (col)
		{
			case 0: ret = p.id; break;
			case 1: ret = p.fname; break;
			case 2: ret = p.lname; break;
			case 3: ret = p.age; break;
		}
		return ret;
	}

}
