
import javax.swing.JFrame;

public class TFrame extends JFrame
{
	public TFrame()
	{
		setBounds(100, 100, 1200, 600);
		setTitle("Pain on Vector");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add (new TPanel() );
		setVisible(true);
	}
}
