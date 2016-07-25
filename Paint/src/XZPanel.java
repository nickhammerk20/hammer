import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class XZPanel extends JPanel implements MouseListener, FocusListener, KeyListener
{
	String str = "";
	
	public XZPanel(Point p) 
	{
		setLocation(p);
		setSize(100, 100);
		setBackground(Color.yellow);
		addMouseListener(this);
		addFocusListener(this);
		addKeyListener(this);
	}
	public XZPanel(int x, int y, int x2, int y2) 
	{
		setBounds(x, y, x2-x, y2-y);
		setBackground(Color.yellow);
		addMouseListener(this);
		addFocusListener(this);
		addKeyListener(this);
	}

	@Override
	public void focusGained(FocusEvent e) 
	{
		setBackground(Color.red);
	}

	@Override
	public void focusLost(FocusEvent e) 
	{
		setBackground(Color.yellow);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.drawString(str, 10, 40);
		if(isFocusOwner() == true)
		{
//			Graphics2D gg = (Graphics2D) g;
			gg.drawOval(5, 5, getWidth()-5, getHeight()-5);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) 
	{
		str += e.getKeyChar();
		repaint();
//		Graphics2D gg = (Graphics2D) getGraphics();
//		gg.drawOval(5, 5, getWidth()-5, getHeight()-5);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		requestFocus();
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
	
	@Override
	public void keyReleased(KeyEvent e) {}
		
}
