import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BallT extends JPanel
{
	int dx;
	int dy;
	Color col = null;

	public BallT(Point p)
	{
		Timer tm = new Timer( 20, new XT() );
		tm.start();

		Random rr = new Random();

		int wh = rr.nextInt(80) + 5;
		setLocation(p);
		setSize(wh, wh);

		dx = rr.nextInt(10) - 5;
		dy = rr.nextInt(10) - 5;
		col = new Color(rr.nextInt(256),rr.nextInt(256),rr.nextInt(256));
	}

	class XT implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			move();
			//repaint();
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
	public void move2()
	{
		int x = getX();
		int y = getY();
		int wh = getWidth();

		JPanel ow = (JPanel) getParent();

		if (x <= 0 ||  x+wh >= ow.getWidth())
		{
			dx = -dx;
		}

		if (y <= 0 ||  y+wh >= ow.getHeight())
		{
			dy = -dy;
		}

		x += dx;
		y += dy;
		setLocation(x, y);
	}


	@Override
	public void paint(Graphics g) 
	{
		//super.paint(g);
		Graphics2D gg = (Graphics2D) g;
		gg.setColor(col);
		//gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
		//gg.fillArc(x0, y0, 2*r, 2*r, startAngle, arcAngle);
		//gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF );
		gg.fillOval(1, 1, getWidth()-2, getHeight()-2);
	}
}
