package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import dal.PersonDAO;
import dal.PersonDAO_Mock;
import view.PDialog;
import view.PPanel;

public class PersonDM extends AbstractTableModel
{
	PersonDAO pd = null;
	ArrayList<Person> pp = null;
	PPanel ppGen = null;
	public String titleName = "";
	public int row;

	public ActionCreate aCreate = new ActionCreate();
	public ActionRead aRead = new ActionRead();
	public ActionUpdate aUpdate = new ActionUpdate();
	public ActionDelete aDelete = new ActionDelete();

	class ActionCreate implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{			
			PDialog dd;
			try {
				dd = new PDialog();
				
			dd.setTitle("Create");
			dd.setModal(true);
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
				pd.create(dd.getPerson());
				pp = pd.read();
				fireTableDataChanged();	
				System.out.println("start OK - Create");
			}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
			PDialog dd;
			try {
				dd = new PDialog();
			
			System.out.println("запустили - ActionUpdate");
			dd.setTitle("Update");
			dd.setModal(true);
			
			int i = row;
			Person p = null;
			System.out.println(i);
			if ( i >= 0)
			{
				p = pp.get(i);
				dd.setPerson(p);
				System.out.println("input "+p.id +" "+ p.fname +" "+ p.lname +" "+ p.age);
			}
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
				System.out.println("start OK - Update");
				pd.update(dd.getPerson());
				System.out.println("output "+p.id +" "+ p.fname +" "+ p.lname +" "+ p.age);
				System.out.println("Обновление ActionUpdate после нажатия OK");
				pp = pd.read();
				fireTableDataChanged();	
			}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}		
	}
	class ActionDelete implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PDialog dd;
			try {
				dd = new PDialog();
			
			System.out.println("запустили - ActionDelete");
			dd.setTitle("Delete");
			dd.setModal(true);
			
			int i = row;
			Person p = null;
			System.out.println(i);
			if ( i >= 0)
			{
				p = pp.get(i);
				dd.setPerson(p);
				System.out.println("input "+p.id +" "+ p.fname +" "+ p.lname +" "+ p.age);
			}
			dd.setVisible(true);
			if(dd.ret.equals("Ok"))
			{
				System.out.println("start OK - Delete");
				pd.delete(dd.getPerson());
				System.out.println("Обновление ActionDelete после нажатия OK");
				
				pp = pd.read();
				fireTableDataChanged();	
			}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}		
	}

	public PersonDM(PPanel pPanel) 
	{
		pd = new PersonDAO_Mock();
		pp = pd.read();
	}

	@Override
	public int getColumnCount() 
	{		
		return 5;
	}

	@Override
	public String getColumnName(int col) 
	{
		String[] str = {"ID","FName","LName","Age","telNumber"};
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
		case 4: ret = p.telNumber;break;
		}
		return ret;
	}

}
