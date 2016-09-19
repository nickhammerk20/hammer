package view;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DnDPanelRight extends JPanel
{
	public DnDPanelRight()
	{
		setLayout(null);
		setBounds(520, 40, 500, 470);
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
		setVisible(true);			
	}
}
