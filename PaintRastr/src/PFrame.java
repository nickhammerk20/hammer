import javax.swing.JFrame;
import javax.swing.UIManager;

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
		
		getContentPane().add (new GenPanel ( cmd ) );
		
		setVisible(true);
	}
}
