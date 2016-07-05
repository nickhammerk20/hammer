package dal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFileChooser;

import blogic.Person;

public class PersonDAO_CSV implements PersonDAO 
{
	ArrayList<Person> pp = null;
//	PersonDAO pd = null;
//	
//	public ActionFileSave fSave = new ActionFileSave();
//	public ActionFileOpen fOpen = new ActionFileOpen();
//	
//	class ActionFileSave implements ActionListener
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) 
//		{
//			JFileChooser fd = new JFileChooser();
//			if ( fd.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
//			{
//				System.out.println("пришли к сохранению файла");
//				//pd.print(pp);
//			}
//		}
//	}
//	
//	class ActionFileOpen implements ActionListener
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) 
//		{
//			JFileChooser fd = new JFileChooser();
//			if ( fd.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
//			{
//				System.out.println("пришли к открытию файла");
//			
//			}
//		}
//	}

	@Override
	public void create(Person p) 
	{
				
	}

	@Override
	public ArrayList<Person> read() 
	{
		
		return null;
	}

	@Override
	public void update(Person p) 
	{
				
	}

	@Override
	public void delete(Person p) 
	{
				
	}
	
	public void print(ArrayList<Person> pp)
	{
		for (Person p : pp) 
		{
			System.out.println( p );
		}
	}
	
	public String fileSave(ArrayList<Person> pp)
	{
		String str = "";
		for (Person p : pp) 
		{
			str +=p.id + ", " + p.fname + ", " + p.lname + ", " + p.age + ", " + p.telNumber+"\n";
		}
		System.out.println(str);
		return str;
	}
}
