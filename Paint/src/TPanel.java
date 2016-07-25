

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TPanel extends JPanel implements MouseListener, MouseMotionListener
{

	int x = 0;
	int y = 0;
	Point z = null;

	public TPanel() 
	{
		setLayout(null);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
		z = e.getPoint();
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{
//		Graphics2D gg = (Graphics2D) getGraphics();
//		gg.drawLine(x, y, e.getX(), e.getY());
//		x = e.getX();
//		y = e.getY();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) 
	{
//		Graphics2D gg = (Graphics2D) getGraphics();
//		gg.drawLine(x, y, e.getX(), e.getY());
		XZPanel p = new XZPanel(x, y, e.getX(), e.getY());
		add(p);		
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mouseMoved(MouseEvent e) {}
}
