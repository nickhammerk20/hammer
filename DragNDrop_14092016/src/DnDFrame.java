import javax.swing.JFrame;

public class DnDFrame extends JFrame 
{
	public DnDFrame()
	{
		setLayout(null);
		setBounds(100, 100, 1050, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add (new PanelLeft() );

		setVisible(true);
	}
}
