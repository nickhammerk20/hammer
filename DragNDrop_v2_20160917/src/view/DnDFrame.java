package view;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import blogic.DnDCommand;

public class DnDFrame extends JFrame 
{
	public DnDFrame()
	{
		setLayout(null);
		setBounds(50, 50, 1150, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		DnDCommand cmd = new DnDCommand();
		
		add (new DnDButton ( cmd ) );
		add (new DnDPanelLeft( cmd ) );

		setVisible(true);
	}
}
