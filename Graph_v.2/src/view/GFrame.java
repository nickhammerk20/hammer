package view;

import javax.swing.JFrame;

public class GFrame extends JFrame
{
	public GFrame()
	{
		setBounds(100, 100, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add (new GPanel() );
		setVisible(true);
	}
}
