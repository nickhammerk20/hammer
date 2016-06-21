package calc_mini;

import javax.swing.JFrame;

public class XFrame extends JFrame
{
	public XFrame() 
	{
		setTitle("Калькулятор 23.05.16");
		setBounds(200, 200, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add( new Xpanel() );
		
		setVisible(true);
	}
}
