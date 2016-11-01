import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class BPanelT extends JPanel implements MouseListener
{
	public BPanelT()
	{
		setLayout(null);
		addMouseListener(this);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		add( new BallT(e.getPoint()) );
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
