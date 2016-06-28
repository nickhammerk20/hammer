import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class PFrame extends JFrame
{
	public PFrame()
	{
		setTitle("Pain on VECTOR");
		setBounds(100, 100, 1110, 603);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		PCommand cmd = new PCommand();
		setJMenuBar(new PMenu ( cmd ) );
		add (new PToolBar ( cmd ) );		
		
		add (new GenPanel ( cmd ) );
		
		setVisible(true);
	}
}
