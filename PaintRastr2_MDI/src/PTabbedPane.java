import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PTabbedPane extends JTabbedPane
{
	public PTabbedPane(PCommand cmd) 
	{
		int count = 1;
		setBounds(90, 5, 1000, 500);

//		add("Paint 1", new PPanel (cmd));
//		add("Paint 2", new PPanel (cmd));
//		add("Paint 3", new PPanel (cmd));
//		add("Paint 4", new PPanel (cmd));
		
		  String str = "Лист " + (++count);
		  PPanel pp = new PPanel(cmd);
		  addTab(str, pp);
		  cmd.pp.add(pp);

		

		setVisible(true);
	}
}
