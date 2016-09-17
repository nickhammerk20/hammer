import java.awt.Color;
import java.awt.Point;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class CPanelFirst_OneObject extends JPanel implements MouseListener, MouseMotionListener,
DragGestureListener,  	// Для распознавания начала перетаскивания
DragSourceListener		// Для обработки событий источника перетаскивания
{
	int i = 0;
	CCommand cmd = null;
	CObject p = null;	
	private Point old;
	
	public CPanelFirst_OneObject( CCommand cmd )
	{
		setLayout(null);
		setBounds(10, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

//		addMouseListener(this);
//		addMouseMotionListener(this);
		
		DragSource ds = new DragSource();
//		ds.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY, this);
		
		p = new CObject(100, 100, 150, 150);
//		p.addMouseListener(this);
//		p.addMouseMotionListener(this);
	
		add(p);
		cmd.p = p;
		cmd.obj.add(p);
		
		CObject p2 = new CObject(200, 200, 350, 250);
		add(p2);
		cmd.obj.add(p2);
		
		CObject p3 = new CObject(300, 300, 400, 450);
		add(p3);
		cmd.obj.add(p3);
		
		setVisible(true);		
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
//		old = e.getPoint();		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
//		CObject p = new CObject(x, y, e.getX(), e.getY());
		//		CObjMove ml = new CObjMove();
		//		p.addMouseListener((MouseListener) ml);
		//		p.addMouseMotionListener((MouseMotionListener) ml);

//		MoveListener ml = new MoveListener();
//		p.addMouseListener(ml);
//		p.addMouseMotionListener(ml);		
//		add(p);	
//		obj.add(p);
//		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) 
	{
//		p.setLocation(p.getX() + e.getX() - (int)old.getX(), p.getY() + e.getY() - (int)old.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

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