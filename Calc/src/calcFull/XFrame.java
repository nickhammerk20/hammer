package calcFull;

import javax.swing.JFrame;

public class XFrame extends JFrame
{
	public XFrame() 
	{
		setTitle("Калькулятор Full");
		setBounds(200, 200, 330, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add( new Xpanel() );
		
		setVisible(true);
	}
}
