package bubble;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class BBubble
{
	int x;
	int y;
	int r = 20;
	int dx = 5;
	int dy = 5;
	BPanel bp = null;
	
	public BBubble (int x, int y, BPanel bp)
	{
		this.x = x;
		this.y = y;
		this.bp = bp;
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

	public void paint(Graphics2D g) 
	{
			Graphics2D gr = (Graphics2D) g;
			gr.setColor(Color.BLACK);
			gr.fillOval(x, y, r, r);
	}
}
