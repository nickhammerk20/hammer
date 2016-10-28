package bubble;

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
	Timer t = null;
	
	public BPanel()
	{
		t = new Timer(50, new xt());
		t.start();

		setLayout(null);
		setBounds(10, 10, 540, 540);
		setBackground(Color.WHITE);
		
		addMouseListener(this);
		//setVisible(true);				
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		BBubble newBb = new BBubble(e.getX(), e.getY(), this);
		add(newBb);
		bb.add(newBb);
		//repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}	
	class xt implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			for (BBubble b : bb) 
			{
				b.moveBubble();
			}
		}		
	}
}
