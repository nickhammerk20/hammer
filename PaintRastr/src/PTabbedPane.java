import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class PTabbedPane extends JTabbedPane
{
	public PTabbedPane(PCommand cmd) 
	{
		setBounds(100, 100, 1200, 600);
		JTabbedPane jtp = new JTabbedPane();

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.add(new PPanel ( cmd ));		
		panel2.add(new PPanel ( cmd ));	
		
		jtp.add("Tab 1", panel1);
		jtp.add("Tab 2", panel2);
 
		add(jtp);
		setVisible(true);
						
	}
}
