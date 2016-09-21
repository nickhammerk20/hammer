import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class CPanelSecond extends JPanel 
{

	CCommand cmd = null;

	public CPanelSecond( CCommand cmd )
	{
		setBounds(520, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

		CObject p = new CObject(100, 100, 150, 150);
		add(p);
				
		CObject p2 = new CObject(200, 200, 350, 250);
		add(p2);
				
		CObject p3 = new CObject(300, 300, 400, 450);
		add(p3);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);		
	}

//	private void setLayout(CPanelSecond cPanelSecond) 
//	{
//		
//	}
}
