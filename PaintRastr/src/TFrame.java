
import javax.swing.JFrame;

public class TFrame extends JFrame
{
	public TFrame()
	{
		setTitle("Pain on RASTR");
		setBounds(100, 100, 1200, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setJMenuBar(new PMenu() );
		
		add (new TPanel() );
		setVisible(true);
	}
}
