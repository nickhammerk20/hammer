package view;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import blogic.DnDCommand;
import blogic.DnDData;
import blogic.DnDObject;

public class DnDPanelLeft extends JPanel implements MouseListener, MouseMotionListener
{
	int x = 0;
	int y = 0;
	DnDData data = null;
	ArrayList<JPanel> obj = new ArrayList<JPanel>();
	
	public DnDPanelLeft( DnDCommand cmd )
	{
		this.data = cmd.data;
		cmd.panelLeft = this;
		
		setLayout(null);
		setBounds(110, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
//		DnDObject d = new DnDObject(100, 100, 300, 300, cmd);
//		add(d);	
//		DnDObject dd = new DnDObject(5, 5, 50, 50, cmd);
//		add(dd);	
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		
		setVisible(true);				
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		requestFocus();
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		DnDCommand cmd = new DnDCommand();
		DnDObject p = new DnDObject(x, y, e.getX(), e.getY());
		add(p);	
		obj.add(p);
		repaint();
	}	

	@Override
	public void mouseDragged(MouseEvent arg0) {}

	@Override
	public void mouseMoved(MouseEvent arg0) {}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}	
}
