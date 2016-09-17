import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class CObject extends JPanel implements MouseListener, FocusListener, MouseMotionListener
{
	private Point old;
	private int x, y;
	public CObject (int x, int y, int x2, int y2)
	{
		setBounds(x, y, x2-x, y2-y);
		setBackground(Color.BLACK);
		addMouseListener(this);
		addFocusListener(this);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
	}

	@Override
	public void focusGained(FocusEvent e) 
	{
		setBackground(Color.GREEN);
	}

	@Override
	public void focusLost(FocusEvent e) 
	{
		setBackground(Color.BLACK);
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		requestFocus();
		x = e.getX();
		y = e.getY();
		old = e.getPoint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		int dx = e.getX() - x;
		int dy =e.getY() - y;
		
		Point p = getLocation();
		p.translate(dx, dy);
		setLocation(p);
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}	
	@Override
	public void mouseReleased(MouseEvent e) {}
}
