import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DragExample extends JFrame
{
	final private JPanel panel;

	public DragExample()
	{
		this.setLayout(null);

		setBounds(100, 100, 600, 600);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(Color.BLUE);

		MoveListener ml = new MoveListener();
		panel.addMouseListener(ml);
		panel.addMouseMotionListener(ml);
		panel.setSize(new Dimension(100, 100));

		this.add(panel);
		this.setVisible(true);
	}

	public static void main(String[] args) 
	{
		new DragExample();
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
			panel.setLocation(panel.getX() + e.getX() - (int)old.getX(), panel.getY() + e.getY() - (int)old.getY());
//			old = e.getPoint(); - тормозит весь процесс
		}
	}
}
