import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class GenPanel extends JPanel implements MouseListener, MouseMotionListener
{
	public GenPanel( PCommand cmd ) 
	{
		setLayout(null);
		add( new PButton ( cmd ) );
		add( new PTabbedPane( cmd ) );
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}
}
