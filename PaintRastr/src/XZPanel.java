import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class XZPanel extends JPanel implements MouseListener, MouseMotionListener
{

	int x = 0;
	int y = 0;
	
	BufferedImage bi = new BufferedImage(1200, 600, BufferedImage.TYPE_INT_ARGB);
	
	public XZPanel() 
	{
		setLayout(null);
		setBounds(70, 0, 1110, 540);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.drawImage(bi, 0, 0, null);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if (e.getButton() == MouseEvent.BUTTON3)
		{
			RightButton p = new RightButton(e.getX(), e.getY());
			add(p);		
			repaint();
		}		
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
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}

}
