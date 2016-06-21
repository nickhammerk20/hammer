import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TPanel extends JPanel implements MouseListener, MouseMotionListener
{

	int x = 0;
	int y = 0;
	
	BufferedImage bi = new BufferedImage(1200, 600, BufferedImage.TYPE_INT_ARGB);
	
	public TPanel() 
	{
		setLayout(null);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		JMenuBar menuBar = new JMenuBar();
		add(menuBar);
		
		JMenu newMenu = new JMenu("New");
		add(newMenu);
		
		JMenu fileMenu = new JMenu("File");
        add(fileMenu);
		
        JMenuItem openItem = new JMenuItem("Open");
        add(openItem);
        
        						
		JButton width2 = new JButton ("2");
		width2.setBounds(10, 50, 50, 20);
		add(width2);
		
		JButton width3 = new JButton ("5");
		width3.setBounds(10, 75, 50, 20);
		add(width3);
		
		JButton width4 = new JButton ("10");
		width4.setBounds(10, 100, 50, 20);
		add(width4);
		
		JButton colorRed = new JButton ("R");
		colorRed.setForeground(Color.RED);
		colorRed.setBounds(10, 130, 50, 20);
		add(colorRed);
		
		JButton colorGreen = new JButton ("G");
		colorGreen.setForeground(Color.green);
		colorGreen.setBounds(10, 160, 50, 20);
		add(colorGreen);
		
		JButton colorBlue = new JButton ("B");
		colorBlue.setForeground(Color.blue);
		colorBlue.setBounds(10, 190, 50, 20);
		add(colorBlue);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(bi, 0, 0, null);
	}
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setColor(Color.red);
		gg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
		repaint();
	}	
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
}
