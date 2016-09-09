package view;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TPanel extends JPanel
{

	public TPanel()
	{
		setLayout(null);
		
		PersonDM dm = new PersonDM();
		JTable tbl = new JTable(dm);
		JScrollPane scr = new JScrollPane(tbl);
		scr.setBounds(10, 10, 400, 400);
		add( scr );
	}

}
