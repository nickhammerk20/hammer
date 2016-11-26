package view;
import javax.swing.JFrame;

public class PFrame extends JFrame
{
	public PFrame()
	{
		setTitle("Person");
		setBounds(100, 100, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add (new PPanel());
		
		setVisible(true);
	}
}
