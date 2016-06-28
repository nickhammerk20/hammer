import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PPanel extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 0;
	int y = 0;
	Color color = Color.black;
	Point z = null;
	PData pd = new PData();
	
	ArrayList<PLine> pp = new ArrayList<PLine>();

	public PPanel(PCommand cmd) 
	{		
		addMouseListener(this);
		addMouseMotionListener(this);
		
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
		for (PLine x : pp)
		{
			x.paint(gg);
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
		PLine p = new PLine(x, y, e.getX(), e.getY(), pd.color, pd.width);
		
//		p.color = pd.color;
//		p.width = pd.width;
		
		x = e.getX();
		y = e.getY();
						
		pp.add(p);
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