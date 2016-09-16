import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class DnDObject extends JPanel implements MouseListener, MouseMotionListener, FocusListener
{
	int x, y;
	int flag;
	public DnDObject (int x, int y, int x2, int y2)
	{
		setBounds(x, y, x2-x, y2-y);
		setBackground(Color.BLACK);

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		flag = 0;
		if( x >= getWidth() - 20 && y > 20 && y < getHeight() - 20 ) 	// right
		{
			flag = 1;
		}
		if( y >= getHeight() - 20 && x > 20 && x < getWidth() - 20 ) 	// down
		{
			flag = 2;
		}
		if( x <= 20 && y > 20 && y < getHeight() - 20 ) 				// left
		{
			flag = 3;
		}
		if( y <= 20 && x > 20 && x < getWidth() - 20 ) 					// up
		{
			flag = 4;
		}
		if( x >= getWidth() - 20 && y < 20 ) 							// right&up
		{
			flag = 5;
		}
		if( x >= getWidth() - 20 && y >= getHeight() - 20) 				// right&down
		{
			flag = 6;
		}
		if( x <= 20 && y >= getHeight() - 20 )							// left&down
		{
			flag = 7;			
		}
		if( x <= 20 && y <= 20 )										// left&up
		{
			flag = 8;			
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{		
		int dx = e.getX() - x;
		int dy =e.getY() - y;
		
		if(flag == 0)
		{
			
			Point p = getLocation();
			p.translate(dx, dy);
			setLocation(p);
		}
		if( flag == 1 ) 			//right 
		{
			Dimension d = getSize();
			d.width = d.width + dx;
			setSize(d);
			x = e.getX();
		}
		if( flag == 2 )				// down
		{
			Dimension d = getSize();
			d.height = d.height + dy;
			setSize(d);
			y = e.getY();
		}
		if( flag == 3 )				// left
		{
			Dimension d = getSize();
			Point p = getLocation();
			p.translate(dx, 0);
			setLocation(p);
			d.width = d.width - dx;
			setSize(d);
		}
		if( flag == 4 )				// up
		{
			Dimension d = getSize();
			Point p = getLocation();
			p.translate(0, dy);
			setLocation(p);
			d.height = d.height - dy;
			setSize(d);
		}
		if( flag == 5 )				// right&up
		{
			Dimension d = getSize();
			Point p = getLocation();
			p.translate(0, dy);
			setLocation(p);
			d.height = d.height - dy;
			d.width = d.width + dx;
			setSize(d);
			x = e.getX();
		}
		if( flag == 6 )				// right&down
		{
			Dimension d = getSize();
			d.height = d.height + dy;
			d.width = d.width + dx;
			setSize(d);
			y = e.getY();
			x = e.getX();
		}
		if( flag == 7 )				// left&down
		{
			Dimension d = getSize();
			Point p = getLocation();
			p.translate(dx, 0);
			setLocation(p);
			d.height = d.height + dy;
			d.width = d.width - dx;
			setSize(d);
			y = e.getY();
		}
		if( flag == 8 )				// left&up
		{
						
			Dimension d = getSize();
			Point p = getLocation();
			p.translate(dx, dy);
			setLocation(p);
			d.height = d.height - dy;
			d.width = d.width - dx;
			setSize(d);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void focusGained(FocusEvent e) {}

	@Override
	public void focusLost(FocusEvent e) {}
}
