import java.awt.Color;
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

public class CPanelSecond extends JPanel implements
DropTargetListener,   // Для обработки событий приемника перетаскивания
MouseListener,       // Для обработки щелчков мыши
MouseMotionListener  // Для обработки перетаскиваний мыши
{

	CCommand cmd = null;

	public CPanelSecond( CCommand cmd )
	{
		setLayout(null);
		setBounds(520, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));


		new MyDropTargetListener(this);


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

	@Override
	public void dragEnter(DropTargetDragEvent dtde) {}

	@Override
	public void dragExit(DropTargetEvent dte) {}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {}

	@Override
	public void drop(DropTargetDropEvent dtde) {}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {}

	class MyDropTargetListener extends DropTargetAdapter {

		private DropTarget dropTarget;
		private JPanel panel;

		public MyDropTargetListener(JPanel panel) {
			this.panel = panel;

			dropTarget = new DropTarget(panel, DnDConstants.ACTION_COPY, 
					this, true, null);
		}

		@Override
		public void drop(DropTargetDropEvent dtde) 
		{

		}
	}
}
