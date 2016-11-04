package bubble;

import javax.swing.JFrame;

public class BFrame extends JFrame 
{
	public BFrame()
	{
		setBounds(50, 50, 580, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new BPanel());
		
		setVisible(true);
	}
}
