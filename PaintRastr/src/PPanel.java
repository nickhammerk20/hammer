import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{

	int x = 0;
	int y = 0;
	PData pd = null;
	
	BufferedImage bi = new BufferedImage(1200, 600, BufferedImage.TYPE_INT_RGB);
	
	public PPanel(PCommand cmd) 
	{
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setBackground(Color.white);
		gg.fillRect(0, 0, 1000, 500);
		
		this.pd = cmd.pd;
		cmd.pp = this;
		
		setComponentPopupMenu( new PContext(cmd) );
		setLayout(null);
		setBounds(70, 0, 1110, 500);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
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
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseDragged(MouseEvent e)
	{
		Graphics2D gg = (Graphics2D) bi.getGraphics();
		gg.setStroke(new BasicStroke( pd.width ));
		gg.setColor( pd.color );
		gg.drawLine(x, y, e.getX(), e.getY());
		x = e.getX();
		y = e.getY();
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}

}
