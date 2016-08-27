import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class CObjMove 
{
	Point old;
	ArrayList<JPanel> obj = null;
	int i;
	
	class MoveListener extends MouseAdapter 
	{
		

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
			JPanel p = obj.get(i);
			p.setLocation(p.getX() + e.getX() - (int)old.getX(), p.getY() + e.getY() - (int)old.getY());
			
//			panelSmal.setLocation(panelSmal.getX() + e.getX() - (int)old.getX(), panelSmal.getY() + e.getY() - (int)old.getY());
//			panelMidle.setLocation(panelMidle.getX() + e.getX() - (int)old.getX(), panelMidle.getY() + e.getY() - (int)old.getY());
//			panelBig.setLocation(panelBig.getX() + e.getX() - (int)old.getX(), panelBig.getY() + e.getY() - (int)old.getY());
		}
	}

}
