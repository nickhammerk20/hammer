import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PanelLeft extends JPanel 
{
	public PanelLeft()
	{
		setLayout(null);
		setBounds(10, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		
		DnDObject dd = new DnDObject(100, 100, 300, 300);
		add(dd);		
		
		setVisible(true);				
	}	
}
