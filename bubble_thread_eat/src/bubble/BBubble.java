package bubble;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class BBubble
{
	final Random random = new Random();
	int x;
	int y;
	int r;
	int dx = random.nextInt( 21 ) - 10 ;
	int dy = random.nextInt( 21 ) - 10 ;
	BPanel bp = null;
	Color colors[] = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, 
			Color.CYAN, Color.DARK_GRAY, Color.ORANGE, Color.YELLOW, Color.RED};
	int pos = random.nextInt(colors.length);
	boolean kill = false;
	
	public BBubble (int x, int y, BPanel bp)
	{
		this.x = x;
		this.y = y;
		this.bp = bp;
		r = ( random.nextInt( 50 ) + 20 ) ;
	}
	public void moveBubble()
	{
		if(x <= 0 || x + r >= bp.getWidth())
			dx = -dx;
		if(y <= 0 || y + r >= bp.getHeight())
			dy = -dy;
		
		x += dx;
		y += dy;
	}

	public boolean checkExpansion(BBubble bb)
	{
//		if (b == bb)
//			return false;

		int r1 = r/2;
		int r2 = bb.r/2;
		int cx1 = x + r1;
		int cy1 = y + r1;
		int cx2 = bb.x + r2;
		int cy2 = bb.y + r2;
		return ( (Math.pow(r1 + r2, 2)) > (Math.pow(cx1 - cx2, 2) + Math.pow(cy1 - cy2, 2) )) ? true : false;
	}
	
	public void eat(BBubble bb)
	{
		System.out.println("*****=>"+ bb);
		if( r > bb.r)
		{
			r += bb.r;
			bb.kill();
		}
	}
	public void kill()
	{
		r = 0;
		x = 0;
		y = 0;
		dx = 0;
		dy = 0;
		kill = true;
	}
	
	public void paint(Graphics2D g) 
	{
			Graphics2D gr = (Graphics2D) g;
			gr.setColor(colors[pos]);
			gr.fillOval(x, y, r, r);
	}
}
