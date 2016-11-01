package bubble;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BPanel extends JPanel implements MouseListener
{
	ArrayList<BBubble> bb = new ArrayList<BBubble>();

	public BPanel()
	{
		//		Timer t = new Timer(50, new xt());
		//		t.start();
		xt t = new xt();
		t.start();

		setLayout(null);
		setBounds(10, 10, 540, 540);
		setBackground(Color.WHITE);

		addMouseListener(this);
		setVisible(true);				
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		bb.add(new BBubble(e.getX(), e.getY(), this));
		repaint();
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
						System.out.println("Bubble = "+b + " pos.x = " + b.x + " pos.y = " + b.y);
					}
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