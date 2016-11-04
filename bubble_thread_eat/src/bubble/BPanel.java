package bubble;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BPanel extends JPanel implements MouseListener
{
	ArrayList<BBubble> bb = new ArrayList<BBubble>();

	public BPanel()
	{
		xt t = new xt();
		t.start();

		addMouseListener(this);
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		bb.add(new BBubble(e.getX(), e.getY(), this));
	}
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		for (BBubble b : bb) 
		{
			b.paint(g2);
		}

	}
	@Override
	public void mouseClicked(MouseEvent e) {}	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}	

	class xt extends Thread
	{
		@Override
		public void run()
		{
			try {
				while(true)
				{
					for (BBubble b : bb) 
					{
						b.moveBubble();
						for (BBubble b2 : bb)
						{
							if( b != b2)
							{
								if(b.checkExpansion(b2))
								{
									System.out.println("+ expansion" );
									b.eat(b2);
								}
							}
						}
					}
//					for (BBubble b : bb) 
//					{
//						if(b.kill)
//							bb.remove(b);
//					}
					repaint();
					Thread.sleep(50);					
				}
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}	

		}
	}
}