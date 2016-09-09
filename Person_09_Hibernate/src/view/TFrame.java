package view;
import javax.swing.JFrame;

public class TFrame extends JFrame 
{
	public TFrame()
	{
		setBounds(200, 200, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add( new TPanel() );
		setVisible(true);
	}
}
