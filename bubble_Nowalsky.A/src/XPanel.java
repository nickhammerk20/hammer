import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import org.w3c.dom.events.MouseEvent;

public class XPanel extends JPanel implements MouseListener
{
	public XPanel()
	{
		setLayout(null);
		addMouseListener(this);
		XAction xtr=new XAction();
		xtr.start();

		//		Timer tm = new Timer( 50, new XAction() );
		//		tm.start();
	}

	//	class XAction implements ActionListener
	//	{
	//		@Override
	//		public void actionPerformed(ActionEvent arg0) 
	//		{
	//			for (Component c : getComponents())
	//			{
	//				XBall b = (XBall) c;
	//				b.move();
	//			}
	//
	//		}
	//	}
	class XAction extends Thread 
	{
		public void run() 
		{
			try 
			{
				while(true) 
				{
					Thread.sleep(50);
					for (Component c : getComponents())
					{
						XBall b = (XBall) c;
						Point p=b.getLocation();
						p.translate(b.wh/2, b.wh/2);
						for (Component c2 : getComponents()) 
						{
							XBall b2 = (XBall) c2;
							Point p2=b2.getLocation();
							p2.translate(b2.wh/2, b2.wh/2);
							if(b.equals(b2)==false)
							{
								if (Math.sqrt(Math.pow((p2.x-p.x), 2) + Math.pow((p.y-p2.y), 2)) <= b.wh/2 + b2.wh/2)
								{
									if(b.wh>b2.wh)
									{
//										b.eat(b2);
									}
									else
									{
										b2.dx=-b2.dx;
										b2.dy=-b2.dy;
										System.out.println("boom");
										b2.move();
									}
								}
							}
						}
						b.move();   				
					}
				}
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e)
	{
		if(e.getButton()==1&&getComponentAt(e.getPoint())==this)
		{
			add( new XBall(e.getPoint()));
			repaint();
		}
		else if(e.getButton()==1&&getComponentAt(e.getPoint())!=this)
		{
			remove(getComponentAt(e.getPoint()));
			repaint();
		}
		if(e.getButton()==3&&getComponentAt(e.getPoint())!=this)
		{
			XBall b = (XBall) getComponentAt(e.getPoint());
			b.boom();
			repaint();
		}
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {}
}
