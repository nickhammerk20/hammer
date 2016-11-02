import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class XBall extends JPanel 
{

	int dx = 0;
	int dy = 0;
	int wh=30;
	Color col = null;
	public XBall(Point p) 
	{
		setLocation(p);
		setSize(wh, wh);
		Random r = new  Random();
		dx = r.nextInt(20) - 10;
		dy = r.nextInt(20) - 10;
		col = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));

	}
	@Override
	public void paint(Graphics g) 
	{
		g.setColor(col);
		g.fillOval(1, 1, wh-2, wh-2);
	}
	public void move() 
	{
		Point p = getLocation();
		if( p.x <= 0 || p.x+30 >= getParent().getWidth() )
		{
			dx = -dx;
		}
		if( p.y <= 0 || p.y+30 >= getParent().getHeight() )
		{
			dy = -dy;
		}
		p.translate(dx, dy);
		setLocation(p);
	}
	public void boom()
	{
		Point p = getLocation();
		XBall bb= (XBall) getParent().getComponentAt(p);
		for (int i = 0; i < 8; i++) 
		{
			XBall b=new XBall(p);
			b.wh=10;
			b.col=bb.col;
			getParent().add(b);
		}
		getParent().remove(bb);
	}
	public void eat(XBall victim)
	{
		Point p = getLocation();
		XBall bb= (XBall) getParent().getComponentAt(p);
		XBall b=new XBall(p);
		b.wh=bb.wh+victim.wh;
		b.col=bb.col;
		getParent().add(b);
		getParent().remove(victim);
	}
}
