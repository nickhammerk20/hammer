import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CFrame extends JFrame implements DragGestureListener
{	
	public CFrame()
	{
		
		
		setLayout(null);
		setTitle("Cutting Material");
		setBounds(100, 100, 1050, 560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		CCommand cmd = new CCommand();
		
		JLabel txt1 = new JLabel(" Material ");
		JLabel txt2 = new JLabel(" Details ");
		add (txt1);
		add (txt2);
		txt1.setBounds(10, 10, 100, 30);
		txt2.setBounds(520, 10, 600, 30);
		
//		add (new CPanelFirst(cmd) );
		add (new CPanelFirst_OneObject(cmd) );
		add (new CPanelSecond(cmd) );
		

		setVisible(true);
	}

	@Override
	public void dragGestureRecognized(DragGestureEvent dge) 
	{
		// TODO Auto-generated method stub
		
	}
}
