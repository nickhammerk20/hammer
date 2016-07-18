import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PMenu extends JMenuBar 
{
	public PMenu(PCommand cmd) 
	{
		JMenu mFile = new JMenu("File");
		JMenuItem mfSave = new JMenuItem("Save");
		JMenuItem mfOpen = new JMenuItem("Open");		

		JMenu mWidth = new JMenu("Width");
		JMenuItem mw1 = new JMenuItem("Width 1");
		JMenuItem mw5 = new JMenuItem("Width 5");
		JMenuItem mw10 = new JMenuItem("Width 10");		
		mw1.setActionCommand("w1");
		mw5.setActionCommand("w5");
		mw10.setActionCommand("w10");

		JMenu mColor = new JMenu("Color");
		JMenuItem mcRed = new JMenuItem("Color RED");
		JMenuItem mcGreen = new JMenuItem("Color GREEN");
		JMenuItem mcBlue = new JMenuItem("Color BLUE");
		mcRed.setActionCommand("red");
		mcGreen.setActionCommand("green");
		mcBlue.setActionCommand("blue");

		mfOpen.addActionListener(cmd.aOpen);
		mfSave.addActionListener(cmd.aSave);

		mw1.addActionListener(cmd.aWidth);
		mw5.addActionListener(cmd.aWidth);
		mw10.addActionListener(cmd.aWidth);

		mcRed.addActionListener(cmd.aColor);
		mcGreen.addActionListener(cmd.aColor);
		mcBlue.addActionListener(cmd.aColor);

		mFile.add(mfOpen);
		mFile.add(mfSave);

		mWidth.add(mw1);
		mWidth.add(mw5);
		mWidth.add(mw10);

		mColor.add(mcRed);
		mColor.add(mcGreen);
		mColor.add(mcBlue);

		add(mFile);
		add(mWidth);
		add(mColor);
	}
}
