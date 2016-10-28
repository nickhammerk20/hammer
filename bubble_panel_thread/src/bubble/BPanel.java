package bubble;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BPanel extends JPanel implements MouseListener
{
	public BPanel()
	{
		setLayout(null);
		setBounds(10, 10, 540, 540);
		setBackground(Color.WHITE);

		addMouseListener(this);
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		BBubble b = new BBubble(e.getX(), e.getY(), this);
		add(b);
	}
	@Override
	public void mouseClicked(MouseEvent e) {}	
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}	
}