import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class CObject extends JPanel implements MouseListener, FocusListener, MouseMotionListener
{
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
	public void focusGained(FocusEvent arg0) 
	{
		setBackground(Color.GREEN);
	}

	@Override
	public void focusLost(FocusEvent arg0) 
	{
		setBackground(Color.BLACK);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		requestFocus();
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {}

	@Override
	public void mouseMoved(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}	

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
