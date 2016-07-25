import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class PToolBar extends JToolBar
{
	public PToolBar( PCommand cmd ) 
	{
		setSize(1200, 40);
		JButton mw1 = new JButton("Width 1");
		JButton mw5 = new JButton("Width 5");
		JButton mw10 = new JButton("Width 10");		
		mw1.setActionCommand("w1");
		mw5.setActionCommand("w5");
		mw10.setActionCommand("w10");

		JButton mcRed = new JButton("Color RED");
		JButton mcGreen = new JButton("Color GREEN");
		JButton mcBlue = new JButton("Color BLUE");
		mcRed.setActionCommand("red");
		mcGreen.setActionCommand("green");
		mcBlue.setActionCommand("blue");

		mw1.addActionListener(cmd.aWidth);
		mw5.addActionListener(cmd.aWidth);
		mw10.addActionListener(cmd.aWidth);

		mcRed.addActionListener(cmd.aColor);
		mcGreen.addActionListener(cmd.aColor);
		mcBlue.addActionListener(cmd.aColor);

		mcRed.setForeground(Color.red);
		mcGreen.setForeground(Color.green);
		mcBlue.setForeground(Color.blue);

		add(mw1);
		add(mw5);
		add(mw10);
		addSeparator();
		add(mcRed);
		add(mcGreen);
		add(mcBlue);
	}
}
