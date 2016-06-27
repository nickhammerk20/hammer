import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GenPanel extends JPanel implements MouseListener, MouseMotionListener
{
	public GenPanel( PCommand cmd ) 
	{
		setLayout(null);
//		add( new PPanel( cmd ) );
		add( new PTabbedPane( cmd ) );
		
		JButton width1 = new JButton ("1");
		width1.setBounds(10, 50, 50, 20);
		width1.setActionCommand("w1");
		width1.addActionListener(cmd.aWidth);
		add(width1);

		JButton width5 = new JButton ("5");
		width5.setBounds(10, 75, 50, 20);
		width5.setActionCommand("w5");
		width5.addActionListener(cmd.aWidth);
		add(width5);

		JButton width10 = new JButton ("10");
		width10.setBounds(10, 100, 50, 20);
		width10.setActionCommand("w10");
		width10.addActionListener(cmd.aWidth);
		add(width10);

		JButton colorRed = new JButton ("R");
		colorRed.setForeground(Color.RED);
		colorRed.setBounds(10, 130, 50, 20);
		colorRed.setActionCommand("red");
		colorRed.addActionListener(cmd.aColor);
		add(colorRed);

		JButton colorGreen = new JButton ("G");
		colorGreen.setForeground(Color.green);
		colorGreen.setBounds(10, 160, 50, 20);
		colorGreen.setActionCommand("green");
		colorGreen.addActionListener(cmd.aColor);
		add(colorGreen);

		JButton colorBlue = new JButton ("B");
		colorBlue.setForeground(Color.blue);
		colorBlue.setBounds(10, 190, 50, 20);
		colorBlue.setActionCommand("blue");
		colorBlue.addActionListener(cmd.aColor);
		add(colorBlue);
		
		JButton bLoad = new JButton ("L");
		bLoad.setBounds(10, 230, 50, 20);
		bLoad.setActionCommand("blue");
		bLoad.addActionListener(cmd.aOpen);
		add(bLoad);
		
		JButton bSave = new JButton ("S");
		bSave.setBounds(10, 260, 50, 20);
		bSave.setActionCommand("blue");
		bSave.addActionListener(cmd.aSave);
		add(bSave);
		
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
