import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PMenu extends JMenuBar 
{
	public PMenu() 
	{
		JMenu mFile = new JMenu("File");
		JMenuItem mfSave = new JMenuItem("Save");
		JMenuItem mfOpen = new JMenuItem("Open");		
		
		JMenu mWidth = new JMenu("Width");
		JMenuItem mw1 = new JMenuItem("Width 1");
		mw1.setActionCommand("w1");
		JMenuItem mw5 = new JMenuItem("Width 5");
		mw1.setActionCommand("w5");
		JMenuItem mw10 = new JMenuItem("Width 10");		
		mw1.setActionCommand("w10");
		
		JMenu mColor = new JMenu("Color");
		JMenuItem mcRed = new JMenuItem("Color RED");
		mcRed.setActionCommand("RED");
		JMenuItem mcGreen = new JMenuItem("Color GREEN");
		mcGreen.setActionCommand("Green");
		JMenuItem mcBlue = new JMenuItem("Color BLUE");
		mcBlue.setActionCommand("Blue");
		
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
