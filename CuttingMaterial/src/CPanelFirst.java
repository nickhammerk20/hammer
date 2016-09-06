import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.PortableInterceptor.RequestInfo;

public class CPanelFirst extends JPanel implements MouseListener, MouseMotionListener, FocusListener
{
	int x = 0;
	int y = 0;
	int i;
	ArrayList<JPanel> obj = new ArrayList<JPanel>();
	JPanel p = null;

	public CPanelFirst()
	{
		setLayout(null);
		setBounds(10, 10, 500, 500);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		addMouseListener(this);
		addMouseMotionListener(this);

		setVisible(true);				
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		x = e.getX();
		y = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		CObject p = new CObject(x, y, e.getX(), e.getY());
		//		CObjMove ml = new CObjMove();
		//		p.addMouseListener((MouseListener) ml);
		//		p.addMouseMotionListener((MouseMotionListener) ml);

		MoveListener ml = new MoveListener();
		p.addMouseListener(ml);
		p.addMouseMotionListener(ml);		
		add(p);	
		obj.add(p);
		repaint();
	}

	class MoveListener extends MouseAdapter 
	{
		private Point old;

		@Override
		public void mousePressed(MouseEvent e) 
		{
			super.mousePressed(e);
			old = e.getPoint();
		}
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			super.mouseDragged(e);
			//			int i = requestFocus();//getSelectedIndex();
			if (i >= 0 )
			{
				JPanel p = obj.get(i);
				p.setLocation(p.getX() + e.getX() - (int)old.getX(), p.getY() + e.getY() - (int)old.getY());
			}
		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void focusGained(FocusEvent e) 
	{
		i = 0;
	}
	@Override
	public void focusLost(FocusEvent e) 
	{
		i = 1;
	}

}