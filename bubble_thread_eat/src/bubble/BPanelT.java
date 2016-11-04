package bubble;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BPanelT extends JPanel implements MouseListener
{
//	ArrayList<BBubbleT> bb = new ArrayList<BBubbleT>();
	
	public BPanelT()
	{
		setLayout(null);
		addMouseListener(this);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) 
	{
//		bb.add( new BBubbleT(e.getPoint()) );
		add( new BBubbleT(e.getPoint()) );
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
}
