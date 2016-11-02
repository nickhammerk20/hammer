import javax.swing.JFrame;

public class XFrame extends JFrame 
{
	public XFrame() 
	{
		setTitle("My GUI App");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add( new XPanel());
		setVisible(true);
	}
}
