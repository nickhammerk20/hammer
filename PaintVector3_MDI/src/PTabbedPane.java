import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PTabbedPane extends JTabbedPane
{

	public PTabbedPane(PCommand cmd) 
	{
		setBounds(90, 5, 1000, 500);
		add("Paint 1", new PPanel (cmd));
		add("Paint 2", new PPanel (cmd));
		setVisible(true);
	}
}
