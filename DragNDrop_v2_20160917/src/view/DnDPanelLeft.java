package view;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import blogic.DnDCommand;
import blogic.DnDData;
import blogic.DnDObject;

public class DnDPanelLeft extends JPanel implements MouseListener, MouseMotionListener
{
	
	DnDData data = null;
	
	public DnDPanelLeft( DnDCommand cmd )
	{
		this.data = cmd.data;
		cmd.panelLeft = this;
		
		setLayout(null);
		setBounds(110, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
		DnDObject d = new DnDObject(100, 100, 300, 300, cmd);
		add(d);	
		DnDObject dd = new DnDObject(5, 5, 50, 50, cmd);
		add(dd);	
		
		
		
		
		setVisible(true);				
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

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}	
}
