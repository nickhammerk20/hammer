import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

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
				//System.out.println("Bubble = "+b + " pos.x = " + b.x + " pos.y = " + b.y + " dx = " + b.dx + " dy = " + b.dy + " direction " + b.dirExp);
				for (Ball bb : pp)
				{
					if(cgeckExpansion(b, bb))
						expansion(cgeckExpansion(b, bb ));
				}
			}
			repaint();
		}
		
		private boolean cgeckExpansion(Ball b1, Ball b2)
		{
			if (b1 == b2)
				return false;
			
			int r1 = b1.wh/2;
			int r2 = b2.wh/2;
			int cx1 = b1.x + r1;
			int cy1 = b1.y + r1;
			int cx2 = b2.x + r2;
			int cy2 = b2.y + r2;
			return ( (Math.pow(r1 + r2, 2)) > (Math.pow(cx1 - cx2, 2) + Math.pow(cy1 - cy2, 2) )) ? true : false;
		}
		public void expansion(boolean bool)
		{
			System.out.println("*****=>"+bool);
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
