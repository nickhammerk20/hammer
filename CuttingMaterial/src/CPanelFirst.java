import java.awt.Color;
import java.awt.Point;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CPanelFirst extends JPanel implements MouseListener, MouseMotionListener, FocusListener,
DragGestureListener,  	// Для распознавания начала перетаскивания
DragSourceListener		// Для обработки событий источника перетаскивания
{
	int x = 0;
	int y = 0;
	int i;
	ArrayList<JPanel> obj = new ArrayList<JPanel>();
	JPanel p = null;

	public CPanelFirst( CCommand cmd )
	{
		setLayout(null);
		setBounds(10, 40, 500, 470);
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
			if (i == 0 )
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

	@Override
	public void dragDropEnd(DragSourceDropEvent arg0) {}

	@Override
	public void dragEnter(DragSourceDragEvent arg0) {}

	@Override
	public void dragExit(DragSourceEvent arg0) {}

	@Override
	public void dragOver(DragSourceDragEvent arg0) {}

	@Override
	public void dropActionChanged(DragSourceDragEvent arg0) {}

	@Override
	public void dragGestureRecognized(DragGestureEvent arg0) {}

}