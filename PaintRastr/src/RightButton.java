import java.awt.Color;
import java.awt.MenuItem;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RightButton extends JPanel 
{
	public RightButton(int x, int y) 
	{
		setLocation(x, y);
		JTextField cmenu = new JTextField();
		
		MenuItem miSave = new MenuItem("Save");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miClear = new MenuItem("Clear");
		MenuItem mw2 = new MenuItem("2");
		MenuItem mw3 = new MenuItem("3");
		MenuItem mw4 = new MenuItem("4");

		MenuItem mcRed = new MenuItem("RED");
		MenuItem mcGreen = new MenuItem("GREEN");
		MenuItem mcBlue = new MenuItem("BLUE");
		
//		cmenu.add(miOpen);
//		cmenu.add(miSave);
//		cmenu.add("-");
//		cmenu.add(miClear);
//		cmenu.add(mw2);
//		cmenu.add(mw3);
//		cmenu.add(mw4);
//		cmenu.add(mcRed);
//		cmenu.add(mcGreen);
//		cmenu.add(mcBlue);
//		cmenu.add(mFile);
//		cmenu.add(mWidth);
//		cmenu.add(mColor);
	}
}
