import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

public class PCommand 
{
	PData pd = new PData();
	PPanel pp = null;

	ActionFileOpen 	aOpen 	= new ActionFileOpen();
	ActionFileSave 	aSave 	= new ActionFileSave();
	ActionColor 	aColor 	= new ActionColor();
	ActionWidth 	aWidth 	= new ActionWidth();

	class ActionFileOpen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JFileChooser fd = new JFileChooser();
			if ( fd.showOpenDialog(pp) == JFileChooser.APPROVE_OPTION)
			{
			}
		}
	}
	class ActionFileSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			JFileChooser fd = new JFileChooser();
			if ( fd.showSaveDialog(pp) == JFileChooser.APPROVE_OPTION)
			{
			}
		}
	}
	class ActionWidth implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
			switch (str)
			{
			case "w1": pd.width = 1;break;
			case "w5": pd.width = 5;break;
			case "w10": pd.width = 10;break;
			}
		}
	}
	class ActionColor implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
			switch (str)
			{
			case "red": pd.color = Color.red; break;
			case "green": pd.color = Color.green; break;
			case "blue": pd.color = Color.blue; break;
			}
//			System.out.println(str);
		}
	}
}
