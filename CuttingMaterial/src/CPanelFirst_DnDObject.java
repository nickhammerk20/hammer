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

public class CPanelFirst_DnDObject extends JPanel 
{
	int i = 0;
	CCommand cmd = null;
		
	public CPanelFirst_DnDObject( CCommand cmd )
	{
		setLayout(null);
		setBounds(10, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		
		DnDObject p = new DnDObject(100, 100, 150, 150);
		add(p);
				
		DnDObject p2 = new DnDObject(200, 200, 350, 250);
		add(p2);
				
		DnDObject p3 = new DnDObject(300, 300, 400, 450);
		add(p3);
				
		setVisible(true);		
		
	}
}