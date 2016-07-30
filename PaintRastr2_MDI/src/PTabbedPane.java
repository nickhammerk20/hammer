import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class PTabbedPane extends JTabbedPane
{
	public PTabbedPane(PCommand cmd) 
	{
		int count = 0;
		setBounds(90, 5, 1000, 500);

		for( int i = 0 ; i < 3; i++ )
		{
		  String str = "Лист " + (++count);
		  PPanel pp = new PPanel(cmd);
		  addTab(str, pp);
		  cmd.pp.add(pp);
		}
		
		for(PPanel i : cmd.pp)
		{
			System.out.println(i);
		}
		setVisible(true);
	}
}
