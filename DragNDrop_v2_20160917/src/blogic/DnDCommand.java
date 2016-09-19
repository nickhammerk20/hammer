package blogic;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DnDPanelLeft;

public class DnDCommand 
{

	public DnDData data = new DnDData();
	public DnDPanelLeft panelLeft= null;
	
	public ActionFileOpen 	aOpen 	= new ActionFileOpen();
	public ActionFileSave 	aSave 	= new ActionFileSave();
	public ActionColor 		aColor 	= new ActionColor();
	public ActionWidth 		aWidth 	= new ActionWidth();
	public ActionType 		aType 	= new ActionType();

	
	
	class ActionFileOpen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
		}
	}

	class ActionFileSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
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
			case "w1": data.width = 1; break;
			case "w5": data.width = 5; break;
			case "w10": data.width = 10; break;
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
			case "red": data.color = Color.red; break;
			case "green": data.color = Color.green; break;
			case "blue": data.color = Color.blue; break;
			case "BLACK": data.color = Color.BLACK; break;
			}
		}
	}	
	class ActionType implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String str = e.getActionCommand();
			switch (str)
			{
			case "square": data.type = 1; break;
			case "rSq": data.type = 2; break;
			case "sircle": data.type = 3; break;
			case "line": data.type = 4; break;
			}
		}
	}	
}
