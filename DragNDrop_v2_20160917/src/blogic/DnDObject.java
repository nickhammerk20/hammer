package blogic;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DnDObject extends JPanel implements MouseListener, MouseMotionListener, FocusListener
{
	DnDData data = new DnDData();
	
	int x, y;
	int flag, flag2; 
	
	public DnDObject (int x, int y, int x2, int y2)//, DnDCommand cmd)
	{
//		this.data = cmd.data;
		
		setBounds(x, y, x2-x, y2-y);
		setBackground(data.color);
		setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.BLACK), 
				BorderFactory.createLineBorder(Color.WHITE)));
		addMouseListener(this);
		addMouseMotionListener(this);
		addFocusListener(this);
	}

	@Override
	public Dimension preferredSize() 
	{
		Dimension ret = getSize();
		ret.width = getWidth();
		ret.height = getHeight();
		return ret;
	}

	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		if(flag2==1)
		{
			Graphics2D gr = (Graphics2D) g;
			gr.setColor(Color.BLACK);
			Dimension d = getSize();

			gr.fillRect(0, 0, 10, 10);
			gr.fillRect(d.width-10, d.height-10, 10, 10);
			gr.fillRect(d.width-10, 0, 10, 10);
			gr.fillRect(0, d.height-10, 10, 10);

			gr.fillRect(0, d.height/2-5, 10, 10);
			gr.fillRect(d.width/2-5, 0, 10, 10);
			gr.fillRect(d.width-10, d.height/2-5, 10, 10);
			gr.fillRect(d.width/2-5, d.height-10, 10, 10);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		requestFocus();
		x = e.getX();
		y = e.getY();
		flag = 0;
		if( x < 0 && x > getWidth() && y < 0 && y > getHeight())
			lostFocus(null, getBackground());
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
	public void mouseMoved(MouseEvent e) 
	{
			int x = e.getX();
			int y = e.getY();

			if( x > 20 && x < getWidth() - 20 && y > 20 && y < getHeight() - 20 ) 	// center
					setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
			else if (x > getWidth() - 20 && y > 20 && y < getHeight() - 20) // right ( 1 ) east
					setCursor(Cursor.getPredefinedCursor(Cursor.E_RESIZE_CURSOR));
			else if (y >= getHeight() - 20 && x > 20 && x < getWidth() - 20) // down ( 2 ) south
					setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
			else if (x <= 20 && y > 20 && y < getHeight() - 20) // left ( 3 ) west
					setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
			else if( y <= 20 && x > 20 && x < getWidth() - 20 ) 					// up ( 4 ) north
					setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
			else if( x >= getWidth() - 20 && y < 20 ) 							// right&up ( 5 ) NorthhEast
					setCursor(Cursor.getPredefinedCursor(Cursor.NE_RESIZE_CURSOR));
			else if( x >= getWidth() - 20 && y >= getHeight() - 20) 				// right&down ( 6 ) SouthEast
					setCursor(Cursor.getPredefinedCursor(Cursor.SE_RESIZE_CURSOR));
			else if( x <= 20 && y >= getHeight() - 20 )							// left&down ( 7 ) SouthWest
					setCursor(Cursor.getPredefinedCursor(Cursor.SW_RESIZE_CURSOR));
			else if( x <= 20 && y <= 20 )										// left&up ( 8 ) NorthWest
					setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void focusGained(FocusEvent e) 
	{
		flag2 = 1;
		setBackground(Color.GREEN);
		e.getComponent().requestFocus();
	}

	@Override
	public void focusLost(FocusEvent e) 
	{
		flag2 = 0;
		setBackground(data.color);
	}
}
