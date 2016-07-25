package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;

import dal.PersonDAO;
import dal.PersonDAO_CSV;
import dal.PersonDAO_JSON;
import dal.PersonDAO_Mock;
import dal.PersonDAO_XML;
import dal.PersonDAO_YAML;
import view.PDialog;
import view.PPanel;

public class PersonDM extends AbstractTableModel
{
	PersonDAO pd = null;
//	PersonDAO_CSV pdFile = null;
	PersonDAO_JSON pdFile = new PersonDAO_JSON();
//	PersonDAO_XML pdFile = new PersonDAO_XML();
//	PersonDAO_YAML pdFile = new PersonDAO_YAML();
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
					System.out.println("ќбновление ActionUpdate после нажати¤ OK");
					pp = pd.read();
					fireTableDataChanged();	
				}
			} catch (ParseException ex) {
				ex.printStackTrace();
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
					System.out.println("ќбновление ActionDelete после нажати¤ OK");

					pp = pd.read();
					fireTableDataChanged();	
				}
			} catch (ParseException ex) {
				ex.printStackTrace();
			}
		}		
	}

	public ActionFileSave fSave = new ActionFileSave();
	public ActionFileOpen fOpen = new ActionFileOpen();

	class ActionFileSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			FileNameExtensionFilter filterCSV = new FileNameExtensionFilter("CSV files","csv");
			FileNameExtensionFilter filterXML = new FileNameExtensionFilter("XML files","XML");
			FileNameExtensionFilter filterJSON = new FileNameExtensionFilter("JSON files","JSON");
			FileNameExtensionFilter filterYAML = new FileNameExtensionFilter("YAML files","YAML");
			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(filterXML);
			fc.setFileFilter(filterJSON);
			fc.setFileFilter(filterYAML);
			fc.setFileFilter(filterCSV);
			if ( fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
			{
				System.out.println("сохран¤ем файл");
				try	( FileWriter fw = new FileWriter(fc.getSelectedFile() ) )
				{
					fw.write(pdFile.fileSave(pp));
					System.out.println("***сохранение завершено***");
				} 
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
		}
	}

	class ActionFileOpen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JFileChooser fd = new JFileChooser();
			if ( fd.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			{
				System.out.println("пришли к открытию файла");
				
			}
		}
	}

	public PersonDM(PPanel pPanel) 
	{
		pd = new PersonDAO_Mock();
//		pdFile = new PersonDAO_CSV(); 
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
