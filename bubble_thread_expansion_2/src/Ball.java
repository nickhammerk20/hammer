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
	String dirExp;
	
	public Ball(int x, int y)
	{
		Random rr = new Random();
		this.x = x;
		this.y = y;
		wh = rr.nextInt(100) + 50;
		dx = rr.nextInt(20) - 10;
		dy = rr.nextInt(20) - 10;
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
		dirExp = direction(dx, dy);
		x += dx;
		y += dy;
	}
	public static String direction(int dx, int dy)
	{
		String ret = "";
		if(dx > 0 && dy > 0)
			ret = "SouthEast";
		if(dx < 0 && dy > 0)
			ret = "SouthWest";
		if(dx < 0 && dy < 0)
			ret = "NorthWest";
		if(dx > 0 && dy < 0)
			ret = "NorthEast";
		if(dx == 0 && dy > 0)
			ret = "North";
		if(dx < 0 && dy == 0)
			ret = "West";
		if(dx == 0 && dy < 0)
			ret = "South";
		if(dx > 0 && dy == 0)
			ret = "East";
		return ret;
	}
	
	public boolean collision(Ball bb)
	{
//		System.out.println("**************** "+dirExp+" ***** " +bb);
		float xd = x - bb.x;
	    float yd = y - bb.y;
	    
	    float sumRadius = getRadius() + bb.getRadius();
	    float sqrRadius = sumRadius * sumRadius;
	    
	    float distSqr = (xd * xd) + (yd * yd);
	    
	    if (distSqr <= sqrRadius)
	    {
	        return true;
	    }

	    return false;
	}
	public void expansion(Ball bb) 
	{
		float r = getRadius() + bb.getRadius();
		//float dist2 = delta.dot(delta);

	}
	public float getRadius() {
		return wh/2;
	} 
	
	public void paint(Graphics2D gg) 
	{
		gg.setColor(col);
		gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
		gg.fillOval(x, y, wh, wh);
	}
}
