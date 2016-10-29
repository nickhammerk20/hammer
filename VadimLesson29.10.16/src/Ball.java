import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;

public class Ball
{
	int x;
	int y;
	int dx;
	int dy;
	int wh;
	Color col = null;
	
	public Ball(int x, int y)
	{
		Random rr = new Random();
		this.x = x;
		this.y = y;
		wh = rr.nextInt(50) + 5;
		dx = rr.nextInt(10) - 5;
		dy = rr.nextInt(10) - 5;
		col = new Color(rr.nextInt(256),rr.nextInt(256),rr.nextInt(256));
	}
	
	public void move(int w, int h)
	{
		if (x <= 0 ||  x+wh >= w)
		{
			dx = -dx;
		}
		
		if (y <= 0 ||  y+wh >= h)
		{
			dy = -dy;
		}
		
		x += dx;
		y += dy;
	}
	
	public void paint(Graphics2D gg) 
	{
		gg.setColor(col);
		gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
		//gg.fillArc(x0, y0, 2*r, 2*r, startAngle, arcAngle);
		//gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF );
		gg.fillOval(x, y, wh, wh);
	}
}
