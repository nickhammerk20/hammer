import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PContext extends JPopupMenu
{
	public PContext(PCommand cmd) 
	{
		JMenuItem mw1 = new JMenuItem("Width 1");
		JMenuItem mw5 = new JMenuItem("Width 5");
		JMenuItem mw10 = new JMenuItem("Width 10");		
		mw1.setActionCommand("w1");
		mw5.setActionCommand("w5");
		mw10.setActionCommand("w10");
		
		JMenuItem mcRed = new JMenuItem("Color RED");
		JMenuItem mcGreen = new JMenuItem("Color GREEN");
		JMenuItem mcBlue = new JMenuItem("Color BLUE");
		mcRed.setActionCommand("red");
		mcGreen.setActionCommand("green");
		mcBlue.setActionCommand("blue");
		
		mw1.addActionListener(cmd.aWidth);
		mw5.addActionListener(cmd.aWidth);
		mw10.addActionListener(cmd.aWidth);
		
		mcRed.addActionListener(cmd.aColor);
		mcGreen.addActionListener(cmd.aColor);
		mcBlue.addActionListener(cmd.aColor);
		
		add(mw1);
		add(mw5);
		add(mw10);
		addSeparator();
		add(mcRed);
		add(mcGreen);
		add(mcBlue);
	}
}
