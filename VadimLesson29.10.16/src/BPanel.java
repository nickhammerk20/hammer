import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.Border;

public class BPanel extends JPanel implements MouseListener
{
	ArrayList<Ball> pp = new ArrayList<Ball>();

	public BPanel()
	{
		Timer tm = new Timer( 50, new XT() );
		tm.start();
		
		addMouseListener(this);
	}
	
	class XT implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			for (Ball b : pp) 
			{
				b.move(getWidth(), getHeight());
			}
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		pp.add( new Ball(e.getX(), e.getY()) );
	}

	@Override
	public void paint(Graphics g)
	{
		super.paint(g);	
		Graphics2D gg = (Graphics2D) g;

		for (Ball p : pp)
		{	
			p.paint(gg);	
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
}
