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
		if(e.getButton()==1 && getComponentAt(e.getPoint())==this)
		{
			add( new BallT(e.getPoint()) );	
		}
		else if(e.getButton()==1 && getComponentAt(e.getPoint())!=this)
		{
			remove(getComponentAt(e.getPoint()));
			repaint();			
		}
		if(e.getButton()==3 && getComponentAt(e.getPoint())!=this)
		{
			BallT b = (BallT) getComponentAt(e.getPoint());
			System.out.println("b.boom();");
			b.boom();
			repaint();
		}
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
