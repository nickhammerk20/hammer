import javax.swing.JFrame;

public class PFrame extends JFrame
{
	public PFrame()
	{
		setTitle("Pain on RASTR");
		setBounds(100, 100, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		PCommand cmd = new PCommand();
		setJMenuBar(new PMenu ( cmd ) );
				
		add (new PToolBar ( cmd ) );
		add (new GenPanel( cmd ) );
		
		setVisible(true);
	}
}
