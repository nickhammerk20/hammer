package bubble;

import javax.swing.JFrame;

public class BFrame extends JFrame 
{
	public BFrame()
	{
		setLayout(null);
		setBounds(50, 50, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new BPanel());
		
		setVisible(true);
	}
}
