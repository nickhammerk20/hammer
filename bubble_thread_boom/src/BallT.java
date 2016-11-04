import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JPanel;

public class BallT extends JPanel
{
	int dx;
	int dy;
	Color col = null;
	int wh;

	public BallT(Point p)
	{
		XT tm = new XT();
		tm.start();

		Random rr = new Random();

		wh = rr.nextInt(80) + 20;
		setLocation(p);
		setSize(wh, wh);

		dx = rr.nextInt(10) - 5;
		dy = rr.nextInt(10) - 5;
		col = new Color(rr.nextInt(256),rr.nextInt(256),rr.nextInt(256));
	}

	class XT extends Thread
	{
		@Override
		public void run() 
		{
			try {
				while(true)
				{
					move();	
					Thread.sleep(50);
				}
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}			
		}
	}


	public void move()
	{
		Point p = getLocation();
		int wh = getWidth();

		JPanel ow = (JPanel) getParent();

		if (p.x <= 0 ||  p.x+wh >= ow.getWidth())
		{
			dx = -dx;
		}

		if (p.y <= 0 ||  p.y+wh >= ow.getHeight())
		{
			dy = -dy;
		}

		p.translate(dx, dy);
		setLocation(p);
	}
	public void boom() 
	{
		Point p = getLocation();
		BallT b = (BallT) getParent().getComponentAt(p);
		for (int i = 0; i <= 7; i++) 
		{
			BallT newb = new BallT(p);
			newb.col = b.col;
			newb.wh = b.wh/2;
			getParent().add(newb);
		}
		getParent().remove(b);
	}

	@Override
	public void paint(Graphics g) 
	{
		Graphics2D gg = (Graphics2D) g;
		gg.setColor(col);
		gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF );
		gg.fillOval(1, 1, getWidth()-2, getHeight()-2);
	}
}
