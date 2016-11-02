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
		wh = rr.nextInt(50) + 20;
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
	
	public void expansion(String direction)
	{
		System.out.println("****************"+direction);
		if(dx > 0 && dy > 0)
			dx = -dx;
		if(dx < 0 && dy > 0)
			;
		if(dx < 0 && dy < 0)
			;
		if(dx > 0 && dy < 0)
			;
		if(dx == 0 && dy > 0)
			;
		if(dx < 0 && dy == 0)
			;
		if(dx == 0 && dy < 0)
			;
		if(dx > 0 && dy == 0)
			;
//		if (direction == "north")
//		{
//			System.out.println(direction);
////			dx = -dx;
//		}		
//		if (direction == "east")
//		{
//			System.out.println(direction);
////			dy = -dy;
//		}
//		if (direction == "west")
//		{
//			System.out.println(direction);
////			dx = -dx;
//		}		
//		if (direction == "south")
//		{
//			System.out.println(direction);
////			dy = -dy;
//		}
	}
	
	
	public void paint(Graphics2D gg) 
	{
		gg.setColor(col);
		gg.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
		gg.fillOval(x, y, wh, wh);
	}
}
