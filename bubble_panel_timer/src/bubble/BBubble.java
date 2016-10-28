package bubble;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import bubble.BPanel.xt;

public class BBubble extends JPanel
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
	
	public BBubble (int x, int y, BPanel bp)
	{		
		this.x = x;
		this.y = y;
		this.bp = bp;
		r = ( random.nextInt( 20 ) + 5 ) ;
		
		setLayout(null);
		setBounds(x, y, r, r);
		setBackground(Color.BLACK);
		setVisible(true);
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
			setLocation(x, y);
			Graphics2D gr = (Graphics2D) g;
			gr.setColor(colors[pos]);
			gr.fillOval(x, y, r, r);
	}
}
