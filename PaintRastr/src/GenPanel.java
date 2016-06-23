import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GenPanel extends JPanel implements MouseListener, MouseMotionListener
{
	public GenPanel( PCommand cmd) 
	{
		setLayout(null);
		add( new PPanel( cmd ) );

		JButton width2 = new JButton ("2");
		width2.setBounds(10, 50, 50, 20);
		add(width2);

		JButton width3 = new JButton ("5");
		width3.setBounds(10, 75, 50, 20);
		add(width3);

		JButton width4 = new JButton ("10");
		width4.setBounds(10, 100, 50, 20);
		add(width4);

		JButton colorRed = new JButton ("R");
		colorRed.setForeground(Color.RED);
		colorRed.setBounds(10, 130, 50, 20);
		add(colorRed);

		JButton colorGreen = new JButton ("G");
		colorGreen.setForeground(Color.green);
		colorGreen.setBounds(10, 160, 50, 20);
		add(colorGreen);

		JButton colorBlue = new JButton ("B");
		colorBlue.setForeground(Color.blue);
		colorBlue.setBounds(10, 190, 50, 20);
		add(colorBlue);
		
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
