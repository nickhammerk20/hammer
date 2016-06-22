package firstVersion;

import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Button;
import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TFrame extends JFrame
{
	public TFrame()
	{
		setBounds(100, 100, 1200, 600);
		setTitle("Pain on RASTR");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add (new TPanel() );
		setVisible(true);

//		JMenuBar menuBar = new JMenuBar();
//		
//		JMenu menuFile = new JMenu("File");
//		//JMenu menuView = new JMenu("View");
//
//		JMenuItem item2 = new JMenuItem("Open");
//		JMenuItem item3 = new JMenuItem("Save");
//
//		menuFile.add(menuBar);
//		menuFile.add(menuFile);
//		menuFile.add(menuView);
//		menuFile.add(item1);
//		menuFile.add(item2);
//		menuFile.add(item3);
//				
//		setJMenuBar(menuBar);

		MenuBar mb = new MenuBar();

		Menu mFile = new Menu("File");
		Menu mWidth = new Menu("Width");
		Menu mColor = new Menu("Color");

		MenuItem miSave = new MenuItem("Save");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miClear = new MenuItem("Clear");
		
		MenuItem mw2 = new MenuItem("2");
		MenuItem mw3 = new MenuItem("3");
		MenuItem mw4 = new MenuItem("4");

		MenuItem mcRed = new MenuItem("RED");
		MenuItem mcGreen = new MenuItem("GREEN");
		MenuItem mcBlue = new MenuItem("BLUE");
		
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add("-");
		mFile.add(miClear);
		mWidth.add(mw2);
		mWidth.add(mw3);
		mWidth.add(mw4);
		mColor.add(mcRed);
		mColor.add(mcGreen);
		mColor.add(mcBlue);
		mb.add(mFile);
		mb.add(mWidth);
		mb.add(mColor);
			
		setMenuBar(mb);
				
	}
}
