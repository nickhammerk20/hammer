import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class PCommand 
{
	PData pd = new PData();
	PTabbedPane tp = null;
	
	ArrayList<PPanel> pp = new ArrayList<PPanel>();

	ActionFileOpen 	aOpen 	= new ActionFileOpen();
	ActionFileSave 	aSave 	= new ActionFileSave();
	ActionColor 	aColor 	= new ActionColor();
	ActionWidth 	aWidth 	= new ActionWidth();

	
	
	class ActionFileOpen implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				int i = tp.getSelectedIndex();
				PPanel p = pp.get(i);
				JFileChooser fd = new JFileChooser();
				if ( fd.showOpenDialog(p) == JFileChooser.APPROVE_OPTION)
				{
					p.bi = ImageIO.read(fd.getSelectedFile());
					p.repaint();
				}
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
	}

	class ActionFileSave implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				int i = tp.getSelectedIndex();
				PPanel p = pp.get(i);
				JFileChooser fd = new JFileChooser();
				if ( fd.showSaveDialog(p) == JFileChooser.APPROVE_OPTION)
				{
					ImageIO.write(p.bi, "jpg", fd.getSelectedFile());
				}
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
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
			case "w1": pd.width = 1; break;
			case "w5": pd.width = 5; break;
			case "w10": pd.width = 10; break;
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
		}
	}
}
